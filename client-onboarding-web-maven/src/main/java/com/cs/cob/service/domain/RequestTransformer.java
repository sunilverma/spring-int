package com.cs.cob.service.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component("requestTransformer")
public class RequestTransformer {

public String transInput(COBRequest cobRequest)
{
	System.out.println("Input trasn >> " + cobRequest.getAppName());
	return (cobRequest.getAppName());
}


public COBResponse transOutput(COBRequest cobRequest)
{
	System.out.println("XXXOutput trasn >> " + cobRequest.getAppName());
	List<String> userList = new ArrayList<String>();
	userList.add("Sunil");
	userList.add("Anil");
	COBResponse response = new COBResponse(cobRequest.getAppName(),"CRITICAL",userList);
	return response;
}


}
