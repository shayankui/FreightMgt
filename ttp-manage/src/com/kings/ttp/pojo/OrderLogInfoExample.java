package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderLogInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderLogInfoExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("F_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("F_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("F_LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("F_LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("F_LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("F_LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("F_LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("F_LOG_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("F_LOG_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("F_LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("F_LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("F_LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("F_LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("F_ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("F_ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("F_ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("F_ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("F_ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("F_ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("F_ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("F_ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("F_ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("F_ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("F_ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("F_OP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("F_OP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(Integer value) {
            addCriterion("F_OP_TYPE =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(Integer value) {
            addCriterion("F_OP_TYPE <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(Integer value) {
            addCriterion("F_OP_TYPE >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_OP_TYPE >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(Integer value) {
            addCriterion("F_OP_TYPE <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_OP_TYPE <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<Integer> values) {
            addCriterion("F_OP_TYPE in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<Integer> values) {
            addCriterion("F_OP_TYPE not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_OP_TYPE between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_OP_TYPE not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpNumIsNull() {
            addCriterion("F_OP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOpNumIsNotNull() {
            addCriterion("F_OP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOpNumEqualTo(String value) {
            addCriterion("F_OP_NUM =", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotEqualTo(String value) {
            addCriterion("F_OP_NUM <>", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumGreaterThan(String value) {
            addCriterion("F_OP_NUM >", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_OP_NUM >=", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumLessThan(String value) {
            addCriterion("F_OP_NUM <", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumLessThanOrEqualTo(String value) {
            addCriterion("F_OP_NUM <=", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumLike(String value) {
            addCriterion("F_OP_NUM like", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotLike(String value) {
            addCriterion("F_OP_NUM not like", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumIn(List<String> values) {
            addCriterion("F_OP_NUM in", values, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotIn(List<String> values) {
            addCriterion("F_OP_NUM not in", values, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumBetween(String value1, String value2) {
            addCriterion("F_OP_NUM between", value1, value2, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotBetween(String value1, String value2) {
            addCriterion("F_OP_NUM not between", value1, value2, "opNum");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("F_CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("F_CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(Integer value) {
            addCriterion("F_CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(Integer value) {
            addCriterion("F_CLIENT_TYPE <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(Integer value) {
            addCriterion("F_CLIENT_TYPE >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CLIENT_TYPE >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(Integer value) {
            addCriterion("F_CLIENT_TYPE <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_CLIENT_TYPE <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<Integer> values) {
            addCriterion("F_CLIENT_TYPE in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<Integer> values) {
            addCriterion("F_CLIENT_TYPE not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_CLIENT_TYPE between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CLIENT_TYPE not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientImeiIsNull() {
            addCriterion("F_CLIENT_IMEI is null");
            return (Criteria) this;
        }

        public Criteria andClientImeiIsNotNull() {
            addCriterion("F_CLIENT_IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andClientImeiEqualTo(String value) {
            addCriterion("F_CLIENT_IMEI =", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiNotEqualTo(String value) {
            addCriterion("F_CLIENT_IMEI <>", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiGreaterThan(String value) {
            addCriterion("F_CLIENT_IMEI >", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiGreaterThanOrEqualTo(String value) {
            addCriterion("F_CLIENT_IMEI >=", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiLessThan(String value) {
            addCriterion("F_CLIENT_IMEI <", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiLessThanOrEqualTo(String value) {
            addCriterion("F_CLIENT_IMEI <=", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiLike(String value) {
            addCriterion("F_CLIENT_IMEI like", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiNotLike(String value) {
            addCriterion("F_CLIENT_IMEI not like", value, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiIn(List<String> values) {
            addCriterion("F_CLIENT_IMEI in", values, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiNotIn(List<String> values) {
            addCriterion("F_CLIENT_IMEI not in", values, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiBetween(String value1, String value2) {
            addCriterion("F_CLIENT_IMEI between", value1, value2, "clientImei");
            return (Criteria) this;
        }

        public Criteria andClientImeiNotBetween(String value1, String value2) {
            addCriterion("F_CLIENT_IMEI not between", value1, value2, "clientImei");
            return (Criteria) this;
        }

        public Criteria andOpMancodeIsNull() {
            addCriterion("F_OP_MANCODE is null");
            return (Criteria) this;
        }

        public Criteria andOpMancodeIsNotNull() {
            addCriterion("F_OP_MANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpMancodeEqualTo(String value) {
            addCriterion("F_OP_MANCODE =", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeNotEqualTo(String value) {
            addCriterion("F_OP_MANCODE <>", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeGreaterThan(String value) {
            addCriterion("F_OP_MANCODE >", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_OP_MANCODE >=", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeLessThan(String value) {
            addCriterion("F_OP_MANCODE <", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeLessThanOrEqualTo(String value) {
            addCriterion("F_OP_MANCODE <=", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeLike(String value) {
            addCriterion("F_OP_MANCODE like", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeNotLike(String value) {
            addCriterion("F_OP_MANCODE not like", value, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeIn(List<String> values) {
            addCriterion("F_OP_MANCODE in", values, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeNotIn(List<String> values) {
            addCriterion("F_OP_MANCODE not in", values, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeBetween(String value1, String value2) {
            addCriterion("F_OP_MANCODE between", value1, value2, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMancodeNotBetween(String value1, String value2) {
            addCriterion("F_OP_MANCODE not between", value1, value2, "opMancode");
            return (Criteria) this;
        }

        public Criteria andOpMannameIsNull() {
            addCriterion("F_OP_MANNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpMannameIsNotNull() {
            addCriterion("F_OP_MANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpMannameEqualTo(String value) {
            addCriterion("F_OP_MANNAME =", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameNotEqualTo(String value) {
            addCriterion("F_OP_MANNAME <>", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameGreaterThan(String value) {
            addCriterion("F_OP_MANNAME >", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameGreaterThanOrEqualTo(String value) {
            addCriterion("F_OP_MANNAME >=", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameLessThan(String value) {
            addCriterion("F_OP_MANNAME <", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameLessThanOrEqualTo(String value) {
            addCriterion("F_OP_MANNAME <=", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameLike(String value) {
            addCriterion("F_OP_MANNAME like", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameNotLike(String value) {
            addCriterion("F_OP_MANNAME not like", value, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameIn(List<String> values) {
            addCriterion("F_OP_MANNAME in", values, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameNotIn(List<String> values) {
            addCriterion("F_OP_MANNAME not in", values, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameBetween(String value1, String value2) {
            addCriterion("F_OP_MANNAME between", value1, value2, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpMannameNotBetween(String value1, String value2) {
            addCriterion("F_OP_MANNAME not between", value1, value2, "opManname");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("F_OP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("F_OP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(String value) {
            addCriterion("F_OP_TIME =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(String value) {
            addCriterion("F_OP_TIME <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(String value) {
            addCriterion("F_OP_TIME >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_OP_TIME >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(String value) {
            addCriterion("F_OP_TIME <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(String value) {
            addCriterion("F_OP_TIME <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLike(String value) {
            addCriterion("F_OP_TIME like", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotLike(String value) {
            addCriterion("F_OP_TIME not like", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<String> values) {
            addCriterion("F_OP_TIME in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<String> values) {
            addCriterion("F_OP_TIME not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(String value1, String value2) {
            addCriterion("F_OP_TIME between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(String value1, String value2) {
            addCriterion("F_OP_TIME not between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpMemoIsNull() {
            addCriterion("F_OP_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOpMemoIsNotNull() {
            addCriterion("F_OP_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOpMemoEqualTo(String value) {
            addCriterion("F_OP_MEMO =", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoNotEqualTo(String value) {
            addCriterion("F_OP_MEMO <>", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoGreaterThan(String value) {
            addCriterion("F_OP_MEMO >", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_OP_MEMO >=", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoLessThan(String value) {
            addCriterion("F_OP_MEMO <", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoLessThanOrEqualTo(String value) {
            addCriterion("F_OP_MEMO <=", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoLike(String value) {
            addCriterion("F_OP_MEMO like", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoNotLike(String value) {
            addCriterion("F_OP_MEMO not like", value, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoIn(List<String> values) {
            addCriterion("F_OP_MEMO in", values, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoNotIn(List<String> values) {
            addCriterion("F_OP_MEMO not in", values, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoBetween(String value1, String value2) {
            addCriterion("F_OP_MEMO between", value1, value2, "opMemo");
            return (Criteria) this;
        }

        public Criteria andOpMemoNotBetween(String value1, String value2) {
            addCriterion("F_OP_MEMO not between", value1, value2, "opMemo");
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