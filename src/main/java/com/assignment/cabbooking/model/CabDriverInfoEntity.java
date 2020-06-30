package com.assignment.cabbooking.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tbl_driver_info")
@Data
@EqualsAndHashCode
public class CabDriverInfoEntity {
	
	@Id	
	@Column(name = "mobile_number")
	private String mobileNumber; 
	
	@Column(name = "first_name")
	private String firstName; 
	
	@Column(name = "last_name")
	private String lastName ;
	
	@Column(name = "licence_number")
	private String licenceNumber;
	
	
	@OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "cabDriverInfoEntity")
	private CabInfoEntity cabInfoEntity;

	
}
