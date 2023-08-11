package com.example.SpringCrud.Controller;

import com.example.SpringCrud.Data.Entities.PassengerIn;
import com.example.SpringCrud.Model.Request.PassengerInfo;
import com.example.SpringCrud.Model.Response.TicketInfo;
import com.example.SpringCrud.Service.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private Passenger passenger;
    @GetMapping("/GetPassenger")
   public List<PassengerIn> getPassengers(){
       return passenger.getPassengers();
   }
   @GetMapping("/GetPassenger/{id}")
   public Optional<PassengerIn> getPassengersById(@PathVariable int id){
        return passenger.getPassengersById(id);
   }
    @PostMapping("/BookFlightTicket")
    public ResponseEntity<TicketInfo> BookTicket(@RequestBody PassengerInfo passengerInfo) {
        return passenger.bookInfo(passengerInfo) ;
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable int id){
        passenger.delete(id);
    }
//    @PutMapping("/update/{id}")
//    public ResponseEntity<PassengerIn> update(@PathVariable int id){
//        return null;
//    }
}
