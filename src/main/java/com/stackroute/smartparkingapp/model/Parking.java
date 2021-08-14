package com.stackroute.smartparkingapp.model;

import javax.persistence.*;

/**
 * This class stores the Parking details.This class should be annotated with @Entity annotation.
 */

@Entity
public class Parking {

    @Id
    private int parkingId;
    private String vehicleType;
    private String dimensions;

    public Parking(int parkingId, String vehicleType, String dimensions) {
        this.parkingId = parkingId;
        this.vehicleType = vehicleType;
        this.dimensions = dimensions;
    }

    public Parking() {
    }

    /**
     * This class should have a field of type Integer (parkingId) ,two fields of type String
     * (vehicleType,dimensions)
     **/


    /**
     * No args constructor
     */


    /**
     * Parameterised constructor
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
