package com.voyager.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TOURIST_TBL")
public class Tourist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    @NotNull
    @Size(min = 4, max = 20)
    private String firstName;


    @Column
    @NotNull
    @Size(min = 4, max = 20)
    private String lastName;

    @Column
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dob;

    /*@OneToMany(mappedBy = "tourist")
    private Set<Address> addressList;*/

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*public void setAddressList(Set<Address> addressList) {
        this.addressList = addressList;
    }*/

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }
    /*public Set<Address> getAddressList() {
        return addressList;
    }
/*
    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }*/

}
