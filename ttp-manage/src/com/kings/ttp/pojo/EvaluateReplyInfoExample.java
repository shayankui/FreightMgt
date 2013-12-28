package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class EvaluateReplyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateReplyInfoExample() {
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

        public Criteria andReplyNumIsNull() {
            addCriterion("F_REPLY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("F_REPLY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(String value) {
            addCriterion("F_REPLY_NUM =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(String value) {
            addCriterion("F_REPLY_NUM <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(String value) {
            addCriterion("F_REPLY_NUM >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_REPLY_NUM >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(String value) {
            addCriterion("F_REPLY_NUM <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(String value) {
            addCriterion("F_REPLY_NUM <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLike(String value) {
            addCriterion("F_REPLY_NUM like", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotLike(String value) {
            addCriterion("F_REPLY_NUM not like", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<String> values) {
            addCriterion("F_REPLY_NUM in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<String> values) {
            addCriterion("F_REPLY_NUM not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(String value1, String value2) {
            addCriterion("F_REPLY_NUM between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(String value1, String value2) {
            addCriterion("F_REPLY_NUM not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("F_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("F_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("F_USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("F_USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("F_USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("F_USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("F_USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("F_USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("F_USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("F_USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("F_USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("F_USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("F_USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReplyDetailIsNull() {
            addCriterion("F_REPLY_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andReplyDetailIsNotNull() {
            addCriterion("F_REPLY_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDetailEqualTo(String value) {
            addCriterion("F_REPLY_DETAIL =", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailNotEqualTo(String value) {
            addCriterion("F_REPLY_DETAIL <>", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailGreaterThan(String value) {
            addCriterion("F_REPLY_DETAIL >", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailGreaterThanOrEqualTo(String value) {
            addCriterion("F_REPLY_DETAIL >=", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailLessThan(String value) {
            addCriterion("F_REPLY_DETAIL <", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailLessThanOrEqualTo(String value) {
            addCriterion("F_REPLY_DETAIL <=", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailLike(String value) {
            addCriterion("F_REPLY_DETAIL like", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailNotLike(String value) {
            addCriterion("F_REPLY_DETAIL not like", value, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailIn(List<String> values) {
            addCriterion("F_REPLY_DETAIL in", values, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailNotIn(List<String> values) {
            addCriterion("F_REPLY_DETAIL not in", values, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailBetween(String value1, String value2) {
            addCriterion("F_REPLY_DETAIL between", value1, value2, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyDetailNotBetween(String value1, String value2) {
            addCriterion("F_REPLY_DETAIL not between", value1, value2, "replyDetail");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("F_REPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("F_REPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(String value) {
            addCriterion("F_REPLY_TIME =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(String value) {
            addCriterion("F_REPLY_TIME <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(String value) {
            addCriterion("F_REPLY_TIME >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_REPLY_TIME >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(String value) {
            addCriterion("F_REPLY_TIME <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(String value) {
            addCriterion("F_REPLY_TIME <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLike(String value) {
            addCriterion("F_REPLY_TIME like", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotLike(String value) {
            addCriterion("F_REPLY_TIME not like", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<String> values) {
            addCriterion("F_REPLY_TIME in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<String> values) {
            addCriterion("F_REPLY_TIME not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(String value1, String value2) {
            addCriterion("F_REPLY_TIME between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(String value1, String value2) {
            addCriterion("F_REPLY_TIME not between", value1, value2, "replyTime");
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