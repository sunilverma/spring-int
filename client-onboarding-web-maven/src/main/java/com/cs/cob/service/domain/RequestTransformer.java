package com.cs.cob.service.domain;

import org.springframework.stereotype.Component;


@Component("requestTransformer")
public class RequestTransformer {

public String transInput(COBRequest cobRequest)
{
	System.out.println("Input trasn >> " + cobRequest.getAppName());
	return (cobRequest.getAppName());
}


public String transOutput(COBRequest cobRequest)
{
	System.out.println("XXXOutput trasn >> " + cobRequest.getAppName());
	return (cobRequest.getAppName().toUpperCase());
}


}
