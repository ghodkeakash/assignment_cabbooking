

CREATE TABLE IF NOT EXISTS tbl_booking_details (
  user_mobile_number varchar(10) NOT NULL,
  driver_mobile_number varchar(10) NOT NULL,
  start_point varchar(100) DEFAULT NULL,
  drop_point varchar(100) DEFAULT NULL,
  start_lat varchar(45) DEFAULT NULL,
  start_long varchar(45) DEFAULT NULL,
  end_lat varchar(45) DEFAULT NULL,
  end_long varchar(45) DEFAULT NULL,
  pickup_time datetime DEFAULT NULL,
  drop_time datetime DEFAULT NULL,
  driver_name varchar(100) DEFAULT NULL,
  ts datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (user_mobile_number,driver_mobile_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tbl_booking_details VALUES ('9420334597','999999998','Hebbal','Whitfield','17.876544','54.2345677','18.5678988','57.4567899','2020-06-01 13:24:01','2020-06-01 14:24:01','ram','2020-06-28 12:48:10'),('9922282227','999999998','Hebbal','Whitfield','17.876544','54.2345677','18.5678988','57.4567899','2020-06-01 13:24:01','2020-06-01 14:24:01','sham','2020-06-28 12:47:44'),('9922282227','999999999','Hebbal','Whitfield','17.876544','54.2345677','18.5678988','57.4567899','2020-06-01 13:24:01','2020-06-01 14:24:01','ram','2020-06-28 12:46:51');

CREATE TABLE IF NOT EXISTS tbl_cab_current_location (
  driver_mobile_number varchar(10) NOT NULL,
  current_lattitude varchar(45) DEFAULT NULL,
  current_longitude varchar(45) DEFAULT NULL,
  PRIMARY KEY (driver_mobile_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into tbl_cab_current_location(driver_mobile_number,current_lattitude,current_longitude) values ('1234567890','13.019318','77.595718');

insert into tbl_cab_current_location(driver_mobile_number,current_lattitude,current_longitude) values ('1234567891','13.025789','77.603765');

CREATE TABLE IF NOT EXISTS tbl_car_details (
  mobile_number varchar(10) NOT NULL,
  car_number_plate varchar(100) DEFAULT NULL,
  car_name varchar(100) DEFAULT NULL,
  car_manufacture varchar(100) DEFAULT NULL,
  car_rc_details varchar(45) DEFAULT NULL,
  ts datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (mobile_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into tbl_car_details(mobile_number,car_number_plate,car_name,car_manufacture,car_rc_details) values ('1234567890','MH 01 AQ 1234','ABC','XYZ','MH1029292o2o');

insert into tbl_car_details(mobile_number,car_number_plate,car_name,car_manufacture,car_rc_details) values ('1234567891','MH 01 AQ 9876','PQR','XYZ','MH1087767654');


CREATE TABLE IF NOT EXISTS tbl_driver_info (
  mobile_number varchar(10) NOT NULL,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  licence_number varchar(45) DEFAULT NULL,
  ts datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (mobile_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into tbl_driver_info(mobile_number,first_name,last_name,licence_number) values ('1234567890','Ram','RAm','12345gfdsadfghgg');

insert into tbl_driver_info(mobile_number,first_name,last_name,licence_number) values ('1234567891','Sham','RAm','jhgfgh12345');


CREATE TABLE IF NOT EXISTS tbl_user_details (
  mobile_number varchar(10) NOT NULL,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  mail_id varchar(100) DEFAULT NULL,
  ts datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (mobile_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;








