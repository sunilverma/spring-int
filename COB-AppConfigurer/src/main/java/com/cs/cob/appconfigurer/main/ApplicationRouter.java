package com.cs.cob.appconfigurer.main;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

import com.cs.cob.appconfigurer.Application;

@MessageEndpoint
public class ApplicationRouter {

	@Router(inputChannel="application")
	public String processApplicationSetupRequest(Application application)
	{
		if("PBS".equalsIgnoreCase(application.getAppName()))
		{
			return "PBS";
		}
		if("EPS".equalsIgnoreCase(application.getAppName()))
		{
			return "EPS";
		}
		return null;
	}
}

