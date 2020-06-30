package com.assignment.cabbooking.service.datafetcher;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assignment.cabbooking.error.NoBookingHistoryException;
import com.assignment.cabbooking.model.BookingHistory;
import com.assignment.cabbooking.model.BookingHistoryEntity;
import com.assignment.cabbooking.repository.BookingHistoryRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookingHistoryDataFetcher implements DataFetcher<List<BookingHistory>> {
	
	@Autowired
	private BookingHistoryRepository bookingHistoryRepository;

	@Override
	public List<BookingHistory> get(DataFetchingEnvironment environment) {
		String mobileNumber = environment.getArgument("userMobileNumber");
		System.out.println("Data fetcher......................");
		List<BookingHistory> bookingHistory = new ArrayList<>();
		List<BookingHistoryEntity> bookingHistoryDataFetcher = bookingHistoryRepository.findByBookingHistoryPKUserMobileNumber(mobileNumber);
		System.out.println(bookingHistoryDataFetcher.toString());
		if (bookingHistoryDataFetcher.isEmpty())
		{
			 throw new NoBookingHistoryException("No Booking History Available");
		}else {
			for (BookingHistoryEntity bookingHistoryEntity : bookingHistoryDataFetcher) {
				BookingHistory bHistory = new BookingHistory();
				bHistory.setUserMobileNumber(
						bookingHistoryEntity.getBookingHistoryPK().getUserMobileNumber());
				bHistory.setDriverMobileNumber(
						bookingHistoryEntity.getBookingHistoryPK().getDriverMobileNumber());
				bHistory.setDriverName(bookingHistoryEntity.getDriverName());
				bHistory.setStartPoint(bookingHistoryEntity.getStartPoint());
				bHistory.setDropPoint(bookingHistoryEntity.getDropPoint());
				bHistory.setStartLat(bookingHistoryEntity.getStartLat());
				bHistory.setStartLong(bookingHistoryEntity.getStartLong());
				bHistory.setEndLat(bookingHistoryEntity.getEndLat());
				bHistory.setEndLong(bookingHistoryEntity.getEndLong());
				bHistory.setPickupTime(bookingHistoryEntity.getPickupTime());
				bHistory.setDropTime(bookingHistoryEntity.getDropTime());
				bookingHistory.add(bHistory);
			}
		}
		return bookingHistory;
	}

}
