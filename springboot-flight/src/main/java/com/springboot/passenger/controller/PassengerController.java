package com.springboot.passenger.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.passenger.model.Passenger;
import com.springboot.passenger.service.imp.PassengerService;

@RestController
@RequestMapping("/api/Passenger")
public class PassengerController {
    
    //DI
    private PassengerService passengerService;
   
   //Constructor
    public PassengerController(PassengerService passengerService) {
    	super();
    	this.passengerService = passengerService;
    }
    
    //Build create  passenger REST API
    @PostMapping
    public ResponseEntity<Passenger> savePassenger(@RequestBody  Passenger  passenger){
        return new ResponseEntity<Passenger>( passengerService.savePassenger( passenger),
                HttpStatus.CREATED);

   }
    @GetMapping
    public List<Passenger> getAllPassenger(){
    	return passengerService.getAllPassengers();
    }
    @GetMapping("{pnrNumber}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable("pnrNumber")long pnrNumber){
    	return new ResponseEntity<Passenger>(passengerService.getPassengerById(pnrNumber),
    			HttpStatus.OK);
    	
    }
    @PutMapping("{pnrNumber}")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable("pnrNumber")long pnrNumber,
    		@RequestBody Passenger passenger){
    	return new ResponseEntity<Passenger>(passengerService.updatePassenger(passenger, pnrNumber),
    			HttpStatus.OK);
    	
    }
    @DeleteMapping("{pnrNumber}")
    public ResponseEntity<String> deletePassenger(@PathVariable("pnrNumber")long pnrNumber){
        passengerService.deletePassenger(pnrNumber);
    	return new ResponseEntity<String>("passenger details deleted sucessfully...!",HttpStatus.OK);
    
    
    
    }
    
    
    
	
}