package com.hsd.entity.common;

import java.io.Serializable;

/**
 * 管家版登录信息
 * 
 * @author Administrator
 *
 */
public class LoginResultEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6260816971105885933L;

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
