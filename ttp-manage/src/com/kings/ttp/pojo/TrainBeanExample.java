package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainBeanExample() {
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

        public Criteria andTrainIdIsNull() {
            addCriterion("F_TRAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("F_TRAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(String value) {
            addCriterion("F_TRAIN_ID =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(String value) {
            addCriterion("F_TRAIN_ID <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(String value) {
            addCriterion("F_TRAIN_ID >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRAIN_ID >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(String value) {
            addCriterion("F_TRAIN_ID <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(String value) {
            addCriterion("F_TRAIN_ID <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLike(String value) {
            addCriterion("F_TRAIN_ID like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotLike(String value) {
            addCriterion("F_TRAIN_ID not like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<String> values) {
            addCriterion("F_TRAIN_ID in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<String> values) {
            addCriterion("F_TRAIN_ID not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(String value1, String value2) {
            addCriterion("F_TRAIN_ID between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(String value1, String value2) {
            addCriterion("F_TRAIN_ID not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIsNull() {
            addCriterion("F_TRAIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTrainNumIsNotNull() {
            addCriterion("F_TRAIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNumEqualTo(String value) {
            addCriterion("F_TRAIN_NUM =", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumNotEqualTo(String value) {
            addCriterion("F_TRAIN_NUM <>", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumGreaterThan(String value) {
            addCriterion("F_TRAIN_NUM >", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRAIN_NUM >=", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumLessThan(String value) {
            addCriterion("F_TRAIN_NUM <", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumLessThanOrEqualTo(String value) {
            addCriterion("F_TRAIN_NUM <=", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumLike(String value) {
            addCriterion("F_TRAIN_NUM like", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumNotLike(String value) {
            addCriterion("F_TRAIN_NUM not like", value, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumIn(List<String> values) {
            addCriterion("F_TRAIN_NUM in", values, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumNotIn(List<String> values) {
            addCriterion("F_TRAIN_NUM not in", values, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumBetween(String value1, String value2) {
            addCriterion("F_TRAIN_NUM between", value1, value2, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainNumNotBetween(String value1, String value2) {
            addCriterion("F_TRAIN_NUM not between", value1, value2, "trainNum");
            return (Criteria) this;
        }

        public Criteria andTrainLengthIsNull() {
            addCriterion("F_TRAIN_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andTrainLengthIsNotNull() {
            addCriterion("F_TRAIN_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andTrainLengthEqualTo(Double value) {
            addCriterion("F_TRAIN_LENGTH =", value, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthNotEqualTo(Double value) {
            addCriterion("F_TRAIN_LENGTH <>", value, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthGreaterThan(Double value) {
            addCriterion("F_TRAIN_LENGTH >", value, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_LENGTH >=", value, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthLessThan(Double value) {
            addCriterion("F_TRAIN_LENGTH <", value, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthLessThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_LENGTH <=", value, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthIn(List<Double> values) {
            addCriterion("F_TRAIN_LENGTH in", values, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthNotIn(List<Double> values) {
            addCriterion("F_TRAIN_LENGTH not in", values, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_LENGTH between", value1, value2, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainLengthNotBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_LENGTH not between", value1, value2, "trainLength");
            return (Criteria) this;
        }

        public Criteria andTrainWidthIsNull() {
            addCriterion("F_TRAIN_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andTrainWidthIsNotNull() {
            addCriterion("F_TRAIN_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andTrainWidthEqualTo(Double value) {
            addCriterion("F_TRAIN_WIDTH =", value, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthNotEqualTo(Double value) {
            addCriterion("F_TRAIN_WIDTH <>", value, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthGreaterThan(Double value) {
            addCriterion("F_TRAIN_WIDTH >", value, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_WIDTH >=", value, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthLessThan(Double value) {
            addCriterion("F_TRAIN_WIDTH <", value, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthLessThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_WIDTH <=", value, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthIn(List<Double> values) {
            addCriterion("F_TRAIN_WIDTH in", values, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthNotIn(List<Double> values) {
            addCriterion("F_TRAIN_WIDTH not in", values, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_WIDTH between", value1, value2, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainWidthNotBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_WIDTH not between", value1, value2, "trainWidth");
            return (Criteria) this;
        }

        public Criteria andTrainHeightIsNull() {
            addCriterion("F_TRAIN_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andTrainHeightIsNotNull() {
            addCriterion("F_TRAIN_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andTrainHeightEqualTo(Double value) {
            addCriterion("F_TRAIN_HEIGHT =", value, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightNotEqualTo(Double value) {
            addCriterion("F_TRAIN_HEIGHT <>", value, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightGreaterThan(Double value) {
            addCriterion("F_TRAIN_HEIGHT >", value, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_HEIGHT >=", value, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightLessThan(Double value) {
            addCriterion("F_TRAIN_HEIGHT <", value, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightLessThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_HEIGHT <=", value, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightIn(List<Double> values) {
            addCriterion("F_TRAIN_HEIGHT in", values, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightNotIn(List<Double> values) {
            addCriterion("F_TRAIN_HEIGHT not in", values, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_HEIGHT between", value1, value2, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainHeightNotBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_HEIGHT not between", value1, value2, "trainHeight");
            return (Criteria) this;
        }

        public Criteria andTrainSizeIsNull() {
            addCriterion("F_TRAIN_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTrainSizeIsNotNull() {
            addCriterion("F_TRAIN_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTrainSizeEqualTo(Double value) {
            addCriterion("F_TRAIN_SIZE =", value, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeNotEqualTo(Double value) {
            addCriterion("F_TRAIN_SIZE <>", value, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeGreaterThan(Double value) {
            addCriterion("F_TRAIN_SIZE >", value, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_SIZE >=", value, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeLessThan(Double value) {
            addCriterion("F_TRAIN_SIZE <", value, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeLessThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_SIZE <=", value, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeIn(List<Double> values) {
            addCriterion("F_TRAIN_SIZE in", values, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeNotIn(List<Double> values) {
            addCriterion("F_TRAIN_SIZE not in", values, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_SIZE between", value1, value2, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainSizeNotBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_SIZE not between", value1, value2, "trainSize");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightIsNull() {
            addCriterion("F_TRAIN_MAX_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightIsNotNull() {
            addCriterion("F_TRAIN_MAX_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightEqualTo(Double value) {
            addCriterion("F_TRAIN_MAX_WEIGHT =", value, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightNotEqualTo(Double value) {
            addCriterion("F_TRAIN_MAX_WEIGHT <>", value, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightGreaterThan(Double value) {
            addCriterion("F_TRAIN_MAX_WEIGHT >", value, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_MAX_WEIGHT >=", value, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightLessThan(Double value) {
            addCriterion("F_TRAIN_MAX_WEIGHT <", value, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightLessThanOrEqualTo(Double value) {
            addCriterion("F_TRAIN_MAX_WEIGHT <=", value, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightIn(List<Double> values) {
            addCriterion("F_TRAIN_MAX_WEIGHT in", values, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightNotIn(List<Double> values) {
            addCriterion("F_TRAIN_MAX_WEIGHT not in", values, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_MAX_WEIGHT between", value1, value2, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainMaxWeightNotBetween(Double value1, Double value2) {
            addCriterion("F_TRAIN_MAX_WEIGHT not between", value1, value2, "trainMaxWeight");
            return (Criteria) this;
        }

        public Criteria andTrainBrandIsNull() {
            addCriterion("F_TRAIN_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andTrainBrandIsNotNull() {
            addCriterion("F_TRAIN_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andTrainBrandEqualTo(String value) {
            addCriterion("F_TRAIN_BRAND =", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandNotEqualTo(String value) {
            addCriterion("F_TRAIN_BRAND <>", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandGreaterThan(String value) {
            addCriterion("F_TRAIN_BRAND >", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandGreaterThanOrEqualTo(String value) {
            addCriterion("F_TRAIN_BRAND >=", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandLessThan(String value) {
            addCriterion("F_TRAIN_BRAND <", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandLessThanOrEqualTo(String value) {
            addCriterion("F_TRAIN_BRAND <=", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandLike(String value) {
            addCriterion("F_TRAIN_BRAND like", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandNotLike(String value) {
            addCriterion("F_TRAIN_BRAND not like", value, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandIn(List<String> values) {
            addCriterion("F_TRAIN_BRAND in", values, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandNotIn(List<String> values) {
            addCriterion("F_TRAIN_BRAND not in", values, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandBetween(String value1, String value2) {
            addCriterion("F_TRAIN_BRAND between", value1, value2, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andTrainBrandNotBetween(String value1, String value2) {
            addCriterion("F_TRAIN_BRAND not between", value1, value2, "trainBrand");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedIsNull() {
            addCriterion("F_BEEN_RUNNED is null");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedIsNotNull() {
            addCriterion("F_BEEN_RUNNED is not null");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedEqualTo(Integer value) {
            addCriterion("F_BEEN_RUNNED =", value, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedNotEqualTo(Integer value) {
            addCriterion("F_BEEN_RUNNED <>", value, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedGreaterThan(Integer value) {
            addCriterion("F_BEEN_RUNNED >", value, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_BEEN_RUNNED >=", value, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedLessThan(Integer value) {
            addCriterion("F_BEEN_RUNNED <", value, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedLessThanOrEqualTo(Integer value) {
            addCriterion("F_BEEN_RUNNED <=", value, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedIn(List<Integer> values) {
            addCriterion("F_BEEN_RUNNED in", values, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedNotIn(List<Integer> values) {
            addCriterion("F_BEEN_RUNNED not in", values, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedBetween(Integer value1, Integer value2) {
            addCriterion("F_BEEN_RUNNED between", value1, value2, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andBeenRunnedNotBetween(Integer value1, Integer value2) {
            addCriterion("F_BEEN_RUNNED not between", value1, value2, "beenRunned");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeIsNull() {
            addCriterion("F_FACTORY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeIsNotNull() {
            addCriterion("F_FACTORY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeEqualTo(String value) {
            addCriterion("F_FACTORY_TIME =", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeNotEqualTo(String value) {
            addCriterion("F_FACTORY_TIME <>", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeGreaterThan(String value) {
            addCriterion("F_FACTORY_TIME >", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_FACTORY_TIME >=", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeLessThan(String value) {
            addCriterion("F_FACTORY_TIME <", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeLessThanOrEqualTo(String value) {
            addCriterion("F_FACTORY_TIME <=", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeLike(String value) {
            addCriterion("F_FACTORY_TIME like", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeNotLike(String value) {
            addCriterion("F_FACTORY_TIME not like", value, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeIn(List<String> values) {
            addCriterion("F_FACTORY_TIME in", values, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeNotIn(List<String> values) {
            addCriterion("F_FACTORY_TIME not in", values, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeBetween(String value1, String value2) {
            addCriterion("F_FACTORY_TIME between", value1, value2, "factoryTime");
            return (Criteria) this;
        }

        public Criteria andFactoryTimeNotBetween(String value1, String value2) {
            addCriterion("F_FACTORY_TIME not between", value1, value2, "factoryTime");
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

        public Criteria andPic1IsNull() {
            addCriterion("F_PIC1 is null");
            return (Criteria) this;
        }

        public Criteria andPic1IsNotNull() {
            addCriterion("F_PIC1 is not null");
            return (Criteria) this;
        }

        public Criteria andPic1EqualTo(String value) {
            addCriterion("F_PIC1 =", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotEqualTo(String value) {
            addCriterion("F_PIC1 <>", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThan(String value) {
            addCriterion("F_PIC1 >", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThanOrEqualTo(String value) {
            addCriterion("F_PIC1 >=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThan(String value) {
            addCriterion("F_PIC1 <", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThanOrEqualTo(String value) {
            addCriterion("F_PIC1 <=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Like(String value) {
            addCriterion("F_PIC1 like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotLike(String value) {
            addCriterion("F_PIC1 not like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1In(List<String> values) {
            addCriterion("F_PIC1 in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotIn(List<String> values) {
            addCriterion("F_PIC1 not in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Between(String value1, String value2) {
            addCriterion("F_PIC1 between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotBetween(String value1, String value2) {
            addCriterion("F_PIC1 not between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic2IsNull() {
            addCriterion("F_PIC2 is null");
            return (Criteria) this;
        }

        public Criteria andPic2IsNotNull() {
            addCriterion("F_PIC2 is not null");
            return (Criteria) this;
        }

        public Criteria andPic2EqualTo(String value) {
            addCriterion("F_PIC2 =", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotEqualTo(String value) {
            addCriterion("F_PIC2 <>", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThan(String value) {
            addCriterion("F_PIC2 >", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThanOrEqualTo(String value) {
            addCriterion("F_PIC2 >=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThan(String value) {
            addCriterion("F_PIC2 <", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThanOrEqualTo(String value) {
            addCriterion("F_PIC2 <=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Like(String value) {
            addCriterion("F_PIC2 like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotLike(String value) {
            addCriterion("F_PIC2 not like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2In(List<String> values) {
            addCriterion("F_PIC2 in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotIn(List<String> values) {
            addCriterion("F_PIC2 not in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Between(String value1, String value2) {
            addCriterion("F_PIC2 between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotBetween(String value1, String value2) {
            addCriterion("F_PIC2 not between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic3IsNull() {
            addCriterion("F_PIC3 is null");
            return (Criteria) this;
        }

        public Criteria andPic3IsNotNull() {
            addCriterion("F_PIC3 is not null");
            return (Criteria) this;
        }

        public Criteria andPic3EqualTo(String value) {
            addCriterion("F_PIC3 =", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotEqualTo(String value) {
            addCriterion("F_PIC3 <>", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3GreaterThan(String value) {
            addCriterion("F_PIC3 >", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3GreaterThanOrEqualTo(String value) {
            addCriterion("F_PIC3 >=", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3LessThan(String value) {
            addCriterion("F_PIC3 <", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3LessThanOrEqualTo(String value) {
            addCriterion("F_PIC3 <=", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3Like(String value) {
            addCriterion("F_PIC3 like", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotLike(String value) {
            addCriterion("F_PIC3 not like", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3In(List<String> values) {
            addCriterion("F_PIC3 in", values, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotIn(List<String> values) {
            addCriterion("F_PIC3 not in", values, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3Between(String value1, String value2) {
            addCriterion("F_PIC3 between", value1, value2, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotBetween(String value1, String value2) {
            addCriterion("F_PIC3 not between", value1, value2, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic4IsNull() {
            addCriterion("F_PIC4 is null");
            return (Criteria) this;
        }

        public Criteria andPic4IsNotNull() {
            addCriterion("F_PIC4 is not null");
            return (Criteria) this;
        }

        public Criteria andPic4EqualTo(String value) {
            addCriterion("F_PIC4 =", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotEqualTo(String value) {
            addCriterion("F_PIC4 <>", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4GreaterThan(String value) {
            addCriterion("F_PIC4 >", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4GreaterThanOrEqualTo(String value) {
            addCriterion("F_PIC4 >=", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4LessThan(String value) {
            addCriterion("F_PIC4 <", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4LessThanOrEqualTo(String value) {
            addCriterion("F_PIC4 <=", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4Like(String value) {
            addCriterion("F_PIC4 like", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotLike(String value) {
            addCriterion("F_PIC4 not like", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4In(List<String> values) {
            addCriterion("F_PIC4 in", values, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotIn(List<String> values) {
            addCriterion("F_PIC4 not in", values, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4Between(String value1, String value2) {
            addCriterion("F_PIC4 between", value1, value2, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotBetween(String value1, String value2) {
            addCriterion("F_PIC4 not between", value1, value2, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic5IsNull() {
            addCriterion("F_PIC5 is null");
            return (Criteria) this;
        }

        public Criteria andPic5IsNotNull() {
            addCriterion("F_PIC5 is not null");
            return (Criteria) this;
        }

        public Criteria andPic5EqualTo(String value) {
            addCriterion("F_PIC5 =", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotEqualTo(String value) {
            addCriterion("F_PIC5 <>", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5GreaterThan(String value) {
            addCriterion("F_PIC5 >", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5GreaterThanOrEqualTo(String value) {
            addCriterion("F_PIC5 >=", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5LessThan(String value) {
            addCriterion("F_PIC5 <", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5LessThanOrEqualTo(String value) {
            addCriterion("F_PIC5 <=", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5Like(String value) {
            addCriterion("F_PIC5 like", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotLike(String value) {
            addCriterion("F_PIC5 not like", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5In(List<String> values) {
            addCriterion("F_PIC5 in", values, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotIn(List<String> values) {
            addCriterion("F_PIC5 not in", values, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5Between(String value1, String value2) {
            addCriterion("F_PIC5 between", value1, value2, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotBetween(String value1, String value2) {
            addCriterion("F_PIC5 not between", value1, value2, "pic5");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("F_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("F_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("F_MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("F_MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("F_MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("F_MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("F_MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("F_MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("F_MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("F_MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("F_MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("F_MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("F_MEMO not between", value1, value2, "memo");
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