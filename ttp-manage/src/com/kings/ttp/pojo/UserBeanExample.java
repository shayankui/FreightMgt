package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBeanExample() {
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

        public Criteria andUserTypeIsNull() {
            addCriterion("F_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("F_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("F_USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("F_USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("F_USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("F_USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("F_USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("F_USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("F_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("F_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("F_PASSWD =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("F_PASSWD <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("F_PASSWD >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("F_PASSWD >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("F_PASSWD <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("F_PASSWD <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("F_PASSWD like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("F_PASSWD not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("F_PASSWD in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("F_PASSWD not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("F_PASSWD between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("F_PASSWD not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("F_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("F_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("F_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("F_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("F_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("F_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("F_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("F_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("F_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("F_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("F_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("F_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("F_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("F_CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("F_CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("F_CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("F_CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("F_CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("F_CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("F_CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("F_CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("F_CARD is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("F_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("F_CARD =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("F_CARD <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("F_CARD >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("F_CARD >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("F_CARD <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("F_CARD <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("F_CARD like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("F_CARD not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("F_CARD in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("F_CARD not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("F_CARD between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("F_CARD not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeIsNull() {
            addCriterion("F_DIRVING_LICENSE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeIsNotNull() {
            addCriterion("F_DIRVING_LICENSE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeEqualTo(Integer value) {
            addCriterion("F_DIRVING_LICENSE_TYPE =", value, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeNotEqualTo(Integer value) {
            addCriterion("F_DIRVING_LICENSE_TYPE <>", value, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeGreaterThan(Integer value) {
            addCriterion("F_DIRVING_LICENSE_TYPE >", value, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_DIRVING_LICENSE_TYPE >=", value, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeLessThan(Integer value) {
            addCriterion("F_DIRVING_LICENSE_TYPE <", value, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_DIRVING_LICENSE_TYPE <=", value, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeIn(List<Integer> values) {
            addCriterion("F_DIRVING_LICENSE_TYPE in", values, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeNotIn(List<Integer> values) {
            addCriterion("F_DIRVING_LICENSE_TYPE not in", values, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_DIRVING_LICENSE_TYPE between", value1, value2, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_DIRVING_LICENSE_TYPE not between", value1, value2, "dirvingLicenseType");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseIsNull() {
            addCriterion("F_DIRVING_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseIsNotNull() {
            addCriterion("F_DIRVING_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseEqualTo(String value) {
            addCriterion("F_DIRVING_LICENSE =", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseNotEqualTo(String value) {
            addCriterion("F_DIRVING_LICENSE <>", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseGreaterThan(String value) {
            addCriterion("F_DIRVING_LICENSE >", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("F_DIRVING_LICENSE >=", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseLessThan(String value) {
            addCriterion("F_DIRVING_LICENSE <", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseLessThanOrEqualTo(String value) {
            addCriterion("F_DIRVING_LICENSE <=", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseLike(String value) {
            addCriterion("F_DIRVING_LICENSE like", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseNotLike(String value) {
            addCriterion("F_DIRVING_LICENSE not like", value, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseIn(List<String> values) {
            addCriterion("F_DIRVING_LICENSE in", values, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseNotIn(List<String> values) {
            addCriterion("F_DIRVING_LICENSE not in", values, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseBetween(String value1, String value2) {
            addCriterion("F_DIRVING_LICENSE between", value1, value2, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andDirvingLicenseNotBetween(String value1, String value2) {
            addCriterion("F_DIRVING_LICENSE not between", value1, value2, "dirvingLicense");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("F_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("F_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("F_MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("F_MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("F_MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("F_MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("F_MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("F_MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("F_MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("F_MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("F_MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("F_MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("F_MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("F_MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("F_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("F_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("F_PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("F_PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("F_PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("F_PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("F_PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("F_PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("F_PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("F_PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("F_PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("F_PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("F_PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("F_PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("F_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("F_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("F_COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("F_COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("F_COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("F_COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("F_COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("F_COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("F_COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("F_COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("F_COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("F_COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("F_COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("F_COMPANY not between", value1, value2, "company");
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

        public Criteria andGpsLongitudeEqualTo(Double value) {
            addCriterion("F_GPS_LONGITUDE =", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotEqualTo(Double value) {
            addCriterion("F_GPS_LONGITUDE <>", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeGreaterThan(Double value) {
            addCriterion("F_GPS_LONGITUDE >", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("F_GPS_LONGITUDE >=", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLessThan(Double value) {
            addCriterion("F_GPS_LONGITUDE <", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("F_GPS_LONGITUDE <=", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIn(List<Double> values) {
            addCriterion("F_GPS_LONGITUDE in", values, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotIn(List<Double> values) {
            addCriterion("F_GPS_LONGITUDE not in", values, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeBetween(Double value1, Double value2) {
            addCriterion("F_GPS_LONGITUDE between", value1, value2, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotBetween(Double value1, Double value2) {
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

        public Criteria andGpsLatitudeEqualTo(Double value) {
            addCriterion("F_GPS_LATITUDE =", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotEqualTo(Double value) {
            addCriterion("F_GPS_LATITUDE <>", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeGreaterThan(Double value) {
            addCriterion("F_GPS_LATITUDE >", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("F_GPS_LATITUDE >=", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLessThan(Double value) {
            addCriterion("F_GPS_LATITUDE <", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("F_GPS_LATITUDE <=", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIn(List<Double> values) {
            addCriterion("F_GPS_LATITUDE in", values, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotIn(List<Double> values) {
            addCriterion("F_GPS_LATITUDE not in", values, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeBetween(Double value1, Double value2) {
            addCriterion("F_GPS_LATITUDE between", value1, value2, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("F_GPS_LATITUDE not between", value1, value2, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("F_CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("F_CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("F_CONTACT_ADDRESS =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("F_CONTACT_ADDRESS <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("F_CONTACT_ADDRESS >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_ADDRESS >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("F_CONTACT_ADDRESS <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_ADDRESS <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("F_CONTACT_ADDRESS like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("F_CONTACT_ADDRESS not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("F_CONTACT_ADDRESS in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("F_CONTACT_ADDRESS not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("F_CONTACT_ADDRESS between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("F_CONTACT_ADDRESS not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("F_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("F_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("F_EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("F_EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("F_EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("F_EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("F_EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("F_EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("F_EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("F_EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("F_EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("F_EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("F_EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("F_EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNull() {
            addCriterion("F_TELNUM is null");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNotNull() {
            addCriterion("F_TELNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumEqualTo(String value) {
            addCriterion("F_TELNUM =", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotEqualTo(String value) {
            addCriterion("F_TELNUM <>", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThan(String value) {
            addCriterion("F_TELNUM >", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("F_TELNUM >=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThan(String value) {
            addCriterion("F_TELNUM <", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThanOrEqualTo(String value) {
            addCriterion("F_TELNUM <=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLike(String value) {
            addCriterion("F_TELNUM like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotLike(String value) {
            addCriterion("F_TELNUM not like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumIn(List<String> values) {
            addCriterion("F_TELNUM in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotIn(List<String> values) {
            addCriterion("F_TELNUM not in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumBetween(String value1, String value2) {
            addCriterion("F_TELNUM between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotBetween(String value1, String value2) {
            addCriterion("F_TELNUM not between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andContactUserIsNull() {
            addCriterion("F_CONTACT_USER is null");
            return (Criteria) this;
        }

        public Criteria andContactUserIsNotNull() {
            addCriterion("F_CONTACT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserEqualTo(String value) {
            addCriterion("F_CONTACT_USER =", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserNotEqualTo(String value) {
            addCriterion("F_CONTACT_USER <>", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserGreaterThan(String value) {
            addCriterion("F_CONTACT_USER >", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserGreaterThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_USER >=", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserLessThan(String value) {
            addCriterion("F_CONTACT_USER <", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserLessThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_USER <=", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserLike(String value) {
            addCriterion("F_CONTACT_USER like", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserNotLike(String value) {
            addCriterion("F_CONTACT_USER not like", value, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserIn(List<String> values) {
            addCriterion("F_CONTACT_USER in", values, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserNotIn(List<String> values) {
            addCriterion("F_CONTACT_USER not in", values, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserBetween(String value1, String value2) {
            addCriterion("F_CONTACT_USER between", value1, value2, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactUserNotBetween(String value1, String value2) {
            addCriterion("F_CONTACT_USER not between", value1, value2, "contactUser");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNull() {
            addCriterion("F_CONTACT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNotNull() {
            addCriterion("F_CONTACT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("F_CONTACT_MOBILE =", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("F_CONTACT_MOBILE <>", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("F_CONTACT_MOBILE >", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_MOBILE >=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThan(String value) {
            addCriterion("F_CONTACT_MOBILE <", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_MOBILE <=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLike(String value) {
            addCriterion("F_CONTACT_MOBILE like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotLike(String value) {
            addCriterion("F_CONTACT_MOBILE not like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("F_CONTACT_MOBILE in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("F_CONTACT_MOBILE not in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("F_CONTACT_MOBILE between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("F_CONTACT_MOBILE not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("F_CONTACT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("F_CONTACT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("F_CONTACT_TEL =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("F_CONTACT_TEL <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("F_CONTACT_TEL >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_TEL >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("F_CONTACT_TEL <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("F_CONTACT_TEL <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("F_CONTACT_TEL like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("F_CONTACT_TEL not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("F_CONTACT_TEL in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("F_CONTACT_TEL not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("F_CONTACT_TEL between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("F_CONTACT_TEL not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andAttachFileIsNull() {
            addCriterion("F_ATTACH_FILE is null");
            return (Criteria) this;
        }

        public Criteria andAttachFileIsNotNull() {
            addCriterion("F_ATTACH_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachFileEqualTo(String value) {
            addCriterion("F_ATTACH_FILE =", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotEqualTo(String value) {
            addCriterion("F_ATTACH_FILE <>", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileGreaterThan(String value) {
            addCriterion("F_ATTACH_FILE >", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileGreaterThanOrEqualTo(String value) {
            addCriterion("F_ATTACH_FILE >=", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLessThan(String value) {
            addCriterion("F_ATTACH_FILE <", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLessThanOrEqualTo(String value) {
            addCriterion("F_ATTACH_FILE <=", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLike(String value) {
            addCriterion("F_ATTACH_FILE like", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotLike(String value) {
            addCriterion("F_ATTACH_FILE not like", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileIn(List<String> values) {
            addCriterion("F_ATTACH_FILE in", values, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotIn(List<String> values) {
            addCriterion("F_ATTACH_FILE not in", values, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileBetween(String value1, String value2) {
            addCriterion("F_ATTACH_FILE between", value1, value2, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotBetween(String value1, String value2) {
            addCriterion("F_ATTACH_FILE not between", value1, value2, "attachFile");
            return (Criteria) this;
        }

        public Criteria andMaxWeightIsNull() {
            addCriterion("F_MAX_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMaxWeightIsNotNull() {
            addCriterion("F_MAX_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxWeightEqualTo(Double value) {
            addCriterion("F_MAX_WEIGHT =", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightNotEqualTo(Double value) {
            addCriterion("F_MAX_WEIGHT <>", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightGreaterThan(Double value) {
            addCriterion("F_MAX_WEIGHT >", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("F_MAX_WEIGHT >=", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightLessThan(Double value) {
            addCriterion("F_MAX_WEIGHT <", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightLessThanOrEqualTo(Double value) {
            addCriterion("F_MAX_WEIGHT <=", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightIn(List<Double> values) {
            addCriterion("F_MAX_WEIGHT in", values, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightNotIn(List<Double> values) {
            addCriterion("F_MAX_WEIGHT not in", values, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightBetween(Double value1, Double value2) {
            addCriterion("F_MAX_WEIGHT between", value1, value2, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightNotBetween(Double value1, Double value2) {
            addCriterion("F_MAX_WEIGHT not between", value1, value2, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNull() {
            addCriterion("F_MAX_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNotNull() {
            addCriterion("F_MAX_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeEqualTo(Double value) {
            addCriterion("F_MAX_SIZE =", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotEqualTo(Double value) {
            addCriterion("F_MAX_SIZE <>", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThan(Double value) {
            addCriterion("F_MAX_SIZE >", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("F_MAX_SIZE >=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThan(Double value) {
            addCriterion("F_MAX_SIZE <", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThanOrEqualTo(Double value) {
            addCriterion("F_MAX_SIZE <=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIn(List<Double> values) {
            addCriterion("F_MAX_SIZE in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotIn(List<Double> values) {
            addCriterion("F_MAX_SIZE not in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeBetween(Double value1, Double value2) {
            addCriterion("F_MAX_SIZE between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotBetween(Double value1, Double value2) {
            addCriterion("F_MAX_SIZE not between", value1, value2, "maxSize");
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