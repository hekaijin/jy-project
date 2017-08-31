package com.hsd.vo;

import java.io.Serializable;

/**
 * 收入费用vo
 * @author Administrator
 *
 */
public class IncomeFeeVo implements Serializable {
 
	private static final long serialVersionUID = 1L;

	String dates;//日期
	String userPaymentTotal;//缴费总户数
	String paymentTotal;//缴费总计
	
	 
 
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getUserPaymentTotal() {
		return userPaymentTotal;
	}
	public void setUserPaymentTotal(String userPaymentTotal) {
		this.userPaymentTotal = userPaymentTotal;
	}
	public String getPaymentTotal() {
		return paymentTotal;
	}
	public void setPaymentTotal(String paymentTotal) {
		this.paymentTotal = paymentTotal;
	}
	
	
}
