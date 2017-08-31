package com.hsd.vo;

import java.io.Serializable;
import java.util.List;

import com.hsd.entity.fundstatement.FieldStatement;

/**
 * 月度、年度报表
 * 
 * @author Administrator
 *
 */
public class StatementVo implements Serializable {

	private static final long serialVersionUID = 1L;

	String totalProfit; // 总盈利
	String totalInject; // 总投入
	String totalExpenditure; // 总花费
	String totalFixationProperty; // 总固定资产
	String month; // 月份
	String year; // 年份

	List<FieldStatement> fieldStatement;// 项目报表

	public String getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}

	public String getTotalInject() {
		return totalInject;
	}

	public void setTotalInject(String totalInject) {
		this.totalInject = totalInject;
	}

	public String getTotalExpenditure() {
		return totalExpenditure;
	}

	public void setTotalExpenditure(String totalExpenditure) {
		this.totalExpenditure = totalExpenditure;
	}

	public String getTotalFixationProperty() {
		return totalFixationProperty;
	}

	public void setTotalFixationProperty(String totalFixationProperty) {
		this.totalFixationProperty = totalFixationProperty;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<FieldStatement> getFieldStatement() {
		return fieldStatement;
	}

	public void setFieldStatement(List<FieldStatement> fieldStatement) {
		this.fieldStatement = fieldStatement;
	}

}
