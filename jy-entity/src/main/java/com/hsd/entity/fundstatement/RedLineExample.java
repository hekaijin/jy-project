package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedLineExample  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedLineExample() {
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

    protected abstract static class GeneratedCriteria  implements Serializable{
        /**
    	 * 
    	 */
    	private static final long serialVersionUID = 1L;
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

        public Criteria andRedlineidIsNull() {
            addCriterion("RedLineID is null");
            return (Criteria) this;
        }

        public Criteria andRedlineidIsNotNull() {
            addCriterion("RedLineID is not null");
            return (Criteria) this;
        }

        public Criteria andRedlineidEqualTo(Integer value) {
            addCriterion("RedLineID =", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotEqualTo(Integer value) {
            addCriterion("RedLineID <>", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidGreaterThan(Integer value) {
            addCriterion("RedLineID >", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RedLineID >=", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidLessThan(Integer value) {
            addCriterion("RedLineID <", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidLessThanOrEqualTo(Integer value) {
            addCriterion("RedLineID <=", value, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidIn(List<Integer> values) {
            addCriterion("RedLineID in", values, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotIn(List<Integer> values) {
            addCriterion("RedLineID not in", values, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidBetween(Integer value1, Integer value2) {
            addCriterion("RedLineID between", value1, value2, "redlineid");
            return (Criteria) this;
        }

        public Criteria andRedlineidNotBetween(Integer value1, Integer value2) {
            addCriterion("RedLineID not between", value1, value2, "redlineid");
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

        public Criteria andBorrowredlineIsNull() {
            addCriterion("BorrowRedLine is null");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineIsNotNull() {
            addCriterion("BorrowRedLine is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineEqualTo(Long value) {
            addCriterion("BorrowRedLine =", value, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineNotEqualTo(Long value) {
            addCriterion("BorrowRedLine <>", value, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineGreaterThan(Long value) {
            addCriterion("BorrowRedLine >", value, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineGreaterThanOrEqualTo(Long value) {
            addCriterion("BorrowRedLine >=", value, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineLessThan(Long value) {
            addCriterion("BorrowRedLine <", value, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineLessThanOrEqualTo(Long value) {
            addCriterion("BorrowRedLine <=", value, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineIn(List<Long> values) {
            addCriterion("BorrowRedLine in", values, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineNotIn(List<Long> values) {
            addCriterion("BorrowRedLine not in", values, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineBetween(Long value1, Long value2) {
            addCriterion("BorrowRedLine between", value1, value2, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andBorrowredlineNotBetween(Long value1, Long value2) {
            addCriterion("BorrowRedLine not between", value1, value2, "borrowredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineIsNull() {
            addCriterion("ApplyRedLine is null");
            return (Criteria) this;
        }

        public Criteria andApplyredlineIsNotNull() {
            addCriterion("ApplyRedLine is not null");
            return (Criteria) this;
        }

        public Criteria andApplyredlineEqualTo(Long value) {
            addCriterion("ApplyRedLine =", value, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineNotEqualTo(Long value) {
            addCriterion("ApplyRedLine <>", value, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineGreaterThan(Long value) {
            addCriterion("ApplyRedLine >", value, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineGreaterThanOrEqualTo(Long value) {
            addCriterion("ApplyRedLine >=", value, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineLessThan(Long value) {
            addCriterion("ApplyRedLine <", value, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineLessThanOrEqualTo(Long value) {
            addCriterion("ApplyRedLine <=", value, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineIn(List<Long> values) {
            addCriterion("ApplyRedLine in", values, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineNotIn(List<Long> values) {
            addCriterion("ApplyRedLine not in", values, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineBetween(Long value1, Long value2) {
            addCriterion("ApplyRedLine between", value1, value2, "applyredline");
            return (Criteria) this;
        }

        public Criteria andApplyredlineNotBetween(Long value1, Long value2) {
            addCriterion("ApplyRedLine not between", value1, value2, "applyredline");
            return (Criteria) this;
        }

        public Criteria andFoundpersonIsNull() {
            addCriterion("FoundPerson is null");
            return (Criteria) this;
        }

        public Criteria andFoundpersonIsNotNull() {
            addCriterion("FoundPerson is not null");
            return (Criteria) this;
        }

        public Criteria andFoundpersonEqualTo(String value) {
            addCriterion("FoundPerson =", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonNotEqualTo(String value) {
            addCriterion("FoundPerson <>", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonGreaterThan(String value) {
            addCriterion("FoundPerson >", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonGreaterThanOrEqualTo(String value) {
            addCriterion("FoundPerson >=", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonLessThan(String value) {
            addCriterion("FoundPerson <", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonLessThanOrEqualTo(String value) {
            addCriterion("FoundPerson <=", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonLike(String value) {
            addCriterion("FoundPerson like", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonNotLike(String value) {
            addCriterion("FoundPerson not like", value, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonIn(List<String> values) {
            addCriterion("FoundPerson in", values, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonNotIn(List<String> values) {
            addCriterion("FoundPerson not in", values, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonBetween(String value1, String value2) {
            addCriterion("FoundPerson between", value1, value2, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFoundpersonNotBetween(String value1, String value2) {
            addCriterion("FoundPerson not between", value1, value2, "foundperson");
            return (Criteria) this;
        }

        public Criteria andFieldidIsNull() {
            addCriterion("FieldID is null");
            return (Criteria) this;
        }

        public Criteria andFieldidIsNotNull() {
            addCriterion("FieldID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldidEqualTo(Integer value) {
            addCriterion("FieldID =", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotEqualTo(Integer value) {
            addCriterion("FieldID <>", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThan(Integer value) {
            addCriterion("FieldID >", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FieldID >=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThan(Integer value) {
            addCriterion("FieldID <", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThanOrEqualTo(Integer value) {
            addCriterion("FieldID <=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidIn(List<Integer> values) {
            addCriterion("FieldID in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotIn(List<Integer> values) {
            addCriterion("FieldID not in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidBetween(Integer value1, Integer value2) {
            addCriterion("FieldID between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotBetween(Integer value1, Integer value2) {
            addCriterion("FieldID not between", value1, value2, "fieldid");
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

    public static class Criteria extends GeneratedCriteria  implements Serializable{
        /**
    	 * 
    	 */
    	private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion  implements Serializable{
        /**
    	 * 
    	 */
    	private static final long serialVersionUID = 1L;
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