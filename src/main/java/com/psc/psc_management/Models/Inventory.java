package com.psc.psc_management.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "request_id")
    private Integer reqId;
    @Column(name = "date")
    private Date date;
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "rate")
    private String rate;
    @Column(name = "btypr")
    private String btype;
    @Column(name = "vehicle")
    private String vehicle;
    @Column(name = "total")
    private String total;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReqId() {
        return this.reqId;
    }

    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getBtype() {
        return this.btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public String getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
