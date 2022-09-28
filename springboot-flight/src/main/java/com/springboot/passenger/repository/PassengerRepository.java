package com.springboot.passenger.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.passenger.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
