package com.assignment.cabbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.cabbooking.model.BookingHistory;
import com.assignment.cabbooking.model.BookingHistoryEntity;
import com.assignment.cabbooking.model.BookingHistoryPK;




@Repository
public interface BookingHistoryRepository extends JpaRepository<BookingHistoryEntity, BookingHistoryPK> {
	List<BookingHistoryEntity> findByBookingHistoryPKUserMobileNumber(String userMobileNumber);
}
