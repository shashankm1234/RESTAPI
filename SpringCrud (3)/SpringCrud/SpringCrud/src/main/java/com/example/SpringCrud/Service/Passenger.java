package com.example.SpringCrud.Service;

import com.example.SpringCrud.Data.Entities.PassengerIn;
import com.example.SpringCrud.Model.Request.PassengerInfo;
import com.example.SpringCrud.Model.Response.TicketInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface Passenger {
public ResponseEntity<TicketInfo> bookInfo(PassengerInfo passengerInfo);
public Optional<PassengerIn> getPassengersById(int id);
List<PassengerIn> getPassengers();

public void delete(int id);
//public ResponseEntity<PassengerIn> update(int id);
}

