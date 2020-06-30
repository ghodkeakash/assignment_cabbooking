package com.assignment.cabbooking.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tbl_booking_details")
@Data
@EqualsAndHashCode
public class BookingHistoryEntity {
	@EmbeddedId
	private BookingHistoryPK bookingHistoryPK;
	
	@Column(name = "start_point" )
	private String  startPoint;
	
	@Column(name = "drop_point" )
	private String  dropPoint ;
	
	@Column(name = "start_lat" )
	private String  startLat;
	
	@Column(name = "start_long" )
	private String  startLong;
	
	@Column(name = "end_lat")
	private String  endLat;
	
	@Column(name = "end_long")
	private String  endLong;
	
	@Column(name = "pickup_time")
	private String  pickupTime;
	
	@Column(name = "drop_time")
	private String  dropTime;
	
	@Column(name = "ts" )
	private String  ts;
	
	@Column(name = "driver_name" )
	private String driverName;

}
