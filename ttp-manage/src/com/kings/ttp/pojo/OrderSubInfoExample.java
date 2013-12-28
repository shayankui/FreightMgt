package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderSubInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSubInfoExample() {
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

        public Criteria andExtSubNumIsNull() {
            addCriterion("F_EXT_SUB_NUM is null");
            return (Criteria) this;
        }

        public Criteria andExtSubNumIsNotNull() {
            addCriterion("F_EXT_SUB_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andExtSubNumEqualTo(String value) {
            addCriterion("F_EXT_SUB_NUM =", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumNotEqualTo(String value) {
            addCriterion("F_EXT_SUB_NUM <>", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumGreaterThan(String value) {
            addCriterion("F_EXT_SUB_NUM >", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_EXT_SUB_NUM >=", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumLessThan(String value) {
            addCriterion("F_EXT_SUB_NUM <", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumLessThanOrEqualTo(String value) {
            addCriterion("F_EXT_SUB_NUM <=", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumLike(String value) {
            addCriterion("F_EXT_SUB_NUM like", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumNotLike(String value) {
            addCriterion("F_EXT_SUB_NUM not like", value, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumIn(List<String> values) {
            addCriterion("F_EXT_SUB_NUM in", values, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumNotIn(List<String> values) {
            addCriterion("F_EXT_SUB_NUM not in", values, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumBetween(String value1, String value2) {
            addCriterion("F_EXT_SUB_NUM between", value1, value2, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andExtSubNumNotBetween(String value1, String value2) {
            addCriterion("F_EXT_SUB_NUM not between", value1, value2, "extSubNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("F_GOODS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("F_GOODS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(String value) {
            addCriterion("F_GOODS_NUM =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(String value) {
            addCriterion("F_GOODS_NUM <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(String value) {
            addCriterion("F_GOODS_NUM >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_GOODS_NUM >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(String value) {
            addCriterion("F_GOODS_NUM <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(String value) {
            addCriterion("F_GOODS_NUM <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLike(String value) {
            addCriterion("F_GOODS_NUM like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotLike(String value) {
            addCriterion("F_GOODS_NUM not like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<String> values) {
            addCriterion("F_GOODS_NUM in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<String> values) {
            addCriterion("F_GOODS_NUM not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(String value1, String value2) {
            addCriterion("F_GOODS_NUM between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(String value1, String value2) {
            addCriterion("F_GOODS_NUM not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("F_GOODS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("F_GOODS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("F_GOODS_COUNT =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("F_GOODS_COUNT <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("F_GOODS_COUNT >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_GOODS_COUNT >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("F_GOODS_COUNT <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("F_GOODS_COUNT <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("F_GOODS_COUNT in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("F_GOODS_COUNT not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("F_GOODS_COUNT between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("F_GOODS_COUNT not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("F_GOODS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("F_GOODS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("F_GOODS_PRICE =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("F_GOODS_PRICE <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("F_GOODS_PRICE >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("F_GOODS_PRICE >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("F_GOODS_PRICE <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("F_GOODS_PRICE <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("F_GOODS_PRICE in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("F_GOODS_PRICE not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("F_GOODS_PRICE between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("F_GOODS_PRICE not between", value1, value2, "goodsPrice");
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

        public Criteria andGoodsMemoIsNull() {
            addCriterion("F_GOODS_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoIsNotNull() {
            addCriterion("F_GOODS_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoEqualTo(String value) {
            addCriterion("F_GOODS_MEMO =", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotEqualTo(String value) {
            addCriterion("F_GOODS_MEMO <>", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoGreaterThan(String value) {
            addCriterion("F_GOODS_MEMO >", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_GOODS_MEMO >=", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLessThan(String value) {
            addCriterion("F_GOODS_MEMO <", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLessThanOrEqualTo(String value) {
            addCriterion("F_GOODS_MEMO <=", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoLike(String value) {
            addCriterion("F_GOODS_MEMO like", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotLike(String value) {
            addCriterion("F_GOODS_MEMO not like", value, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoIn(List<String> values) {
            addCriterion("F_GOODS_MEMO in", values, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotIn(List<String> values) {
            addCriterion("F_GOODS_MEMO not in", values, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoBetween(String value1, String value2) {
            addCriterion("F_GOODS_MEMO between", value1, value2, "goodsMemo");
            return (Criteria) this;
        }

        public Criteria andGoodsMemoNotBetween(String value1, String value2) {
            addCriterion("F_GOODS_MEMO not between", value1, value2, "goodsMemo");
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