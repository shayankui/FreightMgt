package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsTypeBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTypeBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTypeNumIsNull() {
            addCriterion("F_TYPE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTypeNumIsNotNull() {
            addCriterion("F_TYPE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNumEqualTo(String value) {
            addCriterion("F_TYPE_NUM =", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumNotEqualTo(String value) {
            addCriterion("F_TYPE_NUM <>", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumGreaterThan(String value) {
            addCriterion("F_TYPE_NUM >", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_TYPE_NUM >=", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumLessThan(String value) {
            addCriterion("F_TYPE_NUM <", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumLessThanOrEqualTo(String value) {
            addCriterion("F_TYPE_NUM <=", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumLike(String value) {
            addCriterion("F_TYPE_NUM like", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumNotLike(String value) {
            addCriterion("F_TYPE_NUM not like", value, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumIn(List<String> values) {
            addCriterion("F_TYPE_NUM in", values, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumNotIn(List<String> values) {
            addCriterion("F_TYPE_NUM not in", values, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumBetween(String value1, String value2) {
            addCriterion("F_TYPE_NUM between", value1, value2, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNumNotBetween(String value1, String value2) {
            addCriterion("F_TYPE_NUM not between", value1, value2, "typeNum");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("F_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("F_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("F_TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("F_TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("F_TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("F_TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("F_TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("F_TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("F_TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("F_TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("F_TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("F_TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("F_TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeMemoIsNull() {
            addCriterion("F_TYPE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andTypeMemoIsNotNull() {
            addCriterion("F_TYPE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMemoEqualTo(String value) {
            addCriterion("F_TYPE_MEMO =", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoNotEqualTo(String value) {
            addCriterion("F_TYPE_MEMO <>", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoGreaterThan(String value) {
            addCriterion("F_TYPE_MEMO >", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_TYPE_MEMO >=", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoLessThan(String value) {
            addCriterion("F_TYPE_MEMO <", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoLessThanOrEqualTo(String value) {
            addCriterion("F_TYPE_MEMO <=", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoLike(String value) {
            addCriterion("F_TYPE_MEMO like", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoNotLike(String value) {
            addCriterion("F_TYPE_MEMO not like", value, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoIn(List<String> values) {
            addCriterion("F_TYPE_MEMO in", values, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoNotIn(List<String> values) {
            addCriterion("F_TYPE_MEMO not in", values, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoBetween(String value1, String value2) {
            addCriterion("F_TYPE_MEMO between", value1, value2, "typeMemo");
            return (Criteria) this;
        }

        public Criteria andTypeMemoNotBetween(String value1, String value2) {
            addCriterion("F_TYPE_MEMO not between", value1, value2, "typeMemo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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