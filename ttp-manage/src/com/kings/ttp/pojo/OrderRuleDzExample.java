package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderRuleDzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRuleDzExample() {
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

        public Criteria andOrderNumIsNull() {
            addCriterion("F_ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("F_ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("F_ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("F_ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("F_ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("F_ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("F_ORDER_NUM like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("F_ORDER_NUM not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("F_ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("F_ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("F_ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andSubNumIsNull() {
            addCriterion("F_SUB_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSubNumIsNotNull() {
            addCriterion("F_SUB_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSubNumEqualTo(String value) {
            addCriterion("F_SUB_NUM =", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumNotEqualTo(String value) {
            addCriterion("F_SUB_NUM <>", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumGreaterThan(String value) {
            addCriterion("F_SUB_NUM >", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_SUB_NUM >=", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumLessThan(String value) {
            addCriterion("F_SUB_NUM <", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumLessThanOrEqualTo(String value) {
            addCriterion("F_SUB_NUM <=", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumLike(String value) {
            addCriterion("F_SUB_NUM like", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumNotLike(String value) {
            addCriterion("F_SUB_NUM not like", value, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumIn(List<String> values) {
            addCriterion("F_SUB_NUM in", values, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumNotIn(List<String> values) {
            addCriterion("F_SUB_NUM not in", values, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumBetween(String value1, String value2) {
            addCriterion("F_SUB_NUM between", value1, value2, "subNum");
            return (Criteria) this;
        }

        public Criteria andSubNumNotBetween(String value1, String value2) {
            addCriterion("F_SUB_NUM not between", value1, value2, "subNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumIsNull() {
            addCriterion("F_RULE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRuleNumIsNotNull() {
            addCriterion("F_RULE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNumEqualTo(String value) {
            addCriterion("F_RULE_NUM =", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotEqualTo(String value) {
            addCriterion("F_RULE_NUM <>", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumGreaterThan(String value) {
            addCriterion("F_RULE_NUM >", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_NUM >=", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumLessThan(String value) {
            addCriterion("F_RULE_NUM <", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_NUM <=", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumLike(String value) {
            addCriterion("F_RULE_NUM like", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotLike(String value) {
            addCriterion("F_RULE_NUM not like", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumIn(List<String> values) {
            addCriterion("F_RULE_NUM in", values, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotIn(List<String> values) {
            addCriterion("F_RULE_NUM not in", values, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumBetween(String value1, String value2) {
            addCriterion("F_RULE_NUM between", value1, value2, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotBetween(String value1, String value2) {
            addCriterion("F_RULE_NUM not between", value1, value2, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("F_RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("F_RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("F_RULE_NAME =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("F_RULE_NAME <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("F_RULE_NAME >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_NAME >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("F_RULE_NAME <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_NAME <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("F_RULE_NAME like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("F_RULE_NAME not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("F_RULE_NAME in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("F_RULE_NAME not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("F_RULE_NAME between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("F_RULE_NAME not between", value1, value2, "ruleName");
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