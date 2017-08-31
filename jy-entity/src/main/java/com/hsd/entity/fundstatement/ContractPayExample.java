package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractPayExample  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractPayExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andContractidIsNull() {
            addCriterion("ContractID is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("ContractID is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(Integer value) {
            addCriterion("ContractID =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(Integer value) {
            addCriterion("ContractID <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(Integer value) {
            addCriterion("ContractID >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ContractID >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(Integer value) {
            addCriterion("ContractID <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(Integer value) {
            addCriterion("ContractID <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<Integer> values) {
            addCriterion("ContractID in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<Integer> values) {
            addCriterion("ContractID not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(Integer value1, Integer value2) {
            addCriterion("ContractID between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(Integer value1, Integer value2) {
            addCriterion("ContractID not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNull() {
            addCriterion("ContractName is null");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNotNull() {
            addCriterion("ContractName is not null");
            return (Criteria) this;
        }

        public Criteria andContractnameEqualTo(String value) {
            addCriterion("ContractName =", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotEqualTo(String value) {
            addCriterion("ContractName <>", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThan(String value) {
            addCriterion("ContractName >", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThanOrEqualTo(String value) {
            addCriterion("ContractName >=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThan(String value) {
            addCriterion("ContractName <", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThanOrEqualTo(String value) {
            addCriterion("ContractName <=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLike(String value) {
            addCriterion("ContractName like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotLike(String value) {
            addCriterion("ContractName not like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameIn(List<String> values) {
            addCriterion("ContractName in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotIn(List<String> values) {
            addCriterion("ContractName not in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameBetween(String value1, String value2) {
            addCriterion("ContractName between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotBetween(String value1, String value2) {
            addCriterion("ContractName not between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractmcdayIsNull() {
            addCriterion("ContractMCDay is null");
            return (Criteria) this;
        }

        public Criteria andContractmcdayIsNotNull() {
            addCriterion("ContractMCDay is not null");
            return (Criteria) this;
        }

        public Criteria andContractmcdayEqualTo(Integer value) {
            addCriterion("ContractMCDay =", value, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayNotEqualTo(Integer value) {
            addCriterion("ContractMCDay <>", value, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayGreaterThan(Integer value) {
            addCriterion("ContractMCDay >", value, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ContractMCDay >=", value, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayLessThan(Integer value) {
            addCriterion("ContractMCDay <", value, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayLessThanOrEqualTo(Integer value) {
            addCriterion("ContractMCDay <=", value, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayIn(List<Integer> values) {
            addCriterion("ContractMCDay in", values, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayNotIn(List<Integer> values) {
            addCriterion("ContractMCDay not in", values, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayBetween(Integer value1, Integer value2) {
            addCriterion("ContractMCDay between", value1, value2, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdayNotBetween(Integer value1, Integer value2) {
            addCriterion("ContractMCDay not between", value1, value2, "contractmcday");
            return (Criteria) this;
        }

        public Criteria andContractmcdateIsNull() {
            addCriterion("ContractMCDate is null");
            return (Criteria) this;
        }

        public Criteria andContractmcdateIsNotNull() {
            addCriterion("ContractMCDate is not null");
            return (Criteria) this;
        }

        public Criteria andContractmcdateEqualTo(Date value) {
            addCriterion("ContractMCDate =", value, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateNotEqualTo(Date value) {
            addCriterion("ContractMCDate <>", value, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateGreaterThan(Date value) {
            addCriterion("ContractMCDate >", value, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ContractMCDate >=", value, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateLessThan(Date value) {
            addCriterion("ContractMCDate <", value, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateLessThanOrEqualTo(Date value) {
            addCriterion("ContractMCDate <=", value, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateIn(List<Date> values) {
            addCriterion("ContractMCDate in", values, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateNotIn(List<Date> values) {
            addCriterion("ContractMCDate not in", values, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateBetween(Date value1, Date value2) {
            addCriterion("ContractMCDate between", value1, value2, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andContractmcdateNotBetween(Date value1, Date value2) {
            addCriterion("ContractMCDate not between", value1, value2, "contractmcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateIsNull() {
            addCriterion("RealityMCDate is null");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateIsNotNull() {
            addCriterion("RealityMCDate is not null");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateEqualTo(Date value) {
            addCriterion("RealityMCDate =", value, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateNotEqualTo(Date value) {
            addCriterion("RealityMCDate <>", value, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateGreaterThan(Date value) {
            addCriterion("RealityMCDate >", value, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RealityMCDate >=", value, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateLessThan(Date value) {
            addCriterion("RealityMCDate <", value, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateLessThanOrEqualTo(Date value) {
            addCriterion("RealityMCDate <=", value, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateIn(List<Date> values) {
            addCriterion("RealityMCDate in", values, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateNotIn(List<Date> values) {
            addCriterion("RealityMCDate not in", values, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateBetween(Date value1, Date value2) {
            addCriterion("RealityMCDate between", value1, value2, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcdateNotBetween(Date value1, Date value2) {
            addCriterion("RealityMCDate not between", value1, value2, "realitymcdate");
            return (Criteria) this;
        }

        public Criteria andRealitymcIsNull() {
            addCriterion("RealityMC is null");
            return (Criteria) this;
        }

        public Criteria andRealitymcIsNotNull() {
            addCriterion("RealityMC is not null");
            return (Criteria) this;
        }

        public Criteria andRealitymcEqualTo(Long value) {
            addCriterion("RealityMC =", value, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcNotEqualTo(Long value) {
            addCriterion("RealityMC <>", value, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcGreaterThan(Long value) {
            addCriterion("RealityMC >", value, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcGreaterThanOrEqualTo(Long value) {
            addCriterion("RealityMC >=", value, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcLessThan(Long value) {
            addCriterion("RealityMC <", value, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcLessThanOrEqualTo(Long value) {
            addCriterion("RealityMC <=", value, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcIn(List<Long> values) {
            addCriterion("RealityMC in", values, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcNotIn(List<Long> values) {
            addCriterion("RealityMC not in", values, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcBetween(Long value1, Long value2) {
            addCriterion("RealityMC between", value1, value2, "realitymc");
            return (Criteria) this;
        }

        public Criteria andRealitymcNotBetween(Long value1, Long value2) {
            addCriterion("RealityMC not between", value1, value2, "realitymc");
            return (Criteria) this;
        }

        public Criteria andSubtractIsNull() {
            addCriterion("Subtract is null");
            return (Criteria) this;
        }

        public Criteria andSubtractIsNotNull() {
            addCriterion("Subtract is not null");
            return (Criteria) this;
        }

        public Criteria andSubtractEqualTo(Long value) {
            addCriterion("Subtract =", value, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractNotEqualTo(Long value) {
            addCriterion("Subtract <>", value, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractGreaterThan(Long value) {
            addCriterion("Subtract >", value, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractGreaterThanOrEqualTo(Long value) {
            addCriterion("Subtract >=", value, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractLessThan(Long value) {
            addCriterion("Subtract <", value, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractLessThanOrEqualTo(Long value) {
            addCriterion("Subtract <=", value, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractIn(List<Long> values) {
            addCriterion("Subtract in", values, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractNotIn(List<Long> values) {
            addCriterion("Subtract not in", values, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractBetween(Long value1, Long value2) {
            addCriterion("Subtract between", value1, value2, "subtract");
            return (Criteria) this;
        }

        public Criteria andSubtractNotBetween(Long value1, Long value2) {
            addCriterion("Subtract not between", value1, value2, "subtract");
            return (Criteria) this;
        }

        public Criteria andAgencyfundIsNull() {
            addCriterion("AgencyFund is null");
            return (Criteria) this;
        }

        public Criteria andAgencyfundIsNotNull() {
            addCriterion("AgencyFund is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyfundEqualTo(Long value) {
            addCriterion("AgencyFund =", value, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundNotEqualTo(Long value) {
            addCriterion("AgencyFund <>", value, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundGreaterThan(Long value) {
            addCriterion("AgencyFund >", value, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundGreaterThanOrEqualTo(Long value) {
            addCriterion("AgencyFund >=", value, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundLessThan(Long value) {
            addCriterion("AgencyFund <", value, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundLessThanOrEqualTo(Long value) {
            addCriterion("AgencyFund <=", value, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundIn(List<Long> values) {
            addCriterion("AgencyFund in", values, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundNotIn(List<Long> values) {
            addCriterion("AgencyFund not in", values, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundBetween(Long value1, Long value2) {
            addCriterion("AgencyFund between", value1, value2, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andAgencyfundNotBetween(Long value1, Long value2) {
            addCriterion("AgencyFund not between", value1, value2, "agencyfund");
            return (Criteria) this;
        }

        public Criteria andSubtractcountIsNull() {
            addCriterion("SubtractCount is null");
            return (Criteria) this;
        }

        public Criteria andSubtractcountIsNotNull() {
            addCriterion("SubtractCount is not null");
            return (Criteria) this;
        }

        public Criteria andSubtractcountEqualTo(Integer value) {
            addCriterion("SubtractCount =", value, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountNotEqualTo(Integer value) {
            addCriterion("SubtractCount <>", value, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountGreaterThan(Integer value) {
            addCriterion("SubtractCount >", value, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubtractCount >=", value, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountLessThan(Integer value) {
            addCriterion("SubtractCount <", value, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountLessThanOrEqualTo(Integer value) {
            addCriterion("SubtractCount <=", value, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountIn(List<Integer> values) {
            addCriterion("SubtractCount in", values, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountNotIn(List<Integer> values) {
            addCriterion("SubtractCount not in", values, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountBetween(Integer value1, Integer value2) {
            addCriterion("SubtractCount between", value1, value2, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andSubtractcountNotBetween(Integer value1, Integer value2) {
            addCriterion("SubtractCount not between", value1, value2, "subtractcount");
            return (Criteria) this;
        }

        public Criteria andOverduecountIsNull() {
            addCriterion("OverdueCount is null");
            return (Criteria) this;
        }

        public Criteria andOverduecountIsNotNull() {
            addCriterion("OverdueCount is not null");
            return (Criteria) this;
        }

        public Criteria andOverduecountEqualTo(Integer value) {
            addCriterion("OverdueCount =", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotEqualTo(Integer value) {
            addCriterion("OverdueCount <>", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountGreaterThan(Integer value) {
            addCriterion("OverdueCount >", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OverdueCount >=", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountLessThan(Integer value) {
            addCriterion("OverdueCount <", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountLessThanOrEqualTo(Integer value) {
            addCriterion("OverdueCount <=", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountIn(List<Integer> values) {
            addCriterion("OverdueCount in", values, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotIn(List<Integer> values) {
            addCriterion("OverdueCount not in", values, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountBetween(Integer value1, Integer value2) {
            addCriterion("OverdueCount between", value1, value2, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotBetween(Integer value1, Integer value2) {
            addCriterion("OverdueCount not between", value1, value2, "overduecount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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