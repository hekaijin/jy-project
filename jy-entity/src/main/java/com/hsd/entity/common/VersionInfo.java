package com.hsd.entity.common;

import java.io.Serializable;

public class VersionInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9188542495001014164L;

	private Integer version; // 版本号
	private String versionName; // 版本名称
	private String url; // apk文件保存路径
	private String description; // 描述
	private Integer isForce;// 是否强制更新

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsForce() {
		return isForce;
	}

	public void setIsForce(Integer isForce) {
		this.isForce = isForce;
	}

}
