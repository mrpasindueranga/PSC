package com.psc.psc_management.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branches {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
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

  /**
   * @return long return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return String return the branchName
   */
  public String getBranchName() {
    return branchName;
  }

  /**
   * @param branchName the branchName to set
   */
  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  /**
   * @return String return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return String return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return String return the contact
   */
  public String getContact() {
    return contact;
  }

  /**
   * @param contact the contact to set
   */
  public void setContact(String contact) {
    this.contact = contact;
  }

  /**
   * @return Float return the capacity
   */
  public Float getCapacity() {
    return capacity;
  }

  /**
   * @param capacity the capacity to set
   */
  public void setCapacity(Float capacity) {
    this.capacity = capacity;
  }

  /**
   * @return Float return the cropLimit
   */
  public Float getCropLimit() {
    return cropLimit;
  }

  /**
   * @param cropLimit the cropLimit to set
   */
  public void setCropLimit(Float cropLimit) {
    this.cropLimit = cropLimit;
  }

  /**
   * @return Float return the budget
   */
  public Float getBudget() {
    return budget;
  }

  /**
   * @param budget the budget to set
   */
  public void setBudget(Float budget) {
    this.budget = budget;
  }

}
