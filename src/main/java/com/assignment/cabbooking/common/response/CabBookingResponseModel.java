package com.assignment.cabbooking.common.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class CabBookingResponseModel implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private boolean success=true;
	private String message;
	private Object data;

}
