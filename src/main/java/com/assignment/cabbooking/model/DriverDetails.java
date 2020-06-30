package com.assignment.cabbooking.model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class DriverDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mobileNumber;
	
	private String carManufacture;
	
	private String name;
	
	private String carName;
	
	private String carNumberPlate;
	
	private String currentLattitude;
	
	private String currentLongitude;
	
	private String distanceInKm;

}
