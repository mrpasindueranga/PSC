package com.psc.psc_management.Models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branches {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "branch_name")
  private String branchName;
  @Column(name = "address")
  private String address;
  @Column(name = "email")
  private String email;
  @Column(name = "contact")
  private String contact;
  @Column(name = "capacity")
  private Float capacity;
  @Column(name = "crop_limit")
  private Float cropLimit;
  @Column(name = "budget")
  private Float budget;

  @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Employees> employees;

  @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Farmers> farmers;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getBranchName() {
    return this.branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
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

  public String getContact() {
    return this.contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Float getCapacity() {
    return this.capacity;
  }

  public void setCapacity(Float capacity) {
    this.capacity = capacity;
  }

  public Float getCropLimit() {
    return this.cropLimit;
  }

  public void setCropLimit(Float cropLimit) {
    this.cropLimit = cropLimit;
  }

  public Float getBudget() {
    return this.budget;
  }

  public void setBudget(Float budget) {
    this.budget = budget;
  }

  public Set<Employees> getEmployees() {
    return this.employees;
  }

  public void setEmployees(Set<Employees> employees) {
    this.employees = employees;
  }

  public Set<Farmers> getFarmers() {
    return this.farmers;
  }

  public void setFarmers(Set<Farmers> farmers) {
    this.farmers = farmers;
  }

}
