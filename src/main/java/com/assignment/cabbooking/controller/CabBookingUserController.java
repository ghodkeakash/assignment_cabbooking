package com.assignment.cabbooking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.cabbooking.api.properties.AssignmentApiConfig;
import com.assignment.cabbooking.service.GraphQLService;

import graphql.ExecutionResult;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = AssignmentApiConfig.CABBOOKING_API_VERSION_V1)

public class CabBookingUserController {
	private static final Logger logger = LoggerFactory.getLogger(CabBookingUserController.class);

	@Value("${shikhar.api.server.error:Internal server error.}")
	private String serverError;
	
	
	  @Autowired private GraphQLService graphQLService;
	  	
	 @PostMapping 
	 public ResponseEntity<Object> getUserDetails(@RequestBody String query) { 
		 
		 ExecutionResult execute =	 graphQLService.getGraphQL().execute(query);
		 
		 if (execute.getErrors().isEmpty()) {
	       return new ResponseEntity<>(execute, HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>(execute, HttpStatus.OK); 
		 }
	 }
	 
}
