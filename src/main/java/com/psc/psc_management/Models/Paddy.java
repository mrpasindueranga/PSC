package com.psc.psc_management.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paddy")
public class Paddy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date")
    private Date date;
    @Column(name = "buying")
    private float buying;
    @Column(name = "selling")
    private float selling;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
