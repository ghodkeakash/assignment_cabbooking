package com.assignment.cabbooking.service.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.assignment.cabbooking.error.NoCabAvailableException;
import com.assignment.cabbooking.model.CabCurrentLocationEntity;
import com.assignment.cabbooking.model.CabDriverInfoEntity;
import com.assignment.cabbooking.model.DriverDetails;
import com.assignment.cabbooking.repository.DriverDetailsRepository;
import com.assignment.cabbooking.repository.NearMeCabRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;


@Component
public class DriverDetailsDataFetcher implements DataFetcher<DriverDetails> {

	@Autowired
	private NearMeCabRepository nearMeCabRepository;
	
	@Autowired
	private DriverDetailsRepository driverDetailsRepository;
	
	@Value("${distance:5}")
	private int distance;
	
	@Override
	public DriverDetails get(DataFetchingEnvironment environment) {
		String mobileNumber = environment.getArgument("userMobileNumber");
		String lattitude = environment.getArgument("lattitude");
		String longitude = environment.getArgument("longitude");
		
		List<CabCurrentLocationEntity> cabCurrentDetailsModel = nearMeCabRepository.getCabDetails(lattitude,longitude,distance);
		DriverDetails driverDetails = new DriverDetails();
		 String dMobileNumber = "";
		 String dCurrentLat = "";
		 String dCurrentLong = "";
		 String dDistanc = "";
;			
		for (CabCurrentLocationEntity cabCurrentLocationEntity : cabCurrentDetailsModel) {
			dMobileNumber = cabCurrentLocationEntity.getDriverMobileNumber();
			dCurrentLat = cabCurrentLocationEntity.getCurrentLattitude();
			dCurrentLong = cabCurrentLocationEntity.getCurrentLongitude();
			dDistanc = cabCurrentLocationEntity.getDistanceInKm();
		}
		
		if(cabCurrentDetailsModel.isEmpty()) {
			throw new NoCabAvailableException("Hi ! Sorry No Cabs Available Near you..");
						
		}else {
			
			List<CabDriverInfoEntity>  cabDriverInfoEntity = driverDetailsRepository.findByMobileNumber(dMobileNumber);
			
			for (CabDriverInfoEntity cabDriverInfo : cabDriverInfoEntity) {					
				driverDetails.setMobileNumber(cabDriverInfo.getMobileNumber());
				driverDetails.setName(cabDriverInfo.getFirstName() +" "+ cabDriverInfo.getLastName());
				driverDetails.setCarManufacture(cabDriverInfo.getCabInfoEntity().getCarManufacture());
				driverDetails.setCarName(cabDriverInfo.getCabInfoEntity().getCarName());
				driverDetails.setCarNumberPlate(cabDriverInfo.getCabInfoEntity().getCarNumberPlate());
				driverDetails.setCurrentLattitude(dCurrentLat);
				driverDetails.setCurrentLongitude(dCurrentLong);
				driverDetails.setDistanceInKm(dDistanc);
				
			}	
		
	 }
		return driverDetails;
	}		

}
