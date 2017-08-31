package com.hsd.entity.wagecalculation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WageRulesExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WageRulesExample() {
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

        public Criteria andRulesnameIsNull() {
            addCriterion("rulesName is null");
            return (Criteria) this;
        }

        public Criteria andRulesnameIsNotNull() {
            addCriterion("rulesName is not null");
            return (Criteria) this;
        }

        public Criteria andRulesnameEqualTo(String value) {
            addCriterion("rulesName =", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameNotEqualTo(String value) {
            addCriterion("rulesName <>", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameGreaterThan(String value) {
            addCriterion("rulesName >", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameGreaterThanOrEqualTo(String value) {
            addCriterion("rulesName >=", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameLessThan(String value) {
            addCriterion("rulesName <", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameLessThanOrEqualTo(String value) {
            addCriterion("rulesName <=", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameLike(String value) {
            addCriterion("rulesName like", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameNotLike(String value) {
            addCriterion("rulesName not like", value, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameIn(List<String> values) {
            addCriterion("rulesName in", values, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameNotIn(List<String> values) {
            addCriterion("rulesName not in", values, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameBetween(String value1, String value2) {
            addCriterion("rulesName between", value1, value2, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesnameNotBetween(String value1, String value2) {
            addCriterion("rulesName not between", value1, value2, "rulesname");
            return (Criteria) this;
        }

        public Criteria andRulesgenreIsNull() {
            addCriterion("rulesGenre is null");
            return (Criteria) this;
        }

        public Criteria andRulesgenreIsNotNull() {
            addCriterion("rulesGenre is not null");
            return (Criteria) this;
        }

        public Criteria andRulesgenreEqualTo(Boolean value) {
            addCriterion("rulesGenre =", value, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreNotEqualTo(Boolean value) {
            addCriterion("rulesGenre <>", value, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreGreaterThan(Boolean value) {
            addCriterion("rulesGenre >", value, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rulesGenre >=", value, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreLessThan(Boolean value) {
            addCriterion("rulesGenre <", value, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreLessThanOrEqualTo(Boolean value) {
            addCriterion("rulesGenre <=", value, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreIn(List<Boolean> values) {
            addCriterion("rulesGenre in", values, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreNotIn(List<Boolean> values) {
            addCriterion("rulesGenre not in", values, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreBetween(Boolean value1, Boolean value2) {
            addCriterion("rulesGenre between", value1, value2, "rulesgenre");
            return (Criteria) this;
        }

        public Criteria andRulesgenreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rulesGenre not between", value1, value2, "rulesgenre");
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

        public Criteria andWorkdaysIsNull() {
            addCriterion("workDays is null");
            return (Criteria) this;
        }

        public Criteria andWorkdaysIsNotNull() {
            addCriterion("workDays is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdaysEqualTo(Integer value) {
            addCriterion("workDays =", value, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysNotEqualTo(Integer value) {
            addCriterion("workDays <>", value, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysGreaterThan(Integer value) {
            addCriterion("workDays >", value, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("workDays >=", value, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysLessThan(Integer value) {
            addCriterion("workDays <", value, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysLessThanOrEqualTo(Integer value) {
            addCriterion("workDays <=", value, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysIn(List<Integer> values) {
            addCriterion("workDays in", values, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysNotIn(List<Integer> values) {
            addCriterion("workDays not in", values, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysBetween(Integer value1, Integer value2) {
            addCriterion("workDays between", value1, value2, "workdays");
            return (Criteria) this;
        }

        public Criteria andWorkdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("workDays not between", value1, value2, "workdays");
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

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
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