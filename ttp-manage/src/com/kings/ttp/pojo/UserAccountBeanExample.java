package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserAccountBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountBeanExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("F_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("F_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("F_ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("F_ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("F_ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("F_ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("F_ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("F_ACCOUNT_ID like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("F_ACCOUNT_ID not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("F_ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("F_ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("F_ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("F_ACCOUNT_ID not between", value1, value2, "accountId");
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

        public Criteria andStatusIsNull() {
            addCriterion("F_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("F_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("F_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("F_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("F_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("F_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("F_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("F_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("F_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("F_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("F_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyIsNull() {
            addCriterion("F_RMB_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyIsNotNull() {
            addCriterion("F_RMB_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyEqualTo(Double value) {
            addCriterion("F_RMB_MONEY =", value, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyNotEqualTo(Double value) {
            addCriterion("F_RMB_MONEY <>", value, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyGreaterThan(Double value) {
            addCriterion("F_RMB_MONEY >", value, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("F_RMB_MONEY >=", value, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyLessThan(Double value) {
            addCriterion("F_RMB_MONEY <", value, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyLessThanOrEqualTo(Double value) {
            addCriterion("F_RMB_MONEY <=", value, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyIn(List<Double> values) {
            addCriterion("F_RMB_MONEY in", values, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyNotIn(List<Double> values) {
            addCriterion("F_RMB_MONEY not in", values, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyBetween(Double value1, Double value2) {
            addCriterion("F_RMB_MONEY between", value1, value2, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andRmbMoneyNotBetween(Double value1, Double value2) {
            addCriterion("F_RMB_MONEY not between", value1, value2, "rmbMoney");
            return (Criteria) this;
        }

        public Criteria andOtherAmountIsNull() {
            addCriterion("F_OTHER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOtherAmountIsNotNull() {
            addCriterion("F_OTHER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAmountEqualTo(Double value) {
            addCriterion("F_OTHER_AMOUNT =", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountNotEqualTo(Double value) {
            addCriterion("F_OTHER_AMOUNT <>", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountGreaterThan(Double value) {
            addCriterion("F_OTHER_AMOUNT >", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("F_OTHER_AMOUNT >=", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountLessThan(Double value) {
            addCriterion("F_OTHER_AMOUNT <", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountLessThanOrEqualTo(Double value) {
            addCriterion("F_OTHER_AMOUNT <=", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountIn(List<Double> values) {
            addCriterion("F_OTHER_AMOUNT in", values, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountNotIn(List<Double> values) {
            addCriterion("F_OTHER_AMOUNT not in", values, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountBetween(Double value1, Double value2) {
            addCriterion("F_OTHER_AMOUNT between", value1, value2, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountNotBetween(Double value1, Double value2) {
            addCriterion("F_OTHER_AMOUNT not between", value1, value2, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyIsNull() {
            addCriterion("F_OTHER_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyIsNotNull() {
            addCriterion("F_OTHER_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyEqualTo(Double value) {
            addCriterion("F_OTHER_MONEY =", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyNotEqualTo(Double value) {
            addCriterion("F_OTHER_MONEY <>", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyGreaterThan(Double value) {
            addCriterion("F_OTHER_MONEY >", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("F_OTHER_MONEY >=", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyLessThan(Double value) {
            addCriterion("F_OTHER_MONEY <", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyLessThanOrEqualTo(Double value) {
            addCriterion("F_OTHER_MONEY <=", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyIn(List<Double> values) {
            addCriterion("F_OTHER_MONEY in", values, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyNotIn(List<Double> values) {
            addCriterion("F_OTHER_MONEY not in", values, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyBetween(Double value1, Double value2) {
            addCriterion("F_OTHER_MONEY between", value1, value2, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyNotBetween(Double value1, Double value2) {
            addCriterion("F_OTHER_MONEY not between", value1, value2, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyIsNull() {
            addCriterion("F_MIN_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMinMoneyIsNotNull() {
            addCriterion("F_MIN_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMinMoneyEqualTo(Double value) {
            addCriterion("F_MIN_MONEY =", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyNotEqualTo(Double value) {
            addCriterion("F_MIN_MONEY <>", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyGreaterThan(Double value) {
            addCriterion("F_MIN_MONEY >", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("F_MIN_MONEY >=", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyLessThan(Double value) {
            addCriterion("F_MIN_MONEY <", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyLessThanOrEqualTo(Double value) {
            addCriterion("F_MIN_MONEY <=", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyIn(List<Double> values) {
            addCriterion("F_MIN_MONEY in", values, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyNotIn(List<Double> values) {
            addCriterion("F_MIN_MONEY not in", values, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyBetween(Double value1, Double value2) {
            addCriterion("F_MIN_MONEY between", value1, value2, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyNotBetween(Double value1, Double value2) {
            addCriterion("F_MIN_MONEY not between", value1, value2, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyIsNull() {
            addCriterion("F_MAX_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyIsNotNull() {
            addCriterion("F_MAX_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyEqualTo(Double value) {
            addCriterion("F_MAX_MONEY =", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyNotEqualTo(Double value) {
            addCriterion("F_MAX_MONEY <>", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyGreaterThan(Double value) {
            addCriterion("F_MAX_MONEY >", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("F_MAX_MONEY >=", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyLessThan(Double value) {
            addCriterion("F_MAX_MONEY <", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyLessThanOrEqualTo(Double value) {
            addCriterion("F_MAX_MONEY <=", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyIn(List<Double> values) {
            addCriterion("F_MAX_MONEY in", values, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyNotIn(List<Double> values) {
            addCriterion("F_MAX_MONEY not in", values, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyBetween(Double value1, Double value2) {
            addCriterion("F_MAX_MONEY between", value1, value2, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyNotBetween(Double value1, Double value2) {
            addCriterion("F_MAX_MONEY not between", value1, value2, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNull() {
            addCriterion("F_BUILD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNotNull() {
            addCriterion("F_BUILD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeEqualTo(String value) {
            addCriterion("F_BUILD_TIME =", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotEqualTo(String value) {
            addCriterion("F_BUILD_TIME <>", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThan(String value) {
            addCriterion("F_BUILD_TIME >", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_BUILD_TIME >=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThan(String value) {
            addCriterion("F_BUILD_TIME <", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThanOrEqualTo(String value) {
            addCriterion("F_BUILD_TIME <=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLike(String value) {
            addCriterion("F_BUILD_TIME like", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotLike(String value) {
            addCriterion("F_BUILD_TIME not like", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIn(List<String> values) {
            addCriterion("F_BUILD_TIME in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotIn(List<String> values) {
            addCriterion("F_BUILD_TIME not in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeBetween(String value1, String value2) {
            addCriterion("F_BUILD_TIME between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotBetween(String value1, String value2) {
            addCriterion("F_BUILD_TIME not between", value1, value2, "buildTime");
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