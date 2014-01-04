package com.cs.cob.service.domain;

import java.util.List;

public class COBResponse {

	String appName;
	String appType;
	List<String>users;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public COBResponse(String appName, String appType, List<String> users) {
		super();
		this.appName = appName;
		this.appType = appType;
		this.users = users;
	}
	
	
	
}
