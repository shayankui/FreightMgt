package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class GpsRecInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GpsRecInfoExample() {
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

        public Criteria andRecIdIsNull() {
            addCriterion("F_REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("F_REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(String value) {
            addCriterion("F_REC_ID =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(String value) {
            addCriterion("F_REC_ID <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(String value) {
            addCriterion("F_REC_ID >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_REC_ID >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(String value) {
            addCriterion("F_REC_ID <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(String value) {
            addCriterion("F_REC_ID <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLike(String value) {
            addCriterion("F_REC_ID like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotLike(String value) {
            addCriterion("F_REC_ID not like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<String> values) {
            addCriterion("F_REC_ID in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<String> values) {
            addCriterion("F_REC_ID not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(String value1, String value2) {
            addCriterion("F_REC_ID between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(String value1, String value2) {
            addCriterion("F_REC_ID not between", value1, value2, "recId");
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

        public Criteria andProvinceNumIsNull() {
            addCriterion("F_PROVINCE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNumIsNotNull() {
            addCriterion("F_PROVINCE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNumEqualTo(String value) {
            addCriterion("F_PROVINCE_NUM =", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumNotEqualTo(String value) {
            addCriterion("F_PROVINCE_NUM <>", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumGreaterThan(String value) {
            addCriterion("F_PROVINCE_NUM >", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_PROVINCE_NUM >=", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumLessThan(String value) {
            addCriterion("F_PROVINCE_NUM <", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumLessThanOrEqualTo(String value) {
            addCriterion("F_PROVINCE_NUM <=", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumLike(String value) {
            addCriterion("F_PROVINCE_NUM like", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumNotLike(String value) {
            addCriterion("F_PROVINCE_NUM not like", value, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumIn(List<String> values) {
            addCriterion("F_PROVINCE_NUM in", values, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumNotIn(List<String> values) {
            addCriterion("F_PROVINCE_NUM not in", values, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumBetween(String value1, String value2) {
            addCriterion("F_PROVINCE_NUM between", value1, value2, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andProvinceNumNotBetween(String value1, String value2) {
            addCriterion("F_PROVINCE_NUM not between", value1, value2, "provinceNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumIsNull() {
            addCriterion("F_REGION_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRegionNumIsNotNull() {
            addCriterion("F_REGION_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNumEqualTo(String value) {
            addCriterion("F_REGION_NUM =", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotEqualTo(String value) {
            addCriterion("F_REGION_NUM <>", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumGreaterThan(String value) {
            addCriterion("F_REGION_NUM >", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_REGION_NUM >=", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumLessThan(String value) {
            addCriterion("F_REGION_NUM <", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumLessThanOrEqualTo(String value) {
            addCriterion("F_REGION_NUM <=", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumLike(String value) {
            addCriterion("F_REGION_NUM like", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotLike(String value) {
            addCriterion("F_REGION_NUM not like", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumIn(List<String> values) {
            addCriterion("F_REGION_NUM in", values, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotIn(List<String> values) {
            addCriterion("F_REGION_NUM not in", values, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumBetween(String value1, String value2) {
            addCriterion("F_REGION_NUM between", value1, value2, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotBetween(String value1, String value2) {
            addCriterion("F_REGION_NUM not between", value1, value2, "regionNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumIsNull() {
            addCriterion("F_COUNTRY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCountryNumIsNotNull() {
            addCriterion("F_COUNTRY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNumEqualTo(String value) {
            addCriterion("F_COUNTRY_NUM =", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumNotEqualTo(String value) {
            addCriterion("F_COUNTRY_NUM <>", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumGreaterThan(String value) {
            addCriterion("F_COUNTRY_NUM >", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_COUNTRY_NUM >=", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumLessThan(String value) {
            addCriterion("F_COUNTRY_NUM <", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumLessThanOrEqualTo(String value) {
            addCriterion("F_COUNTRY_NUM <=", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumLike(String value) {
            addCriterion("F_COUNTRY_NUM like", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumNotLike(String value) {
            addCriterion("F_COUNTRY_NUM not like", value, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumIn(List<String> values) {
            addCriterion("F_COUNTRY_NUM in", values, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumNotIn(List<String> values) {
            addCriterion("F_COUNTRY_NUM not in", values, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumBetween(String value1, String value2) {
            addCriterion("F_COUNTRY_NUM between", value1, value2, "countryNum");
            return (Criteria) this;
        }

        public Criteria andCountryNumNotBetween(String value1, String value2) {
            addCriterion("F_COUNTRY_NUM not between", value1, value2, "countryNum");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIsNull() {
            addCriterion("F_GPS_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIsNotNull() {
            addCriterion("F_GPS_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeEqualTo(String value) {
            addCriterion("F_GPS_LONGITUDE =", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotEqualTo(String value) {
            addCriterion("F_GPS_LONGITUDE <>", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeGreaterThan(String value) {
            addCriterion("F_GPS_LONGITUDE >", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("F_GPS_LONGITUDE >=", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLessThan(String value) {
            addCriterion("F_GPS_LONGITUDE <", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLessThanOrEqualTo(String value) {
            addCriterion("F_GPS_LONGITUDE <=", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLike(String value) {
            addCriterion("F_GPS_LONGITUDE like", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotLike(String value) {
            addCriterion("F_GPS_LONGITUDE not like", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIn(List<String> values) {
            addCriterion("F_GPS_LONGITUDE in", values, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotIn(List<String> values) {
            addCriterion("F_GPS_LONGITUDE not in", values, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeBetween(String value1, String value2) {
            addCriterion("F_GPS_LONGITUDE between", value1, value2, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotBetween(String value1, String value2) {
            addCriterion("F_GPS_LONGITUDE not between", value1, value2, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIsNull() {
            addCriterion("F_GPS_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIsNotNull() {
            addCriterion("F_GPS_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeEqualTo(String value) {
            addCriterion("F_GPS_LATITUDE =", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotEqualTo(String value) {
            addCriterion("F_GPS_LATITUDE <>", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeGreaterThan(String value) {
            addCriterion("F_GPS_LATITUDE >", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("F_GPS_LATITUDE >=", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLessThan(String value) {
            addCriterion("F_GPS_LATITUDE <", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLessThanOrEqualTo(String value) {
            addCriterion("F_GPS_LATITUDE <=", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLike(String value) {
            addCriterion("F_GPS_LATITUDE like", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotLike(String value) {
            addCriterion("F_GPS_LATITUDE not like", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIn(List<String> values) {
            addCriterion("F_GPS_LATITUDE in", values, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotIn(List<String> values) {
            addCriterion("F_GPS_LATITUDE not in", values, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeBetween(String value1, String value2) {
            addCriterion("F_GPS_LATITUDE between", value1, value2, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotBetween(String value1, String value2) {
            addCriterion("F_GPS_LATITUDE not between", value1, value2, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andRecTimeIsNull() {
            addCriterion("F_REC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecTimeIsNotNull() {
            addCriterion("F_REC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecTimeEqualTo(String value) {
            addCriterion("F_REC_TIME =", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotEqualTo(String value) {
            addCriterion("F_REC_TIME <>", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeGreaterThan(String value) {
            addCriterion("F_REC_TIME >", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_REC_TIME >=", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLessThan(String value) {
            addCriterion("F_REC_TIME <", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLessThanOrEqualTo(String value) {
            addCriterion("F_REC_TIME <=", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLike(String value) {
            addCriterion("F_REC_TIME like", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotLike(String value) {
            addCriterion("F_REC_TIME not like", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeIn(List<String> values) {
            addCriterion("F_REC_TIME in", values, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotIn(List<String> values) {
            addCriterion("F_REC_TIME not in", values, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeBetween(String value1, String value2) {
            addCriterion("F_REC_TIME between", value1, value2, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotBetween(String value1, String value2) {
            addCriterion("F_REC_TIME not between", value1, value2, "recTime");
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