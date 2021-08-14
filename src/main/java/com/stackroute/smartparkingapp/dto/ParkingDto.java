package com.stackroute.smartparkingapp.dto;

import org.springframework.stereotype.Service;

/**
 * This class represents the Parking data transfer object
 **/
public class ParkingDto {

    private int parkingId;
    private String vehicleType;
    private String dimensions;



    public ParkingDto(int parkingId, String vehicleType, String dimensions) {
        this.parkingId = parkingId;
        this.vehicleType = vehicleType;
        this.dimensions = dimensions;
    }
/**
     * This class should have a field of type Integer (parkingId) ,two fields of type String
     * (vehicleType,dimensions)
     **/


    /**
     * No Args constructor
     */
    public ParkingDto() {

    }

    /**
     * parameterised constructor
     */

    /**
     * Getters and setters
     */
    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
