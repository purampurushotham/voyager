package com.voyager.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TOURIST_TBL")
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tou_seq")
    @SequenceGenerator(name = "tou_seq", sequenceName="tou_seq", allocationSize = 1)
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


    @OneToMany(mappedBy = "tourist", cascade = CascadeType.ALL)
    private Address addressList;
/*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="tour_id")*/
    private List<Tour> tours;


    @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
    @JoinColumn(name="pass_id")
    private Long passportId;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddressList(Address addressList) {
        this.addressList = addressList;
    }

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
    public Address getAddressList() {
        return addressList;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public Long getPasspoedId() {
        return passportId;
    }

    public void setPasspoedId(Long passpoedId) {
        this.passportId = passpoedId;
    }
}
