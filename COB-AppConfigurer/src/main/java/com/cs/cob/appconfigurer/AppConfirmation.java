package com.cs.cob.appconfigurer;

import java.io.Serializable;

public class AppConfirmation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean completed=false;
	private String appName;
	
	
	public AppConfirmation(boolean completed, String appName) {
		super();
		this.completed = completed;
		this.appName = appName;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
}
