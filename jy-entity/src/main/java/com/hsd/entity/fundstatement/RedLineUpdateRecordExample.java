package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedLineUpdateRecordExample  implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedLineUpdateRecordExample() {
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

    protected abstract static class GeneratedCriteria   implements Serializable{
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

        public Criteria andRedlineidIsNull() {
            addCriterion("RedLineId is null");
            return (Criteria) this;
        }

        public Criteria andRedlineidIsNotNull() {
            addCriterion("RedLineId is not null");
            return (Criteria) this;
        }

        public Criteria andRedlineidEqualTo(String value) {
            addCriterion("RedLineId =", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotEqualTo(String value) {
            addCriterion("RedLineId <>", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidGreaterThan(String value) {
            addCriterion("RedLineId >", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidGreaterThanOrEqualTo(String value) {
            addCriterion("RedLineId >=", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidLessThan(String value) {
            addCriterion("RedLineId <", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidLessThanOrEqualTo(String value) {
            addCriterion("RedLineId <=", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidLike(String value) {
            addCriterion("RedLineId like", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotLike(String value) {
            addCriterion("RedLineId not like", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidIn(List<String> values) {
            addCriterion("RedLineId in", values, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotIn(List<String> values) {
            addCriterion("RedLineId not in", values, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidBetween(String value1, String value2) {
            addCriterion("RedLineId between", value1, value2, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotBetween(String value1, String value2) {
            addCriterion("RedLineId not between", value1, value2, "redlineid");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineIsNull() {
            addCriterion("ExpensesReimbursementRedLine is null");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineIsNotNull() {
            addCriterion("ExpensesReimbursementRedLine is not null");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineEqualTo(Long value) {
            addCriterion("ExpensesReimbursementRedLine =", value, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineNotEqualTo(Long value) {
            addCriterion("ExpensesReimbursementRedLine <>", value, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineGreaterThan(Long value) {
            addCriterion("ExpensesReimbursementRedLine >", value, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineGreaterThanOrEqualTo(Long value) {
            addCriterion("ExpensesReimbursementRedLine >=", value, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineLessThan(Long value) {
            addCriterion("ExpensesReimbursementRedLine <", value, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineLessThanOrEqualTo(Long value) {
            addCriterion("ExpensesReimbursementRedLine <=", value, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineIn(List<Long> values) {
            addCriterion("ExpensesReimbursementRedLine in", values, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineNotIn(List<Long> values) {
            addCriterion("ExpensesReimbursementRedLine not in", values, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineBetween(Long value1, Long value2) {
            addCriterion("ExpensesReimbursementRedLine between", value1, value2, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andExpensesreimbursementredlineNotBetween(Long value1, Long value2) {
            addCriterion("ExpensesReimbursementRedLine not between", value1, value2, "expensesreimbursementredline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineIsNull() {
            addCriterion("subscribeRedLine is null");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineIsNotNull() {
            addCriterion("subscribeRedLine is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineEqualTo(Long value) {
            addCriterion("subscribeRedLine =", value, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineNotEqualTo(Long value) {
            addCriterion("subscribeRedLine <>", value, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineGreaterThan(Long value) {
            addCriterion("subscribeRedLine >", value, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineGreaterThanOrEqualTo(Long value) {
            addCriterion("subscribeRedLine >=", value, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineLessThan(Long value) {
            addCriterion("subscribeRedLine <", value, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineLessThanOrEqualTo(Long value) {
            addCriterion("subscribeRedLine <=", value, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineIn(List<Long> values) {
            addCriterion("subscribeRedLine in", values, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineNotIn(List<Long> values) {
            addCriterion("subscribeRedLine not in", values, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineBetween(Long value1, Long value2) {
            addCriterion("subscribeRedLine between", value1, value2, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andSubscriberedlineNotBetween(Long value1, Long value2) {
            addCriterion("subscribeRedLine not between", value1, value2, "subscriberedline");
            return (Criteria) this;
        }

        public Criteria andPredictincomeIsNull() {
            addCriterion("predictIncome is null");
            return (Criteria) this;
        }

        public Criteria andPredictincomeIsNotNull() {
            addCriterion("predictIncome is not null");
            return (Criteria) this;
        }

        public Criteria andPredictincomeEqualTo(Long value) {
            addCriterion("predictIncome =", value, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeNotEqualTo(Long value) {
            addCriterion("predictIncome <>", value, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeGreaterThan(Long value) {
            addCriterion("predictIncome >", value, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeGreaterThanOrEqualTo(Long value) {
            addCriterion("predictIncome >=", value, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeLessThan(Long value) {
            addCriterion("predictIncome <", value, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeLessThanOrEqualTo(Long value) {
            addCriterion("predictIncome <=", value, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeIn(List<Long> values) {
            addCriterion("predictIncome in", values, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeNotIn(List<Long> values) {
            addCriterion("predictIncome not in", values, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeBetween(Long value1, Long value2) {
            addCriterion("predictIncome between", value1, value2, "predictincome");
            return (Criteria) this;
        }

        public Criteria andPredictincomeNotBetween(Long value1, Long value2) {
            addCriterion("predictIncome not between", value1, value2, "predictincome");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

    public static class Criteria extends GeneratedCriteria   implements Serializable{

        protected Criteria() {
            super();
        }
    }

    public static class Criterion   implements Serializable{
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