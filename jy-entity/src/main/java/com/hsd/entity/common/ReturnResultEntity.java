package com.hsd.entity.common;

import java.io.Serializable;

public class ReturnResultEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1080603538883768413L;

	private String code;
	private String message;
	private Object object;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
