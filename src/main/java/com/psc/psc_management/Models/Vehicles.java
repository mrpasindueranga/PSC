package com.psc.psc_management.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vehicle_number")
    private String vehicleNumber;
    @Column(name = "capacity")
    private float capacity;
    @Column(name = "type")
    private String type;
    @Column(name = "colour")
    private float colour;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public float getCapacity() {
        return this.capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getColour() {
        return this.colour;
    }

    public void setColour(float colour) {
        this.colour = colour;
    }
}
