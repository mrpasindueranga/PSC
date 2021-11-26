package com.psc.psc_management.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brunch")
public class Brunches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "brunch_name")
    private String brunchName;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "contact")
    private float contact;
    @Column(name = "capacity")
    private float capacity;
    @Column(name = "limit")
    private float croplimit;
    @Column(name = "budget")
    private float budget;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrunchName() {
        return this.brunchName;
    }

    public void setBrunchName(String brunchName) {
        this.brunchName = brunchName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getContact() {
        return this.contact;
    }

    public void setContact(float contact) {
        this.contact = contact;
    }

    public float getCapacity() {
        return this.capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getCroplimit() {
        return this.croplimit;
    }

    public void setCroplimit(float croplimit) {
        this.croplimit = croplimit;
    }

    public float getBudget() {
        return this.budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
}
