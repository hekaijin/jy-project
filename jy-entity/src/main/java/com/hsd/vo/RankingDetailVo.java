package com.hsd.vo;

import java.io.Serializable;

/**
 * 排行详情
 * @author Administrator
 *
 */
public class RankingDetailVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	String name;
	
	String money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	
	
	
	
}
