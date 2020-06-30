package com.assignment.cabbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assignment.cabbooking.model.CabCurrentLocationEntity;



@EnableJpaRepositories 
public interface NearMeCabRepository extends JpaRepository<CabCurrentLocationEntity, String>{

	@Query(value = "SELECT A.driver_mobile_number,A.current_lattitude,A.current_longitude,111.045* DEGREES(ACOS(LEAST(1.0, COS(RADIANS(?1))* COS(RADIANS(current_lattitude)) * COS(RADIANS(?2) - RADIANS(current_longitude))+ SIN(RADIANS(?1))* SIN(RADIANS(current_lattitude))))) AS distance_in_km FROM tbl_cab_current_location as A  HAVING distance_in_km < ?3 ORDER BY distance_in_km limit 1",nativeQuery = true)
	List<CabCurrentLocationEntity> getCabDetails(String lattitide,String longiyude,int distance);
}
