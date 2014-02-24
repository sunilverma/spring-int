package com.cs.cob.appconfigurer.main;

import com.cs.cob.appconfigurer.AppConfirmation;
import com.cs.cob.appconfigurer.Application;

public class ApplicationSetupHandler {

	
	public AppConfirmation setUpCompleted(Application applicaton)
	{
		System.out.println(">>>>>>*****************>>>>>>>>>>>>>>>>>>>>>>>>>> About to complete ..."+ applicaton.getAppName());
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AppConfirmation(true,applicaton.getAppName());
	}
}
