package com.psc.psc_management.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assign_designation")
public class AssignDesignation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "employee_id")
    private long employeeId;
    @Column(name = "brunch_id")
    private long brunchId;
    @Column(name = "designation_id")
    private long designationId;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getBrunchId() {
        return this.brunchId;
    }

    public void setBrunchId(long brunchId) {
        this.brunchId = brunchId;
    }

    public long getDesignationId() {
        return this.designationId;
    }

    public void setDesignationId(long designationId) {
        this.designationId = designationId;
    }
}
