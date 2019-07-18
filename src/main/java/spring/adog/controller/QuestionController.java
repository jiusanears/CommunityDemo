package spring.adog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.adog.dto.QuestionDTO;
import spring.adog.service.QuestionService;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable("id") Long id,
                           Model model){
        QuestionDTO question = questionService.getQuestionById(id);
        //累加阅读数
        questionService.incView(id);
        model.addAttribute("question",question);
        return "question";
    }
}