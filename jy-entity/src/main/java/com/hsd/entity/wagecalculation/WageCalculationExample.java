package com.hsd.entity.wagecalculation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WageCalculationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WageCalculationExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable{
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFieldidIsNull() {
            addCriterion("fieldId is null");
            return (Criteria) this;
        }

        public Criteria andFieldidIsNotNull() {
            addCriterion("fieldId is not null");
            return (Criteria) this;
        }

        public Criteria andFieldidEqualTo(Integer value) {
            addCriterion("fieldId =", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotEqualTo(Integer value) {
            addCriterion("fieldId <>", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThan(Integer value) {
            addCriterion("fieldId >", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fieldId >=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThan(Integer value) {
            addCriterion("fieldId <", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThanOrEqualTo(Integer value) {
            addCriterion("fieldId <=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidIn(List<Integer> values) {
            addCriterion("fieldId in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotIn(List<Integer> values) {
            addCriterion("fieldId not in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidBetween(Integer value1, Integer value2) {
            addCriterion("fieldId between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotBetween(Integer value1, Integer value2) {
            addCriterion("fieldId not between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidIsNull() {
            addCriterion("wageRulesId is null");
            return (Criteria) this;
        }

        public Criteria andWagerulesidIsNotNull() {
            addCriterion("wageRulesId is not null");
            return (Criteria) this;
        }

        public Criteria andWagerulesidEqualTo(String value) {
            addCriterion("wageRulesId =", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidNotEqualTo(String value) {
            addCriterion("wageRulesId <>", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidGreaterThan(String value) {
            addCriterion("wageRulesId >", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidGreaterThanOrEqualTo(String value) {
            addCriterion("wageRulesId >=", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidLessThan(String value) {
            addCriterion("wageRulesId <", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidLessThanOrEqualTo(String value) {
            addCriterion("wageRulesId <=", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidLike(String value) {
            addCriterion("wageRulesId like", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidNotLike(String value) {
            addCriterion("wageRulesId not like", value, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidIn(List<String> values) {
            addCriterion("wageRulesId in", values, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidNotIn(List<String> values) {
            addCriterion("wageRulesId not in", values, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidBetween(String value1, String value2) {
            addCriterion("wageRulesId between", value1, value2, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andWagerulesidNotBetween(String value1, String value2) {
            addCriterion("wageRulesId not between", value1, value2, "wagerulesid");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysIsNull() {
            addCriterion("shouldWorkDays is null");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysIsNotNull() {
            addCriterion("shouldWorkDays is not null");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysEqualTo(Integer value) {
            addCriterion("shouldWorkDays =", value, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysNotEqualTo(Integer value) {
            addCriterion("shouldWorkDays <>", value, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysGreaterThan(Integer value) {
            addCriterion("shouldWorkDays >", value, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("shouldWorkDays >=", value, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysLessThan(Integer value) {
            addCriterion("shouldWorkDays <", value, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysLessThanOrEqualTo(Integer value) {
            addCriterion("shouldWorkDays <=", value, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysIn(List<Integer> values) {
            addCriterion("shouldWorkDays in", values, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysNotIn(List<Integer> values) {
            addCriterion("shouldWorkDays not in", values, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysBetween(Integer value1, Integer value2) {
            addCriterion("shouldWorkDays between", value1, value2, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andShouldworkdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("shouldWorkDays not between", value1, value2, "shouldworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysIsNull() {
            addCriterion("realityWorkDays is null");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysIsNotNull() {
            addCriterion("realityWorkDays is not null");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysEqualTo(Integer value) {
            addCriterion("realityWorkDays =", value, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysNotEqualTo(Integer value) {
            addCriterion("realityWorkDays <>", value, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysGreaterThan(Integer value) {
            addCriterion("realityWorkDays >", value, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("realityWorkDays >=", value, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysLessThan(Integer value) {
            addCriterion("realityWorkDays <", value, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysLessThanOrEqualTo(Integer value) {
            addCriterion("realityWorkDays <=", value, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysIn(List<Integer> values) {
            addCriterion("realityWorkDays in", values, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysNotIn(List<Integer> values) {
            addCriterion("realityWorkDays not in", values, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysBetween(Integer value1, Integer value2) {
            addCriterion("realityWorkDays between", value1, value2, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andRealityworkdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("realityWorkDays not between", value1, value2, "realityworkdays");
            return (Criteria) this;
        }

        public Criteria andBasepayIsNull() {
            addCriterion("basePay is null");
            return (Criteria) this;
        }

        public Criteria andBasepayIsNotNull() {
            addCriterion("basePay is not null");
            return (Criteria) this;
        }

        public Criteria andBasepayEqualTo(Long value) {
            addCriterion("basePay =", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotEqualTo(Long value) {
            addCriterion("basePay <>", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayGreaterThan(Long value) {
            addCriterion("basePay >", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayGreaterThanOrEqualTo(Long value) {
            addCriterion("basePay >=", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayLessThan(Long value) {
            addCriterion("basePay <", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayLessThanOrEqualTo(Long value) {
            addCriterion("basePay <=", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayIn(List<Long> values) {
            addCriterion("basePay in", values, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotIn(List<Long> values) {
            addCriterion("basePay not in", values, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayBetween(Long value1, Long value2) {
            addCriterion("basePay between", value1, value2, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotBetween(Long value1, Long value2) {
            addCriterion("basePay not between", value1, value2, "basepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayIsNull() {
            addCriterion("performancePay is null");
            return (Criteria) this;
        }

        public Criteria andPerformancepayIsNotNull() {
            addCriterion("performancePay is not null");
            return (Criteria) this;
        }

        public Criteria andPerformancepayEqualTo(Long value) {
            addCriterion("performancePay =", value, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayNotEqualTo(Long value) {
            addCriterion("performancePay <>", value, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayGreaterThan(Long value) {
            addCriterion("performancePay >", value, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayGreaterThanOrEqualTo(Long value) {
            addCriterion("performancePay >=", value, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayLessThan(Long value) {
            addCriterion("performancePay <", value, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayLessThanOrEqualTo(Long value) {
            addCriterion("performancePay <=", value, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayIn(List<Long> values) {
            addCriterion("performancePay in", values, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayNotIn(List<Long> values) {
            addCriterion("performancePay not in", values, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayBetween(Long value1, Long value2) {
            addCriterion("performancePay between", value1, value2, "performancepay");
            return (Criteria) this;
        }

        public Criteria andPerformancepayNotBetween(Long value1, Long value2) {
            addCriterion("performancePay not between", value1, value2, "performancepay");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareIsNull() {
            addCriterion("otherWelfare is null");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareIsNotNull() {
            addCriterion("otherWelfare is not null");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareEqualTo(Long value) {
            addCriterion("otherWelfare =", value, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareNotEqualTo(Long value) {
            addCriterion("otherWelfare <>", value, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareGreaterThan(Long value) {
            addCriterion("otherWelfare >", value, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareGreaterThanOrEqualTo(Long value) {
            addCriterion("otherWelfare >=", value, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareLessThan(Long value) {
            addCriterion("otherWelfare <", value, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareLessThanOrEqualTo(Long value) {
            addCriterion("otherWelfare <=", value, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareIn(List<Long> values) {
            addCriterion("otherWelfare in", values, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareNotIn(List<Long> values) {
            addCriterion("otherWelfare not in", values, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareBetween(Long value1, Long value2) {
            addCriterion("otherWelfare between", value1, value2, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andOtherwelfareNotBetween(Long value1, Long value2) {
            addCriterion("otherWelfare not between", value1, value2, "otherwelfare");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(String value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(String value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(String value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(String value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(String value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLike(String value) {
            addCriterion("integral like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotLike(String value) {
            addCriterion("integral not like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<String> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<String> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(String value1, String value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(String value1, String value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable{

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
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