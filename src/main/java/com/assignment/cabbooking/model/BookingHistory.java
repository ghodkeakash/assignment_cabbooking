package com.assignment.cabbooking.model;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class BookingHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String userMobileNumber;
	
	private String driverMobileNumber ;
	
	
	private String  startPoint;
	
	
	private String  dropPoint ;
	
	
	private String  startLat;
	
	
	private String  startLong;
	
	
	private String  endLat;
	
	@Column(name = "end_long")
	private String  endLong;
	
	
	private String  pickupTime;
	
	
	private String  dropTime;
	
	
	private String driverName;

	
	
	

}
