package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FieldExample  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("Order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("Order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("Order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("Order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("Order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("Order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("Order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("Order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("Order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Order not between", value1, value2, "order");
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

        public Criteria andMangeridIsNull() {
            addCriterion("MangerId is null");
            return (Criteria) this;
        }

        public Criteria andMangeridIsNotNull() {
            addCriterion("MangerId is not null");
            return (Criteria) this;
        }

        public Criteria andMangeridEqualTo(Integer value) {
            addCriterion("MangerId =", value, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridNotEqualTo(Integer value) {
            addCriterion("MangerId <>", value, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridGreaterThan(Integer value) {
            addCriterion("MangerId >", value, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MangerId >=", value, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridLessThan(Integer value) {
            addCriterion("MangerId <", value, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridLessThanOrEqualTo(Integer value) {
            addCriterion("MangerId <=", value, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridIn(List<Integer> values) {
            addCriterion("MangerId in", values, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridNotIn(List<Integer> values) {
            addCriterion("MangerId not in", values, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridBetween(Integer value1, Integer value2) {
            addCriterion("MangerId between", value1, value2, "mangerid");
            return (Criteria) this;
        }

        public Criteria andMangeridNotBetween(Integer value1, Integer value2) {
            addCriterion("MangerId not between", value1, value2, "mangerid");
            return (Criteria) this;
        }

        public Criteria andDirectoridIsNull() {
            addCriterion("DirectorID is null");
            return (Criteria) this;
        }

        public Criteria andDirectoridIsNotNull() {
            addCriterion("DirectorID is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoridEqualTo(Integer value) {
            addCriterion("DirectorID =", value, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridNotEqualTo(Integer value) {
            addCriterion("DirectorID <>", value, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridGreaterThan(Integer value) {
            addCriterion("DirectorID >", value, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DirectorID >=", value, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridLessThan(Integer value) {
            addCriterion("DirectorID <", value, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridLessThanOrEqualTo(Integer value) {
            addCriterion("DirectorID <=", value, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridIn(List<Integer> values) {
            addCriterion("DirectorID in", values, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridNotIn(List<Integer> values) {
            addCriterion("DirectorID not in", values, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridBetween(Integer value1, Integer value2) {
            addCriterion("DirectorID between", value1, value2, "directorid");
            return (Criteria) this;
        }

        public Criteria andDirectoridNotBetween(Integer value1, Integer value2) {
            addCriterion("DirectorID not between", value1, value2, "directorid");
            return (Criteria) this;
        }

        public Criteria andId2IsNull() {
            addCriterion("ID2 is null");
            return (Criteria) this;
        }

        public Criteria andId2IsNotNull() {
            addCriterion("ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andId2EqualTo(Integer value) {
            addCriterion("ID2 =", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotEqualTo(Integer value) {
            addCriterion("ID2 <>", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2GreaterThan(Integer value) {
            addCriterion("ID2 >", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ID2 >=", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2LessThan(Integer value) {
            addCriterion("ID2 <", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2LessThanOrEqualTo(Integer value) {
            addCriterion("ID2 <=", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2In(List<Integer> values) {
            addCriterion("ID2 in", values, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotIn(List<Integer> values) {
            addCriterion("ID2 not in", values, "id2");
            return (Criteria) this;
        }

        public Criteria andId2Between(Integer value1, Integer value2) {
            addCriterion("ID2 between", value1, value2, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotBetween(Integer value1, Integer value2) {
            addCriterion("ID2 not between", value1, value2, "id2");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetIsNull() {
            addCriterion("PurchaseBudget is null");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetIsNotNull() {
            addCriterion("PurchaseBudget is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetEqualTo(Double value) {
            addCriterion("PurchaseBudget =", value, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetNotEqualTo(Double value) {
            addCriterion("PurchaseBudget <>", value, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetGreaterThan(Double value) {
            addCriterion("PurchaseBudget >", value, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetGreaterThanOrEqualTo(Double value) {
            addCriterion("PurchaseBudget >=", value, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetLessThan(Double value) {
            addCriterion("PurchaseBudget <", value, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetLessThanOrEqualTo(Double value) {
            addCriterion("PurchaseBudget <=", value, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetIn(List<Double> values) {
            addCriterion("PurchaseBudget in", values, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetNotIn(List<Double> values) {
            addCriterion("PurchaseBudget not in", values, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetBetween(Double value1, Double value2) {
            addCriterion("PurchaseBudget between", value1, value2, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andPurchasebudgetNotBetween(Double value1, Double value2) {
            addCriterion("PurchaseBudget not between", value1, value2, "purchasebudget");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidIsNull() {
            addCriterion("FieldTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidIsNotNull() {
            addCriterion("FieldTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidEqualTo(Integer value) {
            addCriterion("FieldTypeID =", value, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidNotEqualTo(Integer value) {
            addCriterion("FieldTypeID <>", value, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidGreaterThan(Integer value) {
            addCriterion("FieldTypeID >", value, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FieldTypeID >=", value, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidLessThan(Integer value) {
            addCriterion("FieldTypeID <", value, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FieldTypeID <=", value, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidIn(List<Integer> values) {
            addCriterion("FieldTypeID in", values, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidNotIn(List<Integer> values) {
            addCriterion("FieldTypeID not in", values, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidBetween(Integer value1, Integer value2) {
            addCriterion("FieldTypeID between", value1, value2, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andFieldtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FieldTypeID not between", value1, value2, "fieldtypeid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalIsNull() {
            addCriterion("PatrolInterval is null");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalIsNotNull() {
            addCriterion("PatrolInterval is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalEqualTo(Integer value) {
            addCriterion("PatrolInterval =", value, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalNotEqualTo(Integer value) {
            addCriterion("PatrolInterval <>", value, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalGreaterThan(Integer value) {
            addCriterion("PatrolInterval >", value, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("PatrolInterval >=", value, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalLessThan(Integer value) {
            addCriterion("PatrolInterval <", value, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalLessThanOrEqualTo(Integer value) {
            addCriterion("PatrolInterval <=", value, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalIn(List<Integer> values) {
            addCriterion("PatrolInterval in", values, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalNotIn(List<Integer> values) {
            addCriterion("PatrolInterval not in", values, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalBetween(Integer value1, Integer value2) {
            addCriterion("PatrolInterval between", value1, value2, "patrolinterval");
            return (Criteria) this;
        }

        public Criteria andPatrolintervalNotBetween(Integer value1, Integer value2) {
            addCriterion("PatrolInterval not between", value1, value2, "patrolinterval");
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