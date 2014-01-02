package com.cs.cob.service.rest;

import org.springframework.stereotype.Service;

import com.cs.cob.service.domain.COBRequest;

@Service("sampleService")
public class AppSetupImpl implements AppSetup {

	@Override
	public String setupApplication(COBRequest cobRequest) {
		
		System.out.println("Hi this is new application request...." + cobRequest.getAppName());
		return (cobRequest.getAppName());
	}

	
}
