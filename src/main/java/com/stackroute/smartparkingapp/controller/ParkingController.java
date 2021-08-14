package com.stackroute.smartparkingapp.controller;


import com.stackroute.smartparkingapp.dto.ParkingDto;
import com.stackroute.smartparkingapp.model.Parking;
import com.stackroute.smartparkingapp.repo.ParkingRepo;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

/**
 * As in this assignment, we are working with demonstrating the  use of sl4j for logging in microservices
 * annotate the class with @RestController annotation,@CrossOrigin and @RequestMapping
 * Please note that the default path to use this controller should be "/api/v1"
 */

@CrossOrigin("*")
@RequestMapping("api/v1")
@RestController
public class ParkingController {


    private static Logger logger = LoggerFactory.getLogger(ParkingController.class);

    private ParkingRepo parkingRepo;
    private ModelMapper modelMapper;

    /**
     * Constructor autowiring should be implemented for the ParkingRepo, ModelMapper
     * without using the new keyword
     **/
    @Autowired
    public ParkingController(ParkingRepo parkingRepo, ModelMapper modelMapper) {
        this.parkingRepo = parkingRepo;
        this.modelMapper = modelMapper;
    }

    private ParkingDto convertToParkingDto(Parking parking){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ParkingDto parkingDto = modelMapper.map(parking , ParkingDto.class);
        return parkingDto;
    }

    /**
     * API Version: 1.0
     * Define a handler method which will add new parking details by reading the Serialized
     * ParkingDto object from request body and save the Parking in database.The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 201(CREATED - In case of successful creation of the task
     * 2. 400(Bad Request - In case the request is not readable
     * This handler method should map to the URL "/api/v1/parking" using HTTP POST
     * method".
     */

    @PostMapping("/parking")
    public ResponseEntity<Parking> addParking(@RequestBody ParkingDto parkingDto){
        if(parkingRepo.findAllById().isEmpty()){

        }
        return;
    }


    /**
     * API Version: 1.0
     * Define a handler method which will update new parking details by reading the Serialized
     * ParkingDto object from request body and update the Parking in database.The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 201(CREATED - In case of successful creation of the task
     * 2. 400(Bad Request - In case the request is not readable
     * This handler method should map to the URL "/api/v1/parking" using HTTP PUT
     * method".
     */

    /**
     * API Version: 1.0
     * Define a handler method which will retrieve all parking details
     * The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 200(OK) - If the tasks found successfully
     * This handler method should map to the URL "/api/v1/parkings" using HTTP POST
     * method".
     */


    /**
     * API Version: 1.0
     * Define a handler method which will Delete a parking by reading the Serialized
     * TaskDto object from request body ;
     * This handler method should return any one of the status messages basis on
     * different situations:
     * 1.200(OK) - If the parking deleted successfully.
     * 2.400(BAD REQUEST) - If the request is not readable.
     * This handler method should map to the URL "/api/v1/task" using HTTP DELETE
     * method".
     */


    /**
     * Define the private methods as required
     **/


}
