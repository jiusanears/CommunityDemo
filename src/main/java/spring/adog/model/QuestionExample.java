package spring.adog.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public QuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTITLEEqualTo(String value) {
            addCriterion("TITLE =", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotEqualTo(String value) {
            addCriterion("TITLE <>", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThan(String value) {
            addCriterion("TITLE >", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThan(String value) {
            addCriterion("TITLE <", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELike(String value) {
            addCriterion("TITLE like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotLike(String value) {
            addCriterion("TITLE not like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEIn(List<String> values) {
            addCriterion("TITLE in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotIn(List<String> values) {
            addCriterion("TITLE not in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEIsNull() {
            addCriterion("GMTCREATE is null");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEIsNotNull() {
            addCriterion("GMTCREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEEqualTo(Long value) {
            addCriterion("GMTCREATE =", value, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATENotEqualTo(Long value) {
            addCriterion("GMTCREATE <>", value, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEGreaterThan(Long value) {
            addCriterion("GMTCREATE >", value, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEGreaterThanOrEqualTo(Long value) {
            addCriterion("GMTCREATE >=", value, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATELessThan(Long value) {
            addCriterion("GMTCREATE <", value, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATELessThanOrEqualTo(Long value) {
            addCriterion("GMTCREATE <=", value, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEIn(List<Long> values) {
            addCriterion("GMTCREATE in", values, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATENotIn(List<Long> values) {
            addCriterion("GMTCREATE not in", values, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATEBetween(Long value1, Long value2) {
            addCriterion("GMTCREATE between", value1, value2, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTCREATENotBetween(Long value1, Long value2) {
            addCriterion("GMTCREATE not between", value1, value2, "GMTCREATE");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDIsNull() {
            addCriterion("GMTMODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDIsNotNull() {
            addCriterion("GMTMODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDEqualTo(Long value) {
            addCriterion("GMTMODIFIED =", value, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDNotEqualTo(Long value) {
            addCriterion("GMTMODIFIED <>", value, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDGreaterThan(Long value) {
            addCriterion("GMTMODIFIED >", value, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDGreaterThanOrEqualTo(Long value) {
            addCriterion("GMTMODIFIED >=", value, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDLessThan(Long value) {
            addCriterion("GMTMODIFIED <", value, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDLessThanOrEqualTo(Long value) {
            addCriterion("GMTMODIFIED <=", value, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDIn(List<Long> values) {
            addCriterion("GMTMODIFIED in", values, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDNotIn(List<Long> values) {
            addCriterion("GMTMODIFIED not in", values, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDBetween(Long value1, Long value2) {
            addCriterion("GMTMODIFIED between", value1, value2, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMTMODIFIEDNotBetween(Long value1, Long value2) {
            addCriterion("GMTMODIFIED not between", value1, value2, "GMTMODIFIED");
            return (Criteria) this;
        }

        public Criteria andCREATORIDIsNull() {
            addCriterion("CREATORID is null");
            return (Criteria) this;
        }

        public Criteria andCREATORIDIsNotNull() {
            addCriterion("CREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andCREATORIDEqualTo(Integer value) {
            addCriterion("CREATORID =", value, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDNotEqualTo(Integer value) {
            addCriterion("CREATORID <>", value, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDGreaterThan(Integer value) {
            addCriterion("CREATORID >", value, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATORID >=", value, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDLessThan(Integer value) {
            addCriterion("CREATORID <", value, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDLessThanOrEqualTo(Integer value) {
            addCriterion("CREATORID <=", value, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDIn(List<Integer> values) {
            addCriterion("CREATORID in", values, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDNotIn(List<Integer> values) {
            addCriterion("CREATORID not in", values, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDBetween(Integer value1, Integer value2) {
            addCriterion("CREATORID between", value1, value2, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCREATORIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATORID not between", value1, value2, "CREATORID");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTIsNull() {
            addCriterion("COMMENT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTIsNotNull() {
            addCriterion("COMMENT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT =", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTNotEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT <>", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTGreaterThan(Integer value) {
            addCriterion("COMMENT_COUNT >", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT >=", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTLessThan(Integer value) {
            addCriterion("COMMENT_COUNT <", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT <=", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTIn(List<Integer> values) {
            addCriterion("COMMENT_COUNT in", values, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTNotIn(List<Integer> values) {
            addCriterion("COMMENT_COUNT not in", values, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COUNT between", value1, value2, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COUNT not between", value1, value2, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTIsNull() {
            addCriterion("VIEW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTIsNotNull() {
            addCriterion("VIEW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTEqualTo(Integer value) {
            addCriterion("VIEW_COUNT =", value, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTNotEqualTo(Integer value) {
            addCriterion("VIEW_COUNT <>", value, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTGreaterThan(Integer value) {
            addCriterion("VIEW_COUNT >", value, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIEW_COUNT >=", value, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTLessThan(Integer value) {
            addCriterion("VIEW_COUNT <", value, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTLessThanOrEqualTo(Integer value) {
            addCriterion("VIEW_COUNT <=", value, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTIn(List<Integer> values) {
            addCriterion("VIEW_COUNT in", values, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTNotIn(List<Integer> values) {
            addCriterion("VIEW_COUNT not in", values, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTBetween(Integer value1, Integer value2) {
            addCriterion("VIEW_COUNT between", value1, value2, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andVIEW_COUNTNotBetween(Integer value1, Integer value2) {
            addCriterion("VIEW_COUNT not between", value1, value2, "VIEW_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTIsNull() {
            addCriterion("LIKE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTIsNotNull() {
            addCriterion("LIKE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTEqualTo(Integer value) {
            addCriterion("LIKE_COUNT =", value, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTNotEqualTo(Integer value) {
            addCriterion("LIKE_COUNT <>", value, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTGreaterThan(Integer value) {
            addCriterion("LIKE_COUNT >", value, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIKE_COUNT >=", value, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTLessThan(Integer value) {
            addCriterion("LIKE_COUNT <", value, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTLessThanOrEqualTo(Integer value) {
            addCriterion("LIKE_COUNT <=", value, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTIn(List<Integer> values) {
            addCriterion("LIKE_COUNT in", values, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTNotIn(List<Integer> values) {
            addCriterion("LIKE_COUNT not in", values, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_COUNT between", value1, value2, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andLIKE_COUNTNotBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_COUNT not between", value1, value2, "LIKE_COUNT");
            return (Criteria) this;
        }

        public Criteria andTAGIsNull() {
            addCriterion("TAG is null");
            return (Criteria) this;
        }

        public Criteria andTAGIsNotNull() {
            addCriterion("TAG is not null");
            return (Criteria) this;
        }

        public Criteria andTAGEqualTo(String value) {
            addCriterion("TAG =", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGNotEqualTo(String value) {
            addCriterion("TAG <>", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGGreaterThan(String value) {
            addCriterion("TAG >", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGGreaterThanOrEqualTo(String value) {
            addCriterion("TAG >=", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGLessThan(String value) {
            addCriterion("TAG <", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGLessThanOrEqualTo(String value) {
            addCriterion("TAG <=", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGLike(String value) {
            addCriterion("TAG like", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGNotLike(String value) {
            addCriterion("TAG not like", value, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGIn(List<String> values) {
            addCriterion("TAG in", values, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGNotIn(List<String> values) {
            addCriterion("TAG not in", values, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGBetween(String value1, String value2) {
            addCriterion("TAG between", value1, value2, "TAG");
            return (Criteria) this;
        }

        public Criteria andTAGNotBetween(String value1, String value2) {
            addCriterion("TAG not between", value1, value2, "TAG");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUESTION
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 17 17:50:54 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUESTION
     *
     * @mbg.generated Wed Jul 17 17:50:54 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}