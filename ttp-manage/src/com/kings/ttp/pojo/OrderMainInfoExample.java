package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderMainInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderMainInfoExample() {
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

        public Criteria andInitNumIsNull() {
            addCriterion("F_INIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInitNumIsNotNull() {
            addCriterion("F_INIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInitNumEqualTo(String value) {
            addCriterion("F_INIT_NUM =", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumNotEqualTo(String value) {
            addCriterion("F_INIT_NUM <>", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumGreaterThan(String value) {
            addCriterion("F_INIT_NUM >", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_INIT_NUM >=", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumLessThan(String value) {
            addCriterion("F_INIT_NUM <", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumLessThanOrEqualTo(String value) {
            addCriterion("F_INIT_NUM <=", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumLike(String value) {
            addCriterion("F_INIT_NUM like", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumNotLike(String value) {
            addCriterion("F_INIT_NUM not like", value, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumIn(List<String> values) {
            addCriterion("F_INIT_NUM in", values, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumNotIn(List<String> values) {
            addCriterion("F_INIT_NUM not in", values, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumBetween(String value1, String value2) {
            addCriterion("F_INIT_NUM between", value1, value2, "initNum");
            return (Criteria) this;
        }

        public Criteria andInitNumNotBetween(String value1, String value2) {
            addCriterion("F_INIT_NUM not between", value1, value2, "initNum");
            return (Criteria) this;
        }

        public Criteria andExtNumIsNull() {
            addCriterion("F_EXT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andExtNumIsNotNull() {
            addCriterion("F_EXT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andExtNumEqualTo(String value) {
            addCriterion("F_EXT_NUM =", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumNotEqualTo(String value) {
            addCriterion("F_EXT_NUM <>", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumGreaterThan(String value) {
            addCriterion("F_EXT_NUM >", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_EXT_NUM >=", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumLessThan(String value) {
            addCriterion("F_EXT_NUM <", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumLessThanOrEqualTo(String value) {
            addCriterion("F_EXT_NUM <=", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumLike(String value) {
            addCriterion("F_EXT_NUM like", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumNotLike(String value) {
            addCriterion("F_EXT_NUM not like", value, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumIn(List<String> values) {
            addCriterion("F_EXT_NUM in", values, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumNotIn(List<String> values) {
            addCriterion("F_EXT_NUM not in", values, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumBetween(String value1, String value2) {
            addCriterion("F_EXT_NUM between", value1, value2, "extNum");
            return (Criteria) this;
        }

        public Criteria andExtNumNotBetween(String value1, String value2) {
            addCriterion("F_EXT_NUM not between", value1, value2, "extNum");
            return (Criteria) this;
        }

        public Criteria andOrderTitleIsNull() {
            addCriterion("F_ORDER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTitleIsNotNull() {
            addCriterion("F_ORDER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTitleEqualTo(String value) {
            addCriterion("F_ORDER_TITLE =", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotEqualTo(String value) {
            addCriterion("F_ORDER_TITLE <>", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleGreaterThan(String value) {
            addCriterion("F_ORDER_TITLE >", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_TITLE >=", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleLessThan(String value) {
            addCriterion("F_ORDER_TITLE <", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_TITLE <=", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleLike(String value) {
            addCriterion("F_ORDER_TITLE like", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotLike(String value) {
            addCriterion("F_ORDER_TITLE not like", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleIn(List<String> values) {
            addCriterion("F_ORDER_TITLE in", values, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotIn(List<String> values) {
            addCriterion("F_ORDER_TITLE not in", values, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleBetween(String value1, String value2) {
            addCriterion("F_ORDER_TITLE between", value1, value2, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_TITLE not between", value1, value2, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeIsNull() {
            addCriterion("F_ORDER_MANCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeIsNotNull() {
            addCriterion("F_ORDER_MANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeEqualTo(String value) {
            addCriterion("F_ORDER_MANCODE =", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeNotEqualTo(String value) {
            addCriterion("F_ORDER_MANCODE <>", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeGreaterThan(String value) {
            addCriterion("F_ORDER_MANCODE >", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MANCODE >=", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeLessThan(String value) {
            addCriterion("F_ORDER_MANCODE <", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MANCODE <=", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeLike(String value) {
            addCriterion("F_ORDER_MANCODE like", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeNotLike(String value) {
            addCriterion("F_ORDER_MANCODE not like", value, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeIn(List<String> values) {
            addCriterion("F_ORDER_MANCODE in", values, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeNotIn(List<String> values) {
            addCriterion("F_ORDER_MANCODE not in", values, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeBetween(String value1, String value2) {
            addCriterion("F_ORDER_MANCODE between", value1, value2, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMancodeNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_MANCODE not between", value1, value2, "orderMancode");
            return (Criteria) this;
        }

        public Criteria andOrderMannameIsNull() {
            addCriterion("F_ORDER_MANNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderMannameIsNotNull() {
            addCriterion("F_ORDER_MANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMannameEqualTo(String value) {
            addCriterion("F_ORDER_MANNAME =", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameNotEqualTo(String value) {
            addCriterion("F_ORDER_MANNAME <>", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameGreaterThan(String value) {
            addCriterion("F_ORDER_MANNAME >", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MANNAME >=", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameLessThan(String value) {
            addCriterion("F_ORDER_MANNAME <", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MANNAME <=", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameLike(String value) {
            addCriterion("F_ORDER_MANNAME like", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameNotLike(String value) {
            addCriterion("F_ORDER_MANNAME not like", value, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameIn(List<String> values) {
            addCriterion("F_ORDER_MANNAME in", values, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameNotIn(List<String> values) {
            addCriterion("F_ORDER_MANNAME not in", values, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameBetween(String value1, String value2) {
            addCriterion("F_ORDER_MANNAME between", value1, value2, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderMannameNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_MANNAME not between", value1, value2, "orderManname");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("F_ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("F_ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(String value) {
            addCriterion("F_ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(String value) {
            addCriterion("F_ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(String value) {
            addCriterion("F_ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(String value) {
            addCriterion("F_ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLike(String value) {
            addCriterion("F_ORDER_TIME like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotLike(String value) {
            addCriterion("F_ORDER_TIME not like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<String> values) {
            addCriterion("F_ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<String> values) {
            addCriterion("F_ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(String value1, String value2) {
            addCriterion("F_ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderMobileIsNull() {
            addCriterion("F_ORDER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andOrderMobileIsNotNull() {
            addCriterion("F_ORDER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMobileEqualTo(String value) {
            addCriterion("F_ORDER_MOBILE =", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileNotEqualTo(String value) {
            addCriterion("F_ORDER_MOBILE <>", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileGreaterThan(String value) {
            addCriterion("F_ORDER_MOBILE >", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MOBILE >=", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileLessThan(String value) {
            addCriterion("F_ORDER_MOBILE <", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MOBILE <=", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileLike(String value) {
            addCriterion("F_ORDER_MOBILE like", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileNotLike(String value) {
            addCriterion("F_ORDER_MOBILE not like", value, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileIn(List<String> values) {
            addCriterion("F_ORDER_MOBILE in", values, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileNotIn(List<String> values) {
            addCriterion("F_ORDER_MOBILE not in", values, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileBetween(String value1, String value2) {
            addCriterion("F_ORDER_MOBILE between", value1, value2, "orderMobile");
            return (Criteria) this;
        }

        public Criteria andOrderMobileNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_MOBILE not between", value1, value2, "orderMobile");
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

        public Criteria andDelivPlaceIdIsNull() {
            addCriterion("F_DELIV_PLACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdIsNotNull() {
            addCriterion("F_DELIV_PLACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdEqualTo(String value) {
            addCriterion("F_DELIV_PLACE_ID =", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdNotEqualTo(String value) {
            addCriterion("F_DELIV_PLACE_ID <>", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdGreaterThan(String value) {
            addCriterion("F_DELIV_PLACE_ID >", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_DELIV_PLACE_ID >=", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdLessThan(String value) {
            addCriterion("F_DELIV_PLACE_ID <", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("F_DELIV_PLACE_ID <=", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdLike(String value) {
            addCriterion("F_DELIV_PLACE_ID like", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdNotLike(String value) {
            addCriterion("F_DELIV_PLACE_ID not like", value, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdIn(List<String> values) {
            addCriterion("F_DELIV_PLACE_ID in", values, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdNotIn(List<String> values) {
            addCriterion("F_DELIV_PLACE_ID not in", values, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdBetween(String value1, String value2) {
            addCriterion("F_DELIV_PLACE_ID between", value1, value2, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivPlaceIdNotBetween(String value1, String value2) {
            addCriterion("F_DELIV_PLACE_ID not between", value1, value2, "delivPlaceId");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumIsNull() {
            addCriterion("F_DELIV_PROVINCE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumIsNotNull() {
            addCriterion("F_DELIV_PROVINCE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumEqualTo(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM =", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumNotEqualTo(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM <>", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumGreaterThan(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM >", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM >=", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumLessThan(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM <", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumLessThanOrEqualTo(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM <=", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumLike(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM like", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumNotLike(String value) {
            addCriterion("F_DELIV_PROVINCE_NUM not like", value, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumIn(List<String> values) {
            addCriterion("F_DELIV_PROVINCE_NUM in", values, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumNotIn(List<String> values) {
            addCriterion("F_DELIV_PROVINCE_NUM not in", values, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumBetween(String value1, String value2) {
            addCriterion("F_DELIV_PROVINCE_NUM between", value1, value2, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivProvinceNumNotBetween(String value1, String value2) {
            addCriterion("F_DELIV_PROVINCE_NUM not between", value1, value2, "delivProvinceNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumIsNull() {
            addCriterion("F_DELIV_REGION_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumIsNotNull() {
            addCriterion("F_DELIV_REGION_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumEqualTo(String value) {
            addCriterion("F_DELIV_REGION_NUM =", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumNotEqualTo(String value) {
            addCriterion("F_DELIV_REGION_NUM <>", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumGreaterThan(String value) {
            addCriterion("F_DELIV_REGION_NUM >", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_DELIV_REGION_NUM >=", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumLessThan(String value) {
            addCriterion("F_DELIV_REGION_NUM <", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumLessThanOrEqualTo(String value) {
            addCriterion("F_DELIV_REGION_NUM <=", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumLike(String value) {
            addCriterion("F_DELIV_REGION_NUM like", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumNotLike(String value) {
            addCriterion("F_DELIV_REGION_NUM not like", value, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumIn(List<String> values) {
            addCriterion("F_DELIV_REGION_NUM in", values, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumNotIn(List<String> values) {
            addCriterion("F_DELIV_REGION_NUM not in", values, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumBetween(String value1, String value2) {
            addCriterion("F_DELIV_REGION_NUM between", value1, value2, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivRegionNumNotBetween(String value1, String value2) {
            addCriterion("F_DELIV_REGION_NUM not between", value1, value2, "delivRegionNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumIsNull() {
            addCriterion("F_DELIV_COUNTRY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumIsNotNull() {
            addCriterion("F_DELIV_COUNTRY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumEqualTo(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM =", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumNotEqualTo(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM <>", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumGreaterThan(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM >", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM >=", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumLessThan(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM <", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumLessThanOrEqualTo(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM <=", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumLike(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM like", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumNotLike(String value) {
            addCriterion("F_DELIV_COUNTRY_NUM not like", value, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumIn(List<String> values) {
            addCriterion("F_DELIV_COUNTRY_NUM in", values, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumNotIn(List<String> values) {
            addCriterion("F_DELIV_COUNTRY_NUM not in", values, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumBetween(String value1, String value2) {
            addCriterion("F_DELIV_COUNTRY_NUM between", value1, value2, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivCountryNumNotBetween(String value1, String value2) {
            addCriterion("F_DELIV_COUNTRY_NUM not between", value1, value2, "delivCountryNum");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressIsNull() {
            addCriterion("F_DELIV_DETAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressIsNotNull() {
            addCriterion("F_DELIV_DETAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressEqualTo(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS =", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressNotEqualTo(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS <>", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressGreaterThan(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS >", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS >=", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressLessThan(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS <", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS <=", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressLike(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS like", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressNotLike(String value) {
            addCriterion("F_DELIV_DETAIL_ADDRESS not like", value, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressIn(List<String> values) {
            addCriterion("F_DELIV_DETAIL_ADDRESS in", values, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressNotIn(List<String> values) {
            addCriterion("F_DELIV_DETAIL_ADDRESS not in", values, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressBetween(String value1, String value2) {
            addCriterion("F_DELIV_DETAIL_ADDRESS between", value1, value2, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDelivDetailAddressNotBetween(String value1, String value2) {
            addCriterion("F_DELIV_DETAIL_ADDRESS not between", value1, value2, "delivDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdIsNull() {
            addCriterion("F_RECEIVE_PLACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdIsNotNull() {
            addCriterion("F_RECEIVE_PLACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdEqualTo(String value) {
            addCriterion("F_RECEIVE_PLACE_ID =", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdNotEqualTo(String value) {
            addCriterion("F_RECEIVE_PLACE_ID <>", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdGreaterThan(String value) {
            addCriterion("F_RECEIVE_PLACE_ID >", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_PLACE_ID >=", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdLessThan(String value) {
            addCriterion("F_RECEIVE_PLACE_ID <", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdLessThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_PLACE_ID <=", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdLike(String value) {
            addCriterion("F_RECEIVE_PLACE_ID like", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdNotLike(String value) {
            addCriterion("F_RECEIVE_PLACE_ID not like", value, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdIn(List<String> values) {
            addCriterion("F_RECEIVE_PLACE_ID in", values, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdNotIn(List<String> values) {
            addCriterion("F_RECEIVE_PLACE_ID not in", values, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_PLACE_ID between", value1, value2, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceivePlaceIdNotBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_PLACE_ID not between", value1, value2, "receivePlaceId");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumIsNull() {
            addCriterion("F_RECEIVE_PROVINCE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumIsNotNull() {
            addCriterion("F_RECEIVE_PROVINCE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumEqualTo(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM =", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumNotEqualTo(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM <>", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumGreaterThan(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM >", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM >=", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumLessThan(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM <", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumLessThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM <=", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumLike(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM like", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumNotLike(String value) {
            addCriterion("F_RECEIVE_PROVINCE_NUM not like", value, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumIn(List<String> values) {
            addCriterion("F_RECEIVE_PROVINCE_NUM in", values, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumNotIn(List<String> values) {
            addCriterion("F_RECEIVE_PROVINCE_NUM not in", values, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_PROVINCE_NUM between", value1, value2, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNumNotBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_PROVINCE_NUM not between", value1, value2, "receiveProvinceNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumIsNull() {
            addCriterion("F_RECEIVE_REGION_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumIsNotNull() {
            addCriterion("F_RECEIVE_REGION_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumEqualTo(String value) {
            addCriterion("F_RECEIVE_REGION_NUM =", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumNotEqualTo(String value) {
            addCriterion("F_RECEIVE_REGION_NUM <>", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumGreaterThan(String value) {
            addCriterion("F_RECEIVE_REGION_NUM >", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_REGION_NUM >=", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumLessThan(String value) {
            addCriterion("F_RECEIVE_REGION_NUM <", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumLessThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_REGION_NUM <=", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumLike(String value) {
            addCriterion("F_RECEIVE_REGION_NUM like", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumNotLike(String value) {
            addCriterion("F_RECEIVE_REGION_NUM not like", value, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumIn(List<String> values) {
            addCriterion("F_RECEIVE_REGION_NUM in", values, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumNotIn(List<String> values) {
            addCriterion("F_RECEIVE_REGION_NUM not in", values, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_REGION_NUM between", value1, value2, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRegionNumNotBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_REGION_NUM not between", value1, value2, "receiveRegionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumIsNull() {
            addCriterion("F_RECEIVE_COUNTRY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumIsNotNull() {
            addCriterion("F_RECEIVE_COUNTRY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumEqualTo(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM =", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumNotEqualTo(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM <>", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumGreaterThan(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM >", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM >=", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumLessThan(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM <", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumLessThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM <=", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumLike(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM like", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumNotLike(String value) {
            addCriterion("F_RECEIVE_COUNTRY_NUM not like", value, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumIn(List<String> values) {
            addCriterion("F_RECEIVE_COUNTRY_NUM in", values, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumNotIn(List<String> values) {
            addCriterion("F_RECEIVE_COUNTRY_NUM not in", values, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_COUNTRY_NUM between", value1, value2, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveCountryNumNotBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_COUNTRY_NUM not between", value1, value2, "receiveCountryNum");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressIsNull() {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressIsNotNull() {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressEqualTo(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS =", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotEqualTo(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS <>", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressGreaterThan(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS >", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS >=", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressLessThan(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS <", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS <=", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressLike(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS like", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotLike(String value) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS not like", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressIn(List<String> values) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS in", values, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotIn(List<String> values) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS not in", values, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS between", value1, value2, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotBetween(String value1, String value2) {
            addCriterion("F_RECEIVE_DETAIL_ADDRESS not between", value1, value2, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("F_DRIVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("F_DRIVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("F_DRIVER_ID =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("F_DRIVER_ID <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("F_DRIVER_ID >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_ID >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("F_DRIVER_ID <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_ID <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("F_DRIVER_ID like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("F_DRIVER_ID not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("F_DRIVER_ID in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("F_DRIVER_ID not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("F_DRIVER_ID between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("F_DRIVER_ID not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("F_DRIVER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("F_DRIVER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("F_DRIVER_NAME =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("F_DRIVER_NAME <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("F_DRIVER_NAME >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_NAME >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("F_DRIVER_NAME <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_NAME <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("F_DRIVER_NAME like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("F_DRIVER_NAME not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("F_DRIVER_NAME in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("F_DRIVER_NAME not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("F_DRIVER_NAME between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("F_DRIVER_NAME not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIsNull() {
            addCriterion("F_DRIVER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIsNotNull() {
            addCriterion("F_DRIVER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andDriverMobileEqualTo(String value) {
            addCriterion("F_DRIVER_MOBILE =", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotEqualTo(String value) {
            addCriterion("F_DRIVER_MOBILE <>", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileGreaterThan(String value) {
            addCriterion("F_DRIVER_MOBILE >", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_MOBILE >=", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLessThan(String value) {
            addCriterion("F_DRIVER_MOBILE <", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLessThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_MOBILE <=", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLike(String value) {
            addCriterion("F_DRIVER_MOBILE like", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotLike(String value) {
            addCriterion("F_DRIVER_MOBILE not like", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIn(List<String> values) {
            addCriterion("F_DRIVER_MOBILE in", values, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotIn(List<String> values) {
            addCriterion("F_DRIVER_MOBILE not in", values, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileBetween(String value1, String value2) {
            addCriterion("F_DRIVER_MOBILE between", value1, value2, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotBetween(String value1, String value2) {
            addCriterion("F_DRIVER_MOBILE not between", value1, value2, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeIsNull() {
            addCriterion("F_DRIVER_CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeIsNotNull() {
            addCriterion("F_DRIVER_CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeEqualTo(Integer value) {
            addCriterion("F_DRIVER_CLIENT_TYPE =", value, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeNotEqualTo(Integer value) {
            addCriterion("F_DRIVER_CLIENT_TYPE <>", value, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeGreaterThan(Integer value) {
            addCriterion("F_DRIVER_CLIENT_TYPE >", value, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_DRIVER_CLIENT_TYPE >=", value, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeLessThan(Integer value) {
            addCriterion("F_DRIVER_CLIENT_TYPE <", value, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_DRIVER_CLIENT_TYPE <=", value, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeIn(List<Integer> values) {
            addCriterion("F_DRIVER_CLIENT_TYPE in", values, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeNotIn(List<Integer> values) {
            addCriterion("F_DRIVER_CLIENT_TYPE not in", values, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_DRIVER_CLIENT_TYPE between", value1, value2, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_DRIVER_CLIENT_TYPE not between", value1, value2, "driverClientType");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiIsNull() {
            addCriterion("F_DRIVER_CLIENT_IMEI is null");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiIsNotNull() {
            addCriterion("F_DRIVER_CLIENT_IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiEqualTo(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI =", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiNotEqualTo(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI <>", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiGreaterThan(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI >", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiGreaterThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI >=", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiLessThan(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI <", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiLessThanOrEqualTo(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI <=", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiLike(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI like", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiNotLike(String value) {
            addCriterion("F_DRIVER_CLIENT_IMEI not like", value, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiIn(List<String> values) {
            addCriterion("F_DRIVER_CLIENT_IMEI in", values, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiNotIn(List<String> values) {
            addCriterion("F_DRIVER_CLIENT_IMEI not in", values, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiBetween(String value1, String value2) {
            addCriterion("F_DRIVER_CLIENT_IMEI between", value1, value2, "driverClientImei");
            return (Criteria) this;
        }

        public Criteria andDriverClientImeiNotBetween(String value1, String value2) {
            addCriterion("F_DRIVER_CLIENT_IMEI not between", value1, value2, "driverClientImei");
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

        public Criteria andValidDateIsNull() {
            addCriterion("F_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("F_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("F_VALID_DATE =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("F_VALID_DATE <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("F_VALID_DATE >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("F_VALID_DATE >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("F_VALID_DATE <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("F_VALID_DATE <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("F_VALID_DATE like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("F_VALID_DATE not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("F_VALID_DATE in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("F_VALID_DATE not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("F_VALID_DATE between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("F_VALID_DATE not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("F_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("F_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("F_PAY_TIME =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("F_PAY_TIME <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("F_PAY_TIME >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_PAY_TIME >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("F_PAY_TIME <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("F_PAY_TIME <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("F_PAY_TIME like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("F_PAY_TIME not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("F_PAY_TIME in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("F_PAY_TIME not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("F_PAY_TIME between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("F_PAY_TIME not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("F_CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("F_CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(String value) {
            addCriterion("F_CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(String value) {
            addCriterion("F_CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(String value) {
            addCriterion("F_CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(String value) {
            addCriterion("F_CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(String value) {
            addCriterion("F_CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(String value) {
            addCriterion("F_CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLike(String value) {
            addCriterion("F_CHECK_DATE like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotLike(String value) {
            addCriterion("F_CHECK_DATE not like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<String> values) {
            addCriterion("F_CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<String> values) {
            addCriterion("F_CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(String value1, String value2) {
            addCriterion("F_CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(String value1, String value2) {
            addCriterion("F_CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNull() {
            addCriterion("F_ORDER_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNotNull() {
            addCriterion("F_ORDER_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoEqualTo(String value) {
            addCriterion("F_ORDER_MEMO =", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotEqualTo(String value) {
            addCriterion("F_ORDER_MEMO <>", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThan(String value) {
            addCriterion("F_ORDER_MEMO >", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MEMO >=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThan(String value) {
            addCriterion("F_ORDER_MEMO <", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThanOrEqualTo(String value) {
            addCriterion("F_ORDER_MEMO <=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLike(String value) {
            addCriterion("F_ORDER_MEMO like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotLike(String value) {
            addCriterion("F_ORDER_MEMO not like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIn(List<String> values) {
            addCriterion("F_ORDER_MEMO in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotIn(List<String> values) {
            addCriterion("F_ORDER_MEMO not in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoBetween(String value1, String value2) {
            addCriterion("F_ORDER_MEMO between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotBetween(String value1, String value2) {
            addCriterion("F_ORDER_MEMO not between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("F_ORDER_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("F_ORDER_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(Double value) {
            addCriterion("F_ORDER_MONEY =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(Double value) {
            addCriterion("F_ORDER_MONEY <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(Double value) {
            addCriterion("F_ORDER_MONEY >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("F_ORDER_MONEY >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(Double value) {
            addCriterion("F_ORDER_MONEY <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("F_ORDER_MONEY <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<Double> values) {
            addCriterion("F_ORDER_MONEY in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<Double> values) {
            addCriterion("F_ORDER_MONEY not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("F_ORDER_MONEY between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("F_ORDER_MONEY not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderIspayIsNull() {
            addCriterion("F_ORDER_ISPAY is null");
            return (Criteria) this;
        }

        public Criteria andOrderIspayIsNotNull() {
            addCriterion("F_ORDER_ISPAY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIspayEqualTo(Integer value) {
            addCriterion("F_ORDER_ISPAY =", value, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayNotEqualTo(Integer value) {
            addCriterion("F_ORDER_ISPAY <>", value, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayGreaterThan(Integer value) {
            addCriterion("F_ORDER_ISPAY >", value, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ORDER_ISPAY >=", value, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayLessThan(Integer value) {
            addCriterion("F_ORDER_ISPAY <", value, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayLessThanOrEqualTo(Integer value) {
            addCriterion("F_ORDER_ISPAY <=", value, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayIn(List<Integer> values) {
            addCriterion("F_ORDER_ISPAY in", values, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayNotIn(List<Integer> values) {
            addCriterion("F_ORDER_ISPAY not in", values, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayBetween(Integer value1, Integer value2) {
            addCriterion("F_ORDER_ISPAY between", value1, value2, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderIspayNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ORDER_ISPAY not between", value1, value2, "orderIspay");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyIsNull() {
            addCriterion("F_ORDER_PAYMONEY is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyIsNotNull() {
            addCriterion("F_ORDER_PAYMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyEqualTo(Double value) {
            addCriterion("F_ORDER_PAYMONEY =", value, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyNotEqualTo(Double value) {
            addCriterion("F_ORDER_PAYMONEY <>", value, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyGreaterThan(Double value) {
            addCriterion("F_ORDER_PAYMONEY >", value, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("F_ORDER_PAYMONEY >=", value, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyLessThan(Double value) {
            addCriterion("F_ORDER_PAYMONEY <", value, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyLessThanOrEqualTo(Double value) {
            addCriterion("F_ORDER_PAYMONEY <=", value, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyIn(List<Double> values) {
            addCriterion("F_ORDER_PAYMONEY in", values, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyNotIn(List<Double> values) {
            addCriterion("F_ORDER_PAYMONEY not in", values, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyBetween(Double value1, Double value2) {
            addCriterion("F_ORDER_PAYMONEY between", value1, value2, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderPaymoneyNotBetween(Double value1, Double value2) {
            addCriterion("F_ORDER_PAYMONEY not between", value1, value2, "orderPaymoney");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIsNull() {
            addCriterion("F_ORDER_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIsNotNull() {
            addCriterion("F_ORDER_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountEqualTo(Double value) {
            addCriterion("F_ORDER_DISCOUNT =", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotEqualTo(Double value) {
            addCriterion("F_ORDER_DISCOUNT <>", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountGreaterThan(Double value) {
            addCriterion("F_ORDER_DISCOUNT >", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("F_ORDER_DISCOUNT >=", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLessThan(Double value) {
            addCriterion("F_ORDER_DISCOUNT <", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLessThanOrEqualTo(Double value) {
            addCriterion("F_ORDER_DISCOUNT <=", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIn(List<Double> values) {
            addCriterion("F_ORDER_DISCOUNT in", values, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotIn(List<Double> values) {
            addCriterion("F_ORDER_DISCOUNT not in", values, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountBetween(Double value1, Double value2) {
            addCriterion("F_ORDER_DISCOUNT between", value1, value2, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotBetween(Double value1, Double value2) {
            addCriterion("F_ORDER_DISCOUNT not between", value1, value2, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andIsEvalIsNull() {
            addCriterion("F_IS_EVAL is null");
            return (Criteria) this;
        }

        public Criteria andIsEvalIsNotNull() {
            addCriterion("F_IS_EVAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsEvalEqualTo(Integer value) {
            addCriterion("F_IS_EVAL =", value, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalNotEqualTo(Integer value) {
            addCriterion("F_IS_EVAL <>", value, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalGreaterThan(Integer value) {
            addCriterion("F_IS_EVAL >", value, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_IS_EVAL >=", value, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalLessThan(Integer value) {
            addCriterion("F_IS_EVAL <", value, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalLessThanOrEqualTo(Integer value) {
            addCriterion("F_IS_EVAL <=", value, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalIn(List<Integer> values) {
            addCriterion("F_IS_EVAL in", values, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalNotIn(List<Integer> values) {
            addCriterion("F_IS_EVAL not in", values, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalBetween(Integer value1, Integer value2) {
            addCriterion("F_IS_EVAL between", value1, value2, "isEval");
            return (Criteria) this;
        }

        public Criteria andIsEvalNotBetween(Integer value1, Integer value2) {
            addCriterion("F_IS_EVAL not between", value1, value2, "isEval");
            return (Criteria) this;
        }

        public Criteria andLastMancodeIsNull() {
            addCriterion("F_LAST_MANCODE is null");
            return (Criteria) this;
        }

        public Criteria andLastMancodeIsNotNull() {
            addCriterion("F_LAST_MANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastMancodeEqualTo(String value) {
            addCriterion("F_LAST_MANCODE =", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeNotEqualTo(String value) {
            addCriterion("F_LAST_MANCODE <>", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeGreaterThan(String value) {
            addCriterion("F_LAST_MANCODE >", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_LAST_MANCODE >=", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeLessThan(String value) {
            addCriterion("F_LAST_MANCODE <", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeLessThanOrEqualTo(String value) {
            addCriterion("F_LAST_MANCODE <=", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeLike(String value) {
            addCriterion("F_LAST_MANCODE like", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeNotLike(String value) {
            addCriterion("F_LAST_MANCODE not like", value, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeIn(List<String> values) {
            addCriterion("F_LAST_MANCODE in", values, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeNotIn(List<String> values) {
            addCriterion("F_LAST_MANCODE not in", values, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeBetween(String value1, String value2) {
            addCriterion("F_LAST_MANCODE between", value1, value2, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMancodeNotBetween(String value1, String value2) {
            addCriterion("F_LAST_MANCODE not between", value1, value2, "lastMancode");
            return (Criteria) this;
        }

        public Criteria andLastMannameIsNull() {
            addCriterion("F_LAST_MANNAME is null");
            return (Criteria) this;
        }

        public Criteria andLastMannameIsNotNull() {
            addCriterion("F_LAST_MANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastMannameEqualTo(String value) {
            addCriterion("F_LAST_MANNAME =", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameNotEqualTo(String value) {
            addCriterion("F_LAST_MANNAME <>", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameGreaterThan(String value) {
            addCriterion("F_LAST_MANNAME >", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameGreaterThanOrEqualTo(String value) {
            addCriterion("F_LAST_MANNAME >=", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameLessThan(String value) {
            addCriterion("F_LAST_MANNAME <", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameLessThanOrEqualTo(String value) {
            addCriterion("F_LAST_MANNAME <=", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameLike(String value) {
            addCriterion("F_LAST_MANNAME like", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameNotLike(String value) {
            addCriterion("F_LAST_MANNAME not like", value, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameIn(List<String> values) {
            addCriterion("F_LAST_MANNAME in", values, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameNotIn(List<String> values) {
            addCriterion("F_LAST_MANNAME not in", values, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameBetween(String value1, String value2) {
            addCriterion("F_LAST_MANNAME between", value1, value2, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastMannameNotBetween(String value1, String value2) {
            addCriterion("F_LAST_MANNAME not between", value1, value2, "lastManname");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("F_LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("F_LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(String value) {
            addCriterion("F_LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(String value) {
            addCriterion("F_LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(String value) {
            addCriterion("F_LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(String value) {
            addCriterion("F_LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(String value) {
            addCriterion("F_LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLike(String value) {
            addCriterion("F_LAST_TIME like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotLike(String value) {
            addCriterion("F_LAST_TIME not like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<String> values) {
            addCriterion("F_LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<String> values) {
            addCriterion("F_LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(String value1, String value2) {
            addCriterion("F_LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(String value1, String value2) {
            addCriterion("F_LAST_TIME not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastMemoIsNull() {
            addCriterion("F_LAST_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andLastMemoIsNotNull() {
            addCriterion("F_LAST_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andLastMemoEqualTo(String value) {
            addCriterion("F_LAST_MEMO =", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoNotEqualTo(String value) {
            addCriterion("F_LAST_MEMO <>", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoGreaterThan(String value) {
            addCriterion("F_LAST_MEMO >", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_LAST_MEMO >=", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoLessThan(String value) {
            addCriterion("F_LAST_MEMO <", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoLessThanOrEqualTo(String value) {
            addCriterion("F_LAST_MEMO <=", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoLike(String value) {
            addCriterion("F_LAST_MEMO like", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoNotLike(String value) {
            addCriterion("F_LAST_MEMO not like", value, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoIn(List<String> values) {
            addCriterion("F_LAST_MEMO in", values, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoNotIn(List<String> values) {
            addCriterion("F_LAST_MEMO not in", values, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoBetween(String value1, String value2) {
            addCriterion("F_LAST_MEMO between", value1, value2, "lastMemo");
            return (Criteria) this;
        }

        public Criteria andLastMemoNotBetween(String value1, String value2) {
            addCriterion("F_LAST_MEMO not between", value1, value2, "lastMemo");
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