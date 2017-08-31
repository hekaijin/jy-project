package com.hsd.vo;

import java.io.Serializable;

/**
 * 统计预计和实际 
 * @author Administrator
 *
 */
public class StatisticsPredictAndReality implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 String  statistic;//"统计"
	  
	
	String predict;//预计
	String reality;//实计
	
	 
	 
	public StatisticsPredictAndReality() {
		super();
	}
	public StatisticsPredictAndReality(String statistic, String predict, String reality) {
		super();
		this.statistic = statistic;
		this.predict = predict;
		this.reality = reality;
	}
	public String getStatistic() {
		return statistic;
	}
	public void setStatistic(String statistic) {
		this.statistic = statistic;
	}
	public String getPredict() {
		return predict;
	}
	public void setPredict(String predict) {
		this.predict = predict;
	}
	public String getReality() {
		return reality;
	}
	public void setReality(String reality) {
		this.reality = reality;
	}
	
	
	
	
	

}
