package com.example.bigbowlxp.services;

import com.example.bigbowlxp.models.AirHockeyTable;
import com.example.bigbowlxp.models.Booking;
import com.example.bigbowlxp.repositories.BookingRepo;
import com.example.bigbowlxp.repositories.EquipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {


    private BookingRepo bookingRepo;

    @Autowired
    public void setBookingRepo(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public BookingRepo getBookingRepo() {
        return bookingRepo;
    }

    public void createBooking(Booking b){

     bookingRepo.createBooking(b);

    }


    public void deleteBooking(int id){

    bookingRepo.deleteBooking(id);
    }
    public List<Booking> fetchAirHockeyTableBooking(){
        return bookingRepo.fetchAirHockeyTableBooking();
    }
    public List<Booking> fetchBowlingBooking(){
        return bookingRepo.fetchBowlingBooking();
    }
    public List<Booking> fetchRestaurantBooking(){
        return bookingRepo.fetchRestaurantBooking();
    }

    public void deleteJoinedBooking(int id){
    bookingRepo.deleteJoinedBookings(id);
    }

    public List<Booking> fetchBookingById(String activity){
        return bookingRepo.fetchBookingByActivity(activity);
/*
    public void fetchBookingById(int id){
        bookingRepo.fetchBookingById(id);
    }

 */


}
