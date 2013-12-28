package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderStatusBeanExample() {
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

        public Criteria andStatusNumIsNull() {
            addCriterion("F_STATUS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStatusNumIsNotNull() {
            addCriterion("F_STATUS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNumEqualTo(String value) {
            addCriterion("F_STATUS_NUM =", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumNotEqualTo(String value) {
            addCriterion("F_STATUS_NUM <>", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumGreaterThan(String value) {
            addCriterion("F_STATUS_NUM >", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_STATUS_NUM >=", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumLessThan(String value) {
            addCriterion("F_STATUS_NUM <", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumLessThanOrEqualTo(String value) {
            addCriterion("F_STATUS_NUM <=", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumLike(String value) {
            addCriterion("F_STATUS_NUM like", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumNotLike(String value) {
            addCriterion("F_STATUS_NUM not like", value, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumIn(List<String> values) {
            addCriterion("F_STATUS_NUM in", values, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumNotIn(List<String> values) {
            addCriterion("F_STATUS_NUM not in", values, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumBetween(String value1, String value2) {
            addCriterion("F_STATUS_NUM between", value1, value2, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNumNotBetween(String value1, String value2) {
            addCriterion("F_STATUS_NUM not between", value1, value2, "statusNum");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNull() {
            addCriterion("F_STATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNotNull() {
            addCriterion("F_STATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNameEqualTo(String value) {
            addCriterion("F_STATUS_NAME =", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotEqualTo(String value) {
            addCriterion("F_STATUS_NAME <>", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThan(String value) {
            addCriterion("F_STATUS_NAME >", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_STATUS_NAME >=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThan(String value) {
            addCriterion("F_STATUS_NAME <", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThanOrEqualTo(String value) {
            addCriterion("F_STATUS_NAME <=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLike(String value) {
            addCriterion("F_STATUS_NAME like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotLike(String value) {
            addCriterion("F_STATUS_NAME not like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameIn(List<String> values) {
            addCriterion("F_STATUS_NAME in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotIn(List<String> values) {
            addCriterion("F_STATUS_NAME not in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameBetween(String value1, String value2) {
            addCriterion("F_STATUS_NAME between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotBetween(String value1, String value2) {
            addCriterion("F_STATUS_NAME not between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionIsNull() {
            addCriterion("F_STATUS_CAPTION is null");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionIsNotNull() {
            addCriterion("F_STATUS_CAPTION is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionEqualTo(String value) {
            addCriterion("F_STATUS_CAPTION =", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionNotEqualTo(String value) {
            addCriterion("F_STATUS_CAPTION <>", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionGreaterThan(String value) {
            addCriterion("F_STATUS_CAPTION >", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("F_STATUS_CAPTION >=", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionLessThan(String value) {
            addCriterion("F_STATUS_CAPTION <", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionLessThanOrEqualTo(String value) {
            addCriterion("F_STATUS_CAPTION <=", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionLike(String value) {
            addCriterion("F_STATUS_CAPTION like", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionNotLike(String value) {
            addCriterion("F_STATUS_CAPTION not like", value, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionIn(List<String> values) {
            addCriterion("F_STATUS_CAPTION in", values, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionNotIn(List<String> values) {
            addCriterion("F_STATUS_CAPTION not in", values, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionBetween(String value1, String value2) {
            addCriterion("F_STATUS_CAPTION between", value1, value2, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusCaptionNotBetween(String value1, String value2) {
            addCriterion("F_STATUS_CAPTION not between", value1, value2, "statusCaption");
            return (Criteria) this;
        }

        public Criteria andStatusMemoIsNull() {
            addCriterion("F_STATUS_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andStatusMemoIsNotNull() {
            addCriterion("F_STATUS_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andStatusMemoEqualTo(String value) {
            addCriterion("F_STATUS_MEMO =", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoNotEqualTo(String value) {
            addCriterion("F_STATUS_MEMO <>", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoGreaterThan(String value) {
            addCriterion("F_STATUS_MEMO >", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_STATUS_MEMO >=", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoLessThan(String value) {
            addCriterion("F_STATUS_MEMO <", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoLessThanOrEqualTo(String value) {
            addCriterion("F_STATUS_MEMO <=", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoLike(String value) {
            addCriterion("F_STATUS_MEMO like", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoNotLike(String value) {
            addCriterion("F_STATUS_MEMO not like", value, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoIn(List<String> values) {
            addCriterion("F_STATUS_MEMO in", values, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoNotIn(List<String> values) {
            addCriterion("F_STATUS_MEMO not in", values, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoBetween(String value1, String value2) {
            addCriterion("F_STATUS_MEMO between", value1, value2, "statusMemo");
            return (Criteria) this;
        }

        public Criteria andStatusMemoNotBetween(String value1, String value2) {
            addCriterion("F_STATUS_MEMO not between", value1, value2, "statusMemo");
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