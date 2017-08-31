package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowExample  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andBorrowidIsNull() {
            addCriterion("BorrowID is null");
            return (Criteria) this;
        }

        public Criteria andBorrowidIsNotNull() {
            addCriterion("BorrowID is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowidEqualTo(Integer value) {
            addCriterion("BorrowID =", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotEqualTo(Integer value) {
            addCriterion("BorrowID <>", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThan(Integer value) {
            addCriterion("BorrowID >", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BorrowID >=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThan(Integer value) {
            addCriterion("BorrowID <", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThanOrEqualTo(Integer value) {
            addCriterion("BorrowID <=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidIn(List<Integer> values) {
            addCriterion("BorrowID in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotIn(List<Integer> values) {
            addCriterion("BorrowID not in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidBetween(Integer value1, Integer value2) {
            addCriterion("BorrowID between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotBetween(Integer value1, Integer value2) {
            addCriterion("BorrowID not between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPhotopathIsNull() {
            addCriterion("PhotoPath is null");
            return (Criteria) this;
        }

        public Criteria andPhotopathIsNotNull() {
            addCriterion("PhotoPath is not null");
            return (Criteria) this;
        }

        public Criteria andPhotopathEqualTo(String value) {
            addCriterion("PhotoPath =", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotEqualTo(String value) {
            addCriterion("PhotoPath <>", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathGreaterThan(String value) {
            addCriterion("PhotoPath >", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoPath >=", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLessThan(String value) {
            addCriterion("PhotoPath <", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLessThanOrEqualTo(String value) {
            addCriterion("PhotoPath <=", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLike(String value) {
            addCriterion("PhotoPath like", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotLike(String value) {
            addCriterion("PhotoPath not like", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathIn(List<String> values) {
            addCriterion("PhotoPath in", values, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotIn(List<String> values) {
            addCriterion("PhotoPath not in", values, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathBetween(String value1, String value2) {
            addCriterion("PhotoPath between", value1, value2, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotBetween(String value1, String value2) {
            addCriterion("PhotoPath not between", value1, value2, "photopath");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("CheckStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CheckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(Integer value) {
            addCriterion("CheckStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(Integer value) {
            addCriterion("CheckStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(Integer value) {
            addCriterion("CheckStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(Integer value) {
            addCriterion("CheckStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("CheckStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<Integer> values) {
            addCriterion("CheckStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<Integer> values) {
            addCriterion("CheckStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("CheckStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckStatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("PayStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("PayStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Integer value) {
            addCriterion("PayStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Integer value) {
            addCriterion("PayStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Integer value) {
            addCriterion("PayStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Integer value) {
            addCriterion("PayStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Integer value) {
            addCriterion("PayStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Integer> values) {
            addCriterion("PayStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Integer> values) {
            addCriterion("PayStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Integer value1, Integer value2) {
            addCriterion("PayStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PayStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andTakeusernameIsNull() {
            addCriterion("TakeUserName is null");
            return (Criteria) this;
        }

        public Criteria andTakeusernameIsNotNull() {
            addCriterion("TakeUserName is not null");
            return (Criteria) this;
        }

        public Criteria andTakeusernameEqualTo(String value) {
            addCriterion("TakeUserName =", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameNotEqualTo(String value) {
            addCriterion("TakeUserName <>", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameGreaterThan(String value) {
            addCriterion("TakeUserName >", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameGreaterThanOrEqualTo(String value) {
            addCriterion("TakeUserName >=", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameLessThan(String value) {
            addCriterion("TakeUserName <", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameLessThanOrEqualTo(String value) {
            addCriterion("TakeUserName <=", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameLike(String value) {
            addCriterion("TakeUserName like", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameNotLike(String value) {
            addCriterion("TakeUserName not like", value, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameIn(List<String> values) {
            addCriterion("TakeUserName in", values, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameNotIn(List<String> values) {
            addCriterion("TakeUserName not in", values, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameBetween(String value1, String value2) {
            addCriterion("TakeUserName between", value1, value2, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeusernameNotBetween(String value1, String value2) {
            addCriterion("TakeUserName not between", value1, value2, "takeusername");
            return (Criteria) this;
        }

        public Criteria andTakeuserIsNull() {
            addCriterion("TakeUser is null");
            return (Criteria) this;
        }

        public Criteria andTakeuserIsNotNull() {
            addCriterion("TakeUser is not null");
            return (Criteria) this;
        }

        public Criteria andTakeuserEqualTo(Integer value) {
            addCriterion("TakeUser =", value, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserNotEqualTo(Integer value) {
            addCriterion("TakeUser <>", value, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserGreaterThan(Integer value) {
            addCriterion("TakeUser >", value, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("TakeUser >=", value, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserLessThan(Integer value) {
            addCriterion("TakeUser <", value, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserLessThanOrEqualTo(Integer value) {
            addCriterion("TakeUser <=", value, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserIn(List<Integer> values) {
            addCriterion("TakeUser in", values, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserNotIn(List<Integer> values) {
            addCriterion("TakeUser not in", values, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserBetween(Integer value1, Integer value2) {
            addCriterion("TakeUser between", value1, value2, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakeuserNotBetween(Integer value1, Integer value2) {
            addCriterion("TakeUser not between", value1, value2, "takeuser");
            return (Criteria) this;
        }

        public Criteria andTakefieldIsNull() {
            addCriterion("TakeField is null");
            return (Criteria) this;
        }

        public Criteria andTakefieldIsNotNull() {
            addCriterion("TakeField is not null");
            return (Criteria) this;
        }

        public Criteria andTakefieldEqualTo(Integer value) {
            addCriterion("TakeField =", value, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldNotEqualTo(Integer value) {
            addCriterion("TakeField <>", value, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldGreaterThan(Integer value) {
            addCriterion("TakeField >", value, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("TakeField >=", value, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldLessThan(Integer value) {
            addCriterion("TakeField <", value, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldLessThanOrEqualTo(Integer value) {
            addCriterion("TakeField <=", value, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldIn(List<Integer> values) {
            addCriterion("TakeField in", values, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldNotIn(List<Integer> values) {
            addCriterion("TakeField not in", values, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldBetween(Integer value1, Integer value2) {
            addCriterion("TakeField between", value1, value2, "takefield");
            return (Criteria) this;
        }

        public Criteria andTakefieldNotBetween(Integer value1, Integer value2) {
            addCriterion("TakeField not between", value1, value2, "takefield");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CreateTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CreateTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("Deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("Deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("Deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("Deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("Deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("Deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("Deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("Deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNull() {
            addCriterion("ProcessID is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("ProcessID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(Integer value) {
            addCriterion("ProcessID =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(Integer value) {
            addCriterion("ProcessID <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(Integer value) {
            addCriterion("ProcessID >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProcessID >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(Integer value) {
            addCriterion("ProcessID <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(Integer value) {
            addCriterion("ProcessID <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<Integer> values) {
            addCriterion("ProcessID in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<Integer> values) {
            addCriterion("ProcessID not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(Integer value1, Integer value2) {
            addCriterion("ProcessID between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProcessID not between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNull() {
            addCriterion("SeqNo is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("SeqNo is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(String value) {
            addCriterion("SeqNo =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(String value) {
            addCriterion("SeqNo <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(String value) {
            addCriterion("SeqNo >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("SeqNo >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(String value) {
            addCriterion("SeqNo <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(String value) {
            addCriterion("SeqNo <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLike(String value) {
            addCriterion("SeqNo like", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotLike(String value) {
            addCriterion("SeqNo not like", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<String> values) {
            addCriterion("SeqNo in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<String> values) {
            addCriterion("SeqNo not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(String value1, String value2) {
            addCriterion("SeqNo between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(String value1, String value2) {
            addCriterion("SeqNo not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("PayTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("PayTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("PayTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("PayTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("PayTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PayTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("PayTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("PayTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("PayTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("PayTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("PayTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("PayTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPayuserIsNull() {
            addCriterion("PayUser is null");
            return (Criteria) this;
        }

        public Criteria andPayuserIsNotNull() {
            addCriterion("PayUser is not null");
            return (Criteria) this;
        }

        public Criteria andPayuserEqualTo(String value) {
            addCriterion("PayUser =", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserNotEqualTo(String value) {
            addCriterion("PayUser <>", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserGreaterThan(String value) {
            addCriterion("PayUser >", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserGreaterThanOrEqualTo(String value) {
            addCriterion("PayUser >=", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserLessThan(String value) {
            addCriterion("PayUser <", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserLessThanOrEqualTo(String value) {
            addCriterion("PayUser <=", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserLike(String value) {
            addCriterion("PayUser like", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserNotLike(String value) {
            addCriterion("PayUser not like", value, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserIn(List<String> values) {
            addCriterion("PayUser in", values, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserNotIn(List<String> values) {
            addCriterion("PayUser not in", values, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserBetween(String value1, String value2) {
            addCriterion("PayUser between", value1, value2, "payuser");
            return (Criteria) this;
        }

        public Criteria andPayuserNotBetween(String value1, String value2) {
            addCriterion("PayUser not between", value1, value2, "payuser");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNull() {
            addCriterion("PrintCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNotNull() {
            addCriterion("PrintCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcountEqualTo(Integer value) {
            addCriterion("PrintCount =", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotEqualTo(Integer value) {
            addCriterion("PrintCount <>", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThan(Integer value) {
            addCriterion("PrintCount >", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintCount >=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThan(Integer value) {
            addCriterion("PrintCount <", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThanOrEqualTo(Integer value) {
            addCriterion("PrintCount <=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountIn(List<Integer> values) {
            addCriterion("PrintCount in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotIn(List<Integer> values) {
            addCriterion("PrintCount not in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount not between", value1, value2, "printcount");
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