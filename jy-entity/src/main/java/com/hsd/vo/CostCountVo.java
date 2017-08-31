package com.hsd.vo;

import java.io.Serializable;

/**
 * 各项费用统计
 * 
 * @author Administrator
 *
 */
public class CostCountVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cost;// 费用名称
	private String reality;// 实际金额

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getReality() {
		return reality;
	}

	public void setReality(String reality) {
		this.reality = reality;
	}

}
