package com.cs.cob.service.domain;

import java.io.Serializable;

public class COBRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	private String appName;

	public COBRequest(){}
	public COBRequest(String appName) {
		this.appName=appName;
	}

	@Override
	public String toString() {
		return ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> COBRequest [appName=" + appName + "] >>>>>>>>>>>>>";
	}
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
}
