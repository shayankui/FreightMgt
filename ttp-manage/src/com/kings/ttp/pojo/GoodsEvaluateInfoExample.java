package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsEvaluateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsEvaluateInfoExample() {
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

        public Criteria andEvaluateNumIsNull() {
            addCriterion("F_EVALUATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIsNotNull() {
            addCriterion("F_EVALUATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumEqualTo(String value) {
            addCriterion("F_EVALUATE_NUM =", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotEqualTo(String value) {
            addCriterion("F_EVALUATE_NUM <>", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThan(String value) {
            addCriterion("F_EVALUATE_NUM >", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_EVALUATE_NUM >=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThan(String value) {
            addCriterion("F_EVALUATE_NUM <", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThanOrEqualTo(String value) {
            addCriterion("F_EVALUATE_NUM <=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLike(String value) {
            addCriterion("F_EVALUATE_NUM like", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotLike(String value) {
            addCriterion("F_EVALUATE_NUM not like", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIn(List<String> values) {
            addCriterion("F_EVALUATE_NUM in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotIn(List<String> values) {
            addCriterion("F_EVALUATE_NUM not in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumBetween(String value1, String value2) {
            addCriterion("F_EVALUATE_NUM between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotBetween(String value1, String value2) {
            addCriterion("F_EVALUATE_NUM not between", value1, value2, "evaluateNum");
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

        public Criteria andReceiveTypeIsNull() {
            addCriterion("F_RECEIVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNotNull() {
            addCriterion("F_RECEIVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeEqualTo(Integer value) {
            addCriterion("F_RECEIVE_TYPE =", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotEqualTo(Integer value) {
            addCriterion("F_RECEIVE_TYPE <>", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThan(Integer value) {
            addCriterion("F_RECEIVE_TYPE >", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_RECEIVE_TYPE >=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThan(Integer value) {
            addCriterion("F_RECEIVE_TYPE <", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_RECEIVE_TYPE <=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIn(List<Integer> values) {
            addCriterion("F_RECEIVE_TYPE in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotIn(List<Integer> values) {
            addCriterion("F_RECEIVE_TYPE not in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_RECEIVE_TYPE between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_RECEIVE_TYPE not between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("F_RECEIVE_USER is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("F_RECEIVE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(String value) {
            addCriterion("F_RECEIVE_USER =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(String value) {
            addCriterion("F_RECEIVE_USER <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(String value) {
            addCriterion("F_RECEIVE_USER >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_USER >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(String value) {
            addCriterion("F_RECEIVE_USER <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_USER <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLike(String value) {
            addCriterion("F_RECEIVE_USER like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotLike(String value) {
            addCriterion("F_RECEIVE_USER not like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<String> values) {
            addCriterion("F_RECEIVE_USER in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<String> values) {
            addCriterion("F_RECEIVE_USER not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_USER between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_USER not between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andServiceValIsNull() {
            addCriterion("F_SERVICE_VAL is null");
            return (Criteria) this;
        }

        public Criteria andServiceValIsNotNull() {
            addCriterion("F_SERVICE_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceValEqualTo(Integer value) {
            addCriterion("F_SERVICE_VAL =", value, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValNotEqualTo(Integer value) {
            addCriterion("F_SERVICE_VAL <>", value, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValGreaterThan(Integer value) {
            addCriterion("F_SERVICE_VAL >", value, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_SERVICE_VAL >=", value, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValLessThan(Integer value) {
            addCriterion("F_SERVICE_VAL <", value, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValLessThanOrEqualTo(Integer value) {
            addCriterion("F_SERVICE_VAL <=", value, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValIn(List<Integer> values) {
            addCriterion("F_SERVICE_VAL in", values, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValNotIn(List<Integer> values) {
            addCriterion("F_SERVICE_VAL not in", values, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValBetween(Integer value1, Integer value2) {
            addCriterion("F_SERVICE_VAL between", value1, value2, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andServiceValNotBetween(Integer value1, Integer value2) {
            addCriterion("F_SERVICE_VAL not between", value1, value2, "serviceVal");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("F_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("F_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("F_DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("F_DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("F_DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("F_DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("F_DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("F_DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("F_DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("F_DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("F_DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("F_DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("F_DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("F_DETAIL not between", value1, value2, "detail");
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

        public Criteria andCntUsefulIsNull() {
            addCriterion("F_CNT_USEFUL is null");
            return (Criteria) this;
        }

        public Criteria andCntUsefulIsNotNull() {
            addCriterion("F_CNT_USEFUL is not null");
            return (Criteria) this;
        }

        public Criteria andCntUsefulEqualTo(Integer value) {
            addCriterion("F_CNT_USEFUL =", value, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulNotEqualTo(Integer value) {
            addCriterion("F_CNT_USEFUL <>", value, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulGreaterThan(Integer value) {
            addCriterion("F_CNT_USEFUL >", value, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CNT_USEFUL >=", value, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulLessThan(Integer value) {
            addCriterion("F_CNT_USEFUL <", value, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulLessThanOrEqualTo(Integer value) {
            addCriterion("F_CNT_USEFUL <=", value, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulIn(List<Integer> values) {
            addCriterion("F_CNT_USEFUL in", values, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulNotIn(List<Integer> values) {
            addCriterion("F_CNT_USEFUL not in", values, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulBetween(Integer value1, Integer value2) {
            addCriterion("F_CNT_USEFUL between", value1, value2, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUsefulNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CNT_USEFUL not between", value1, value2, "cntUseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulIsNull() {
            addCriterion("F_CNT_UNUSEFUL is null");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulIsNotNull() {
            addCriterion("F_CNT_UNUSEFUL is not null");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulEqualTo(Integer value) {
            addCriterion("F_CNT_UNUSEFUL =", value, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulNotEqualTo(Integer value) {
            addCriterion("F_CNT_UNUSEFUL <>", value, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulGreaterThan(Integer value) {
            addCriterion("F_CNT_UNUSEFUL >", value, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CNT_UNUSEFUL >=", value, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulLessThan(Integer value) {
            addCriterion("F_CNT_UNUSEFUL <", value, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulLessThanOrEqualTo(Integer value) {
            addCriterion("F_CNT_UNUSEFUL <=", value, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulIn(List<Integer> values) {
            addCriterion("F_CNT_UNUSEFUL in", values, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulNotIn(List<Integer> values) {
            addCriterion("F_CNT_UNUSEFUL not in", values, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulBetween(Integer value1, Integer value2) {
            addCriterion("F_CNT_UNUSEFUL between", value1, value2, "cntUnuseful");
            return (Criteria) this;
        }

        public Criteria andCntUnusefulNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CNT_UNUSEFUL not between", value1, value2, "cntUnuseful");
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