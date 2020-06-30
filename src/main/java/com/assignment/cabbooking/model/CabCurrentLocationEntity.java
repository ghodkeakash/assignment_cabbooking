package com.assignment.cabbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "tbl_cab_current_location")
@Data
public class CabCurrentLocationEntity {
	
	@Id
	@Column(name = "driver_mobile_number")
	private String driverMobileNumber;
	
	@Column(name = "current_lattitude")
	private String currentLattitude;
	
	@Column(name = "current_longitude")
	private String currentLongitude;
	
	@Transient
	private String distanceInKm;
	
	

}
