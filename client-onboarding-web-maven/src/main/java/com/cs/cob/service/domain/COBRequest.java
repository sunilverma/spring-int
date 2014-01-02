package com.cs.cob.service.domain;

import java.io.Serializable;

public class COBRequest implements Serializable{

	private String appName;

	public COBRequest(){}
	public COBRequest(String appName) {
		this.appName=appName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
}
