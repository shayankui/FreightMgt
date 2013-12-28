package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReceivePlaceBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceivePlaceBeanExample() {
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

        public Criteria andPlaceIdIsNull() {
            addCriterion("F_PLACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("F_PLACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(String value) {
            addCriterion("F_PLACE_ID =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(String value) {
            addCriterion("F_PLACE_ID <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(String value) {
            addCriterion("F_PLACE_ID >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_PLACE_ID >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(String value) {
            addCriterion("F_PLACE_ID <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("F_PLACE_ID <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLike(String value) {
            addCriterion("F_PLACE_ID like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotLike(String value) {
            addCriterion("F_PLACE_ID not like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<String> values) {
            addCriterion("F_PLACE_ID in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<String> values) {
            addCriterion("F_PLACE_ID not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(String value1, String value2) {
            addCriterion("F_PLACE_ID between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(String value1, String value2) {
            addCriterion("F_PLACE_ID not between", value1, value2, "placeId");
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

        public Criteria andDetailAddressIsNull() {
            addCriterion("F_DETAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("F_DETAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("F_DETAIL_ADDRESS =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("F_DETAIL_ADDRESS <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("F_DETAIL_ADDRESS >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("F_DETAIL_ADDRESS >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("F_DETAIL_ADDRESS <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("F_DETAIL_ADDRESS <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("F_DETAIL_ADDRESS like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("F_DETAIL_ADDRESS not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("F_DETAIL_ADDRESS in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("F_DETAIL_ADDRESS not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("F_DETAIL_ADDRESS between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("F_DETAIL_ADDRESS not between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("F_IS_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("F_IS_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("F_IS_DEFAULT =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("F_IS_DEFAULT <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("F_IS_DEFAULT >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_IS_DEFAULT >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("F_IS_DEFAULT <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("F_IS_DEFAULT <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("F_IS_DEFAULT in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("F_IS_DEFAULT not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("F_IS_DEFAULT between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("F_IS_DEFAULT not between", value1, value2, "isDefault");
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