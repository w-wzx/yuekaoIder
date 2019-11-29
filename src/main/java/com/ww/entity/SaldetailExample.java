package com.ww.entity;

import java.util.ArrayList;
import java.util.List;

public class SaldetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public SaldetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
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
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
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

        public Criteria andSdetailidIsNull() {
            addCriterion("sDetailId is null");
            return (Criteria) this;
        }

        public Criteria andSdetailidIsNotNull() {
            addCriterion("sDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andSdetailidEqualTo(Integer value) {
            addCriterion("sDetailId =", value, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidNotEqualTo(Integer value) {
            addCriterion("sDetailId <>", value, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidGreaterThan(Integer value) {
            addCriterion("sDetailId >", value, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sDetailId >=", value, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidLessThan(Integer value) {
            addCriterion("sDetailId <", value, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("sDetailId <=", value, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidIn(List<Integer> values) {
            addCriterion("sDetailId in", values, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidNotIn(List<Integer> values) {
            addCriterion("sDetailId not in", values, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidBetween(Integer value1, Integer value2) {
            addCriterion("sDetailId between", value1, value2, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("sDetailId not between", value1, value2, "sdetailid");
            return (Criteria) this;
        }

        public Criteria andSaloridIsNull() {
            addCriterion("salOrId is null");
            return (Criteria) this;
        }

        public Criteria andSaloridIsNotNull() {
            addCriterion("salOrId is not null");
            return (Criteria) this;
        }

        public Criteria andSaloridEqualTo(Integer value) {
            addCriterion("salOrId =", value, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridNotEqualTo(Integer value) {
            addCriterion("salOrId <>", value, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridGreaterThan(Integer value) {
            addCriterion("salOrId >", value, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("salOrId >=", value, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridLessThan(Integer value) {
            addCriterion("salOrId <", value, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridLessThanOrEqualTo(Integer value) {
            addCriterion("salOrId <=", value, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridIn(List<Integer> values) {
            addCriterion("salOrId in", values, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridNotIn(List<Integer> values) {
            addCriterion("salOrId not in", values, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridBetween(Integer value1, Integer value2) {
            addCriterion("salOrId between", value1, value2, "salorid");
            return (Criteria) this;
        }

        public Criteria andSaloridNotBetween(Integer value1, Integer value2) {
            addCriterion("salOrId not between", value1, value2, "salorid");
            return (Criteria) this;
        }

        public Criteria andGsidIsNull() {
            addCriterion("gsId is null");
            return (Criteria) this;
        }

        public Criteria andGsidIsNotNull() {
            addCriterion("gsId is not null");
            return (Criteria) this;
        }

        public Criteria andGsidEqualTo(Integer value) {
            addCriterion("gsId =", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotEqualTo(Integer value) {
            addCriterion("gsId <>", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThan(Integer value) {
            addCriterion("gsId >", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsId >=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThan(Integer value) {
            addCriterion("gsId <", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThanOrEqualTo(Integer value) {
            addCriterion("gsId <=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidIn(List<Integer> values) {
            addCriterion("gsId in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotIn(List<Integer> values) {
            addCriterion("gsId not in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidBetween(Integer value1, Integer value2) {
            addCriterion("gsId between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotBetween(Integer value1, Integer value2) {
            addCriterion("gsId not between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andSalnumIsNull() {
            addCriterion("salNum is null");
            return (Criteria) this;
        }

        public Criteria andSalnumIsNotNull() {
            addCriterion("salNum is not null");
            return (Criteria) this;
        }

        public Criteria andSalnumEqualTo(Integer value) {
            addCriterion("salNum =", value, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumNotEqualTo(Integer value) {
            addCriterion("salNum <>", value, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumGreaterThan(Integer value) {
            addCriterion("salNum >", value, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("salNum >=", value, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumLessThan(Integer value) {
            addCriterion("salNum <", value, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumLessThanOrEqualTo(Integer value) {
            addCriterion("salNum <=", value, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumIn(List<Integer> values) {
            addCriterion("salNum in", values, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumNotIn(List<Integer> values) {
            addCriterion("salNum not in", values, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumBetween(Integer value1, Integer value2) {
            addCriterion("salNum between", value1, value2, "salnum");
            return (Criteria) this;
        }

        public Criteria andSalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("salNum not between", value1, value2, "salnum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table saldetail
     *
     * @mbg.generated do_not_delete_during_merge Tue Nov 26 14:04:46 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
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