package com.hsd.vo;

import java.io.Serializable;

/**
 * 收益情况
 * @author Administrator
 *
 */
public class IncomeSituationVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//总收入
	String totalincome;
	//总利润
	String totalprofit;
	//总成本
	String totalcosting;
	
	
	
	public String getTotalincome() {
		return totalincome;
	}
	public void setTotalincome(String totalincome) {
		this.totalincome = totalincome;
	}
	public String getTotalprofit() {
		return totalprofit;
	}
	public void setTotalprofit(String totalprofit) {
		this.totalprofit = totalprofit;
	}
	public String getTotalcosting() {
		return totalcosting;
	}
	public void setTotalcosting(String totalcosting) {
		this.totalcosting = totalcosting;
	}
	
}
