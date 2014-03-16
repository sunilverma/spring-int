package com.cs.cob.service;

import java.util.List;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.CorrelationStrategy;
import org.springframework.integration.annotation.Header;
import org.springframework.integration.annotation.ReleaseStrategy;
import org.springframework.stereotype.Component;

import com.cs.cob.common.Application;

@Component("applicationSetupAggregator")
public class ApplicationSetupAggregator {

	 @CorrelationStrategy
    public String correlateBy(@Header("correlationId") String id) {
    	System.out.println("======================================== " +id);
        return id;
    }
     @ReleaseStrategy
  public boolean releaseChecker(List<Message<?>> messages) {
  		  System.out.println(messages.size()+ "======================================== " +messages.get(0).getHeaders().getSequenceSize()); 	
          if(messages.size()== messages.get(0).getHeaders().getSequenceSize())
          return true;
          
          return false;
  }
  
  @Aggregator
  public String aggregate(List<String> messages) {
  		for(String message: messages)
  			System.out.println(":::::::::: "+ message);
          return "DOne";
  }

}
