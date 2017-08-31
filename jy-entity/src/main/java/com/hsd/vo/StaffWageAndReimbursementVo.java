package com.hsd.vo;

import java.io.Serializable;

/**
 * 员工工资和报销费用vo
 * 
 * @author Administrator
 *
 */
public class StaffWageAndReimbursementVo implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;// 姓名

	String shangBanQingKuan;// 上班情况
	String riGongZi;// 日工资
	String jiagnFa;// 奖罚
	String shiFaGongZi;// 实发工资
	String date;// 日期

	String payTime;// 报销时间
	String amount;// 报销总额
	String use;// 用途

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShangBanQingKuan() {
		return shangBanQingKuan;
	}

	public void setShangBanQingKuan(String shangBanQingKuan) {
		this.shangBanQingKuan = shangBanQingKuan;
	}

	public String getRiGongZi() {
		return riGongZi;
	}

	public void setRiGongZi(String riGongZi) {
		this.riGongZi = riGongZi;
	}

	public String getJiagnFa() {
		return jiagnFa;
	}

	public void setJiagnFa(String jiagnFa) {
		this.jiagnFa = jiagnFa;
	}

	public String getShiFaGongZi() {
		return shiFaGongZi;
	}

	public void setShiFaGongZi(String shiFaGongZi) {
		this.shiFaGongZi = shiFaGongZi;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

}
