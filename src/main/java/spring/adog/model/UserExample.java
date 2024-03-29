package spring.adog.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
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
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
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

        public Criteria andIDEqualTo(Long value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Long value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Long value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Long value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Long> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Long> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDEqualTo(String value) {
            addCriterion("ACCOUNT_ID =", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDNotEqualTo(String value) {
            addCriterion("ACCOUNT_ID <>", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDGreaterThan(String value) {
            addCriterion("ACCOUNT_ID >", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID >=", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDLessThan(String value) {
            addCriterion("ACCOUNT_ID <", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID <=", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDLike(String value) {
            addCriterion("ACCOUNT_ID like", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDNotLike(String value) {
            addCriterion("ACCOUNT_ID not like", value, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDIn(List<String> values) {
            addCriterion("ACCOUNT_ID in", values, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDNotIn(List<String> values) {
            addCriterion("ACCOUNT_ID not in", values, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andACCOUNT_IDNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "ACCOUNT_ID");
            return (Criteria) this;
        }

        public Criteria andTOKENIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTOKENIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTOKENEqualTo(String value) {
            addCriterion("TOKEN =", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENGreaterThan(String value) {
            addCriterion("TOKEN >", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENLessThan(String value) {
            addCriterion("TOKEN <", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENLike(String value) {
            addCriterion("TOKEN like", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotLike(String value) {
            addCriterion("TOKEN not like", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENIn(List<String> values) {
            addCriterion("TOKEN in", values, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEEqualTo(Long value) {
            addCriterion("GMT_CREATE =", value, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATENotEqualTo(Long value) {
            addCriterion("GMT_CREATE <>", value, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEGreaterThan(Long value) {
            addCriterion("GMT_CREATE >", value, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEGreaterThanOrEqualTo(Long value) {
            addCriterion("GMT_CREATE >=", value, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATELessThan(Long value) {
            addCriterion("GMT_CREATE <", value, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATELessThanOrEqualTo(Long value) {
            addCriterion("GMT_CREATE <=", value, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEIn(List<Long> values) {
            addCriterion("GMT_CREATE in", values, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATENotIn(List<Long> values) {
            addCriterion("GMT_CREATE not in", values, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATEBetween(Long value1, Long value2) {
            addCriterion("GMT_CREATE between", value1, value2, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_CREATENotBetween(Long value1, Long value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "GMT_CREATE");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDIsNull() {
            addCriterion("GMT_MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDIsNotNull() {
            addCriterion("GMT_MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDEqualTo(Long value) {
            addCriterion("GMT_MODIFIED =", value, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDNotEqualTo(Long value) {
            addCriterion("GMT_MODIFIED <>", value, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDGreaterThan(Long value) {
            addCriterion("GMT_MODIFIED >", value, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDGreaterThanOrEqualTo(Long value) {
            addCriterion("GMT_MODIFIED >=", value, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDLessThan(Long value) {
            addCriterion("GMT_MODIFIED <", value, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDLessThanOrEqualTo(Long value) {
            addCriterion("GMT_MODIFIED <=", value, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDIn(List<Long> values) {
            addCriterion("GMT_MODIFIED in", values, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDNotIn(List<Long> values) {
            addCriterion("GMT_MODIFIED not in", values, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDBetween(Long value1, Long value2) {
            addCriterion("GMT_MODIFIED between", value1, value2, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andGMT_MODIFIEDNotBetween(Long value1, Long value2) {
            addCriterion("GMT_MODIFIED not between", value1, value2, "GMT_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andBIOIsNull() {
            addCriterion("BIO is null");
            return (Criteria) this;
        }

        public Criteria andBIOIsNotNull() {
            addCriterion("BIO is not null");
            return (Criteria) this;
        }

        public Criteria andBIOEqualTo(String value) {
            addCriterion("BIO =", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIONotEqualTo(String value) {
            addCriterion("BIO <>", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOGreaterThan(String value) {
            addCriterion("BIO >", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOGreaterThanOrEqualTo(String value) {
            addCriterion("BIO >=", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOLessThan(String value) {
            addCriterion("BIO <", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOLessThanOrEqualTo(String value) {
            addCriterion("BIO <=", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOLike(String value) {
            addCriterion("BIO like", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIONotLike(String value) {
            addCriterion("BIO not like", value, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOIn(List<String> values) {
            addCriterion("BIO in", values, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIONotIn(List<String> values) {
            addCriterion("BIO not in", values, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIOBetween(String value1, String value2) {
            addCriterion("BIO between", value1, value2, "BIO");
            return (Criteria) this;
        }

        public Criteria andBIONotBetween(String value1, String value2) {
            addCriterion("BIO not between", value1, value2, "BIO");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLIsNull() {
            addCriterion("AVATAR_URL is null");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLIsNotNull() {
            addCriterion("AVATAR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLEqualTo(String value) {
            addCriterion("AVATAR_URL =", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLNotEqualTo(String value) {
            addCriterion("AVATAR_URL <>", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLGreaterThan(String value) {
            addCriterion("AVATAR_URL >", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLGreaterThanOrEqualTo(String value) {
            addCriterion("AVATAR_URL >=", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLLessThan(String value) {
            addCriterion("AVATAR_URL <", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLLessThanOrEqualTo(String value) {
            addCriterion("AVATAR_URL <=", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLLike(String value) {
            addCriterion("AVATAR_URL like", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLNotLike(String value) {
            addCriterion("AVATAR_URL not like", value, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLIn(List<String> values) {
            addCriterion("AVATAR_URL in", values, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLNotIn(List<String> values) {
            addCriterion("AVATAR_URL not in", values, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLBetween(String value1, String value2) {
            addCriterion("AVATAR_URL between", value1, value2, "AVATAR_URL");
            return (Criteria) this;
        }

        public Criteria andAVATAR_URLNotBetween(String value1, String value2) {
            addCriterion("AVATAR_URL not between", value1, value2, "AVATAR_URL");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER
     *
     * @mbg.generated do_not_delete_during_merge Thu Oct 31 16:48:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER
     *
     * @mbg.generated Thu Oct 31 16:48:59 CST 2019
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