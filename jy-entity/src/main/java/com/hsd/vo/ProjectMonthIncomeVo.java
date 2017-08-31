package com.hsd.vo;

import java.io.Serializable;

/**
 * 项目月份收入、利润、成本情况
 * @author Administrator
 *
 */
public class ProjectMonthIncomeVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//月份
	String month;
	//实收金额
	String realityMoney;
	//应收金额
	String shouldMoney;
	//欠款金额
	String debtMoney;
	
	//年月
	String yearMonth;
	
	
	
	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getRealityMoney() {
		return realityMoney;
	}
	public void setRealityMoney(String realityMoney) {
		this.realityMoney = realityMoney;
	}
	public String getShouldMoney() {
		return shouldMoney;
	}
	public void setShouldMoney(String shouldMoney) {
		this.shouldMoney = shouldMoney;
	}
	public String getDebtMoney() {
		return debtMoney;
	}
	public void setDebtMoney(String debtMoney) {
		this.debtMoney = debtMoney;
	}
	
	
	
}
