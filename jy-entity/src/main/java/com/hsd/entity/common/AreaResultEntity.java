package com.hsd.entity.common;

import java.io.Serializable;

public class AreaResultEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 835408505791110232L;

	private String id;

	private String areaName;

	private String areaCode;

	private String cityCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

}
