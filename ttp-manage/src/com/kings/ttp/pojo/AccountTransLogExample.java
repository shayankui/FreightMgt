package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class AccountTransLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountTransLogExample() {
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

        public Criteria andTransNumIsNull() {
            addCriterion("F_TRANS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNotNull() {
            addCriterion("F_TRANS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTransNumEqualTo(String value) {
            addCriterion("F_TRANS_NUM =", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotEqualTo(String value) {
            addCriterion("F_TRANS_NUM <>", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThan(String value) {
            addCriterion("F_TRANS_NUM >", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRANS_NUM >=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThan(String value) {
            addCriterion("F_TRANS_NUM <", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThanOrEqualTo(String value) {
            addCriterion("F_TRANS_NUM <=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLike(String value) {
            addCriterion("F_TRANS_NUM like", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotLike(String value) {
            addCriterion("F_TRANS_NUM not like", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumIn(List<String> values) {
            addCriterion("F_TRANS_NUM in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotIn(List<String> values) {
            addCriterion("F_TRANS_NUM not in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumBetween(String value1, String value2) {
            addCriterion("F_TRANS_NUM between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotBetween(String value1, String value2) {
            addCriterion("F_TRANS_NUM not between", value1, value2, "transNum");
            return (Criteria) this;
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

        public Criteria andOptTypeIsNull() {
            addCriterion("F_OPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNotNull() {
            addCriterion("F_OPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOptTypeEqualTo(Integer value) {
            addCriterion("F_OPT_TYPE =", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotEqualTo(Integer value) {
            addCriterion("F_OPT_TYPE <>", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThan(Integer value) {
            addCriterion("F_OPT_TYPE >", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_OPT_TYPE >=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThan(Integer value) {
            addCriterion("F_OPT_TYPE <", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_OPT_TYPE <=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeIn(List<Integer> values) {
            addCriterion("F_OPT_TYPE in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotIn(List<Integer> values) {
            addCriterion("F_OPT_TYPE not in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_OPT_TYPE between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_OPT_TYPE not between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andTransSrcIsNull() {
            addCriterion("F_TRANS_SRC is null");
            return (Criteria) this;
        }

        public Criteria andTransSrcIsNotNull() {
            addCriterion("F_TRANS_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andTransSrcEqualTo(String value) {
            addCriterion("F_TRANS_SRC =", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcNotEqualTo(String value) {
            addCriterion("F_TRANS_SRC <>", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcGreaterThan(String value) {
            addCriterion("F_TRANS_SRC >", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRANS_SRC >=", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcLessThan(String value) {
            addCriterion("F_TRANS_SRC <", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcLessThanOrEqualTo(String value) {
            addCriterion("F_TRANS_SRC <=", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcLike(String value) {
            addCriterion("F_TRANS_SRC like", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcNotLike(String value) {
            addCriterion("F_TRANS_SRC not like", value, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcIn(List<String> values) {
            addCriterion("F_TRANS_SRC in", values, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcNotIn(List<String> values) {
            addCriterion("F_TRANS_SRC not in", values, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcBetween(String value1, String value2) {
            addCriterion("F_TRANS_SRC between", value1, value2, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcNotBetween(String value1, String value2) {
            addCriterion("F_TRANS_SRC not between", value1, value2, "transSrc");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillIsNull() {
            addCriterion("F_TRANS_SRC_BILL is null");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillIsNotNull() {
            addCriterion("F_TRANS_SRC_BILL is not null");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillEqualTo(String value) {
            addCriterion("F_TRANS_SRC_BILL =", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillNotEqualTo(String value) {
            addCriterion("F_TRANS_SRC_BILL <>", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillGreaterThan(String value) {
            addCriterion("F_TRANS_SRC_BILL >", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRANS_SRC_BILL >=", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillLessThan(String value) {
            addCriterion("F_TRANS_SRC_BILL <", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillLessThanOrEqualTo(String value) {
            addCriterion("F_TRANS_SRC_BILL <=", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillLike(String value) {
            addCriterion("F_TRANS_SRC_BILL like", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillNotLike(String value) {
            addCriterion("F_TRANS_SRC_BILL not like", value, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillIn(List<String> values) {
            addCriterion("F_TRANS_SRC_BILL in", values, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillNotIn(List<String> values) {
            addCriterion("F_TRANS_SRC_BILL not in", values, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillBetween(String value1, String value2) {
            addCriterion("F_TRANS_SRC_BILL between", value1, value2, "transSrcBill");
            return (Criteria) this;
        }

        public Criteria andTransSrcBillNotBetween(String value1, String value2) {
            addCriterion("F_TRANS_SRC_BILL not between", value1, value2, "transSrcBill");
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

        public Criteria andTransDesIsNull() {
            addCriterion("F_TRANS_DES is null");
            return (Criteria) this;
        }

        public Criteria andTransDesIsNotNull() {
            addCriterion("F_TRANS_DES is not null");
            return (Criteria) this;
        }

        public Criteria andTransDesEqualTo(String value) {
            addCriterion("F_TRANS_DES =", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesNotEqualTo(String value) {
            addCriterion("F_TRANS_DES <>", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesGreaterThan(String value) {
            addCriterion("F_TRANS_DES >", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRANS_DES >=", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesLessThan(String value) {
            addCriterion("F_TRANS_DES <", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesLessThanOrEqualTo(String value) {
            addCriterion("F_TRANS_DES <=", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesLike(String value) {
            addCriterion("F_TRANS_DES like", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesNotLike(String value) {
            addCriterion("F_TRANS_DES not like", value, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesIn(List<String> values) {
            addCriterion("F_TRANS_DES in", values, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesNotIn(List<String> values) {
            addCriterion("F_TRANS_DES not in", values, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesBetween(String value1, String value2) {
            addCriterion("F_TRANS_DES between", value1, value2, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesNotBetween(String value1, String value2) {
            addCriterion("F_TRANS_DES not between", value1, value2, "transDes");
            return (Criteria) this;
        }

        public Criteria andTransDesBillIsNull() {
            addCriterion("F_TRANS_DES_BILL is null");
            return (Criteria) this;
        }

        public Criteria andTransDesBillIsNotNull() {
            addCriterion("F_TRANS_DES_BILL is not null");
            return (Criteria) this;
        }

        public Criteria andTransDesBillEqualTo(String value) {
            addCriterion("F_TRANS_DES_BILL =", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillNotEqualTo(String value) {
            addCriterion("F_TRANS_DES_BILL <>", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillGreaterThan(String value) {
            addCriterion("F_TRANS_DES_BILL >", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRANS_DES_BILL >=", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillLessThan(String value) {
            addCriterion("F_TRANS_DES_BILL <", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillLessThanOrEqualTo(String value) {
            addCriterion("F_TRANS_DES_BILL <=", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillLike(String value) {
            addCriterion("F_TRANS_DES_BILL like", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillNotLike(String value) {
            addCriterion("F_TRANS_DES_BILL not like", value, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillIn(List<String> values) {
            addCriterion("F_TRANS_DES_BILL in", values, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillNotIn(List<String> values) {
            addCriterion("F_TRANS_DES_BILL not in", values, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillBetween(String value1, String value2) {
            addCriterion("F_TRANS_DES_BILL between", value1, value2, "transDesBill");
            return (Criteria) this;
        }

        public Criteria andTransDesBillNotBetween(String value1, String value2) {
            addCriterion("F_TRANS_DES_BILL not between", value1, value2, "transDesBill");
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

        public Criteria andResultCodeIsNull() {
            addCriterion("F_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNotNull() {
            addCriterion("F_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResultCodeEqualTo(Integer value) {
            addCriterion("F_RESULT_CODE =", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotEqualTo(Integer value) {
            addCriterion("F_RESULT_CODE <>", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThan(Integer value) {
            addCriterion("F_RESULT_CODE >", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_RESULT_CODE >=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThan(Integer value) {
            addCriterion("F_RESULT_CODE <", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThanOrEqualTo(Integer value) {
            addCriterion("F_RESULT_CODE <=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeIn(List<Integer> values) {
            addCriterion("F_RESULT_CODE in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotIn(List<Integer> values) {
            addCriterion("F_RESULT_CODE not in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeBetween(Integer value1, Integer value2) {
            addCriterion("F_RESULT_CODE between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_RESULT_CODE not between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("F_TRANS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("F_TRANS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(String value) {
            addCriterion("F_TRANS_TIME =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(String value) {
            addCriterion("F_TRANS_TIME <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(String value) {
            addCriterion("F_TRANS_TIME >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRANS_TIME >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(String value) {
            addCriterion("F_TRANS_TIME <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(String value) {
            addCriterion("F_TRANS_TIME <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLike(String value) {
            addCriterion("F_TRANS_TIME like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotLike(String value) {
            addCriterion("F_TRANS_TIME not like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<String> values) {
            addCriterion("F_TRANS_TIME in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<String> values) {
            addCriterion("F_TRANS_TIME not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(String value1, String value2) {
            addCriterion("F_TRANS_TIME between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(String value1, String value2) {
            addCriterion("F_TRANS_TIME not between", value1, value2, "transTime");
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