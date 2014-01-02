package com.cs.cob.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.integration.annotation.Payload;

import com.cs.cob.service.domain.COBRequest;

@Path("/appsetup")
@Produces("application/json")
public interface AppSetup {

	@POST
	@Produces("application/json")
    @Path("/newrequest")
	@Consumes("application/json")
    public String setupApplication(COBRequest cobRequest);
}
