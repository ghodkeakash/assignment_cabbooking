package com.assignment.cabbooking.error;

import java.util.List;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class NoCabAvailableException extends RuntimeException implements GraphQLError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoCabAvailableException(String message) {
		super(message);
	}
	
	@Override
	   public String getMessage() {
	       return super.getMessage();
	   }
	
	@Override
	public List<SourceLocation> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		// TODO Auto-generated method stub
		return null;
	}

}
