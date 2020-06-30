package com.assignment.cabbooking.model;

import java.io.Serializable;

import javax.persistence.Embeddable;



import lombok.Data;
import lombok.EqualsAndHashCode;

@Embeddable
@Data
@EqualsAndHashCode
public class BookingHistoryPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    
	private String userMobileNumber ;
	
	
	private String driverMobileNumber ;

}
