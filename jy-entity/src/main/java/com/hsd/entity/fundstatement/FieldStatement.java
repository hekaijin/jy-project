package com.hsd.entity.fundstatement;

import java.io.Serializable;

/**
 * 项目报表
 * 
 * @author Administrator
 *
 */
public class FieldStatement implements Serializable {

	private static final long serialVersionUID = 1L;

	String fieldId;
	String fieldName; // 项目名称
	String profitTotal; // 盈利总计
	String injectMoney; // 投入资金
	String expenditureMoney; // 花费资金
	String remnantMoney; // 剩余资金
	String fixationProperty; // 固定资产
	
	
	
	

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getProfitTotal() {
		return profitTotal;
	}

	public void setProfitTotal(String profitTotal) {
		this.profitTotal = profitTotal;
	}

	public String getInjectMoney() {
		return injectMoney;
	}

	public void setInjectMoney(String injectMoney) {
		this.injectMoney = injectMoney;
	}

	public String getExpenditureMoney() {
		return expenditureMoney;
	}

	public void setExpenditureMoney(String expenditureMoney) {
		this.expenditureMoney = expenditureMoney;
	}

	public String getRemnantMoney() {
		return remnantMoney;
	}

	public void setRemnantMoney(String remnantMoney) {
		this.remnantMoney = remnantMoney;
	}

	public String getFixationProperty() {
		return fixationProperty;
	}

	public void setFixationProperty(String fixationProperty) {
		this.fixationProperty = fixationProperty;
	}

}
