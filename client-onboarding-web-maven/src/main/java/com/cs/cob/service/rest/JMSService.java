package com.cs.cob.service.rest;

import org.springframework.stereotype.Component;

import com.cs.cob.service.domain.COBResponse;

@Component("jmsService")
public class JMSService {
	
	public COBResponse doSomething(COBResponse response)
	{
		response.setAppOwner("Sunil Verma");
		return response;
	}

}
