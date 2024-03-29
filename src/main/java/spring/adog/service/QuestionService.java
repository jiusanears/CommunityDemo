package spring.adog.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.adog.dto.PaginationDTO;
import spring.adog.dto.QuestionDTO;
//import spring.adog.exception.CustomizeErrorCode;
//import spring.adog.exception.CustomizeException;
import spring.adog.exception.CustomizeErrorCode;
import spring.adog.exception.CustomizeException;
import spring.adog.mapper.QuestionExtMapper;
import spring.adog.mapper.QuestionMapper;
import spring.adog.mapper.UserMapper;
import spring.adog.model.Question;
import spring.adog.model.QuestionExample;
import spring.adog.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionExtMapper questionExtMapper;

    //封装offset
    public Integer getOffset(Integer page,Integer size,PaginationDTO pagination){
        //数据库的判断
        if (page < 1){
            page = 1;
        }
        if (page > pagination.getTotalPage()){
            page = pagination.getTotalPage();
        }

        Integer offset = size*(page-1);
        return offset;
    }

    //封装QuestionDTOList
    public List<QuestionDTO> getQuestionDTOList(List<Question> questions){
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.selectByPrimaryKey(question.getCREATORID());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUSER(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }

    public PaginationDTO list(Integer page, Integer size) {

        PaginationDTO pagination = new PaginationDTO();
        QuestionExample example = new QuestionExample();
        Integer count = (int) questionMapper.countByExample(example);
        pagination.setPagination(count,page,size);

        Integer offset = getOffset(page,size,pagination);
        QuestionExample paginationExample = new QuestionExample();
        paginationExample.setOrderByClause("GMTCREATE DESC");
        List<Question> questions = questionMapper.selectByExampleWithRowbounds(paginationExample,new RowBounds(offset,size ));
        List<QuestionDTO> questionDTOList = getQuestionDTOList(questions);
        pagination.setData(questionDTOList);
        return pagination;
    }

    /**
     * 根据userId做分页查询
     * @param userId
     * @param page
     * @param size
     * @return
     */
    public PaginationDTO list(Long userId, Integer page, Integer size) {
        PaginationDTO pagination = new PaginationDTO();
        QuestionExample example = new QuestionExample();
        example.createCriteria()
                .andCREATORIDEqualTo(userId);
        Integer count = (int)questionMapper.countByExample(example);
        pagination.setPagination(count,page,size);

        Integer offset = getOffset(page,size,pagination);

        QuestionExample paginationByIdExample = new QuestionExample();
        paginationByIdExample.createCriteria()
                .andCREATORIDEqualTo(userId);
        List<Question> questions = questionMapper.selectByExampleWithRowbounds(paginationByIdExample,new RowBounds(offset,size));
        List<QuestionDTO> questionDTOList = getQuestionDTOList(questions);
        pagination.setData(questionDTOList);
        return pagination;
    }

    public QuestionDTO getQuestionById(Long id) {
        QuestionDTO questionDTO = new QuestionDTO();
        Question question = questionMapper.selectByPrimaryKey(id);
        if (question == null){
            throw new CustomizeException(CustomizeErrorCode.QUESTION_NOT_FOUND);
        }
        BeanUtils.copyProperties(question,questionDTO);
        User user = userMapper.selectByPrimaryKey(question.getCREATORID());
        questionDTO.setUSER(user);
        return questionDTO;
    }

    public void createOrUpdate(Question question) {
        if (question.getID() == null){
            //创建
            question.setGMTCREATE(System.currentTimeMillis());
            question.setGMTMODIFIED(question.getGMTCREATE());
            question.setVIEW_COUNT(0);
            question.setLIKE_COUNT(0);
            question.setCOMMENT_COUNT(0);
            questionMapper.insert(question);
        }else {
            //更新
            Question record = new Question();
            record.setGMTMODIFIED(System.currentTimeMillis());
            record.setTITLE(question.getTITLE());
            record.setDESCRIPTION(question.getDESCRIPTION());
            record.setTAG(question.getTAG());

            QuestionExample example = new QuestionExample();
            example.createCriteria()
                    .andIDEqualTo(question.getID());
            int update = questionMapper.updateByExampleSelective(record, example);
            if (update != 1){
                throw new CustomizeException(CustomizeErrorCode.QUESTION_NOT_FOUND);
            }
        }
    }

    public void incView(Long id) {
        Question record = new Question();
        record.setID(id);
        record.setVIEW_COUNT(1);
        questionExtMapper.incView(record);
    }

    public List<QuestionDTO> getRelatedQuestion(QuestionDTO questionDTO) {
        if (StringUtils.isBlank(questionDTO.getTAG())){
            return new ArrayList<>();
        }
        String regexpTag = StringUtils.replace(questionDTO.getTAG(), "，", "|");
        System.out.println(regexpTag);
        Question question = new Question();
        question.setID(questionDTO.getID());
        question.setTAG(regexpTag);
        List<Question> questions = questionExtMapper.selectByRelated(question);
        List<QuestionDTO> collect = questions.stream().map(que -> {
            QuestionDTO questionDTO_ = new QuestionDTO();
            BeanUtils.copyProperties(que, questionDTO_);
            return questionDTO_;
        }).collect(Collectors.toList());
        return collect;
    }
}
