package com.assignment.cabbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tbl_car_details")
@Data
@EqualsAndHashCode
public class CabInfoEntity {
	
	@Id
	@Column(name = "mobile_number")
	private String mobileNumber ;	
	
	@Column(name = "car_number_plate")
	private String carNumberPlate ;
	
	@Column(name = "car_name")
	private String carName; 
	
	@Column(name = "car_manufacture")
	private String  carManufacture; 
	
	@Column(name = "car_rc_details")
	private String carRcDetails;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mobileNumber", nullable = false)
	private CabDriverInfoEntity cabDriverInfoEntity;

}
