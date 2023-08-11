package com.example.SpringCrud.Service.Impl;
import com.example.SpringCrud.Data.Repo.PassengerDao;
import com.example.SpringCrud.Data.Entities.PassengerIn;
import com.example.SpringCrud.Model.Request.PassengerInfo;
import com.example.SpringCrud.Model.Response.TicketInfo;
import com.example.SpringCrud.Service.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PassengerImpl implements Passenger {
    @Autowired
    private PassengerDao passengerDao;

    @Override
    public List<PassengerIn> getPassengers(){

       return passengerDao.findAll();
    }
    @Override
    public Optional<PassengerIn> getPassengersById(int id) {
        return passengerDao.findById(id);
    }

    @Override
    public void delete(int id) {
        passengerDao.deleteById(id);
    }


    @Override
    public ResponseEntity<TicketInfo> bookInfo(PassengerInfo passengerInfo) {
        PassengerIn passenger = new PassengerIn();
        TicketInfo ticketInfo =new TicketInfo();
        passenger.setId(passengerInfo.getId());
        passenger.setFname(passengerInfo.getFname());
        passenger.setLname(passengerInfo.getLname());
        passenger.setInitial(passengerInfo.getInitial());
        passenger.setFinal(passengerInfo.getFinal());
        passenger.setFlightid("101A");
        passenger.setJourneyDate("Today");
        passengerDao.save(passenger);
        ticketInfo.setMessage("success");
        return new ResponseEntity<>(ticketInfo, HttpStatus.CREATED);
    }

  //  @Override
//    public ResponseEntity<PassengerIn> update(int id){
//        PassengerIn passenger=new PassengerIn();
//        if(passenger.getId()==id){
//            passenger.setFname(passengerInfo.getFname());
//            passenger.setLname(passengerInfo.getLname());
//            passenger.setInitial(getInitial());
//            passenger.setFinal(passengerInfo.getFinal());
//            passenger.setFlightid("101A");
//            passenger.setJourneyDate("Today");
//        }
 //   }
}
