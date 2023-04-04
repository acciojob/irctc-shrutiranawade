package com.driver.services;


import com.driver.model.Passenger;
import com.driver.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Integer addPassenger(Passenger passenger) throws Exception {
        //Add the passenger Object in the passengerDb and return the passegnerId that has been returned
       // Passenger newpassenger = new Passenger();
      //  newpassenger.setName(passenger.getName());
       // newpassenger.setAge(passenger.getAge());
        passengerRepository.save(passenger);
       return passenger.getPassengerId();
    }

}
