package com.psc.psc_management.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "farmer")
public class Farmers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "farmers_name")
    private String farmer;
    @Column(name = "district")
    private String district;
    @Column(name = "address")
    private String address;
    @Column(name = "nic")
    private String nic;
    @Column(name = "email")
    private String email;
    @Column(name = "contact")
    private float contact;
    @Column(name = "accno")
    private String accno;
    @ManyToOne
    private Branches branch;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFarmer() {
        return this.farmer;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return this.nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
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

    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public Branches getBranch() {
        return this.branch;
    }

    public void setBranch(Branches branch) {
        this.branch = branch;
    }

}
