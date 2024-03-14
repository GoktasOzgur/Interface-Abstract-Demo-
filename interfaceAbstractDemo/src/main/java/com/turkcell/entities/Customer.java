package com.turkcell.entities;

import com.turkcell.abstracts.IEntity;

import java.util.Date;

public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String nationalityId;

    public Customer(String firstName, String lastName, int birthYear, String nationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFullName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setDateofBirth(int birthYear) {
        this.birthYear= birthYear;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
