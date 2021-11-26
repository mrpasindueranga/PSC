package com.psc.psc_management.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paddy")
public class Paddy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "paddy_name")
    private Date paddyName;
    @Column(name = "date")
    private Date date;
    @Column(name = "buying")
    private float buying;
    @Column(name = "selling")
    private float selling;
    @OneToOne
    private Employees employee;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPaddyName() {
        return this.paddyName;
    }

    public void setPaddyName(Date paddyName) {
        this.paddyName = paddyName;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getBuying() {
        return this.buying;
    }

    public void setBuying(float buying) {
        this.buying = buying;
    }

    public float getSelling() {
        return this.selling;
    }

    public void setSelling(float selling) {
        this.selling = selling;
    }

    public Employees getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

}
