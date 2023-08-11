package com.example.SpringCrud.Data.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="passenger_in")
public class PassengerIn {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "fname")
    private String Fname;
    @Column(name="lname")
    private String Lname;
    @Column(name="initial")
    private String Initial;
     @Column(name="final")
    private String Final;
    @Column(name="flightid")
    private String Flightid;
    @Column(name="journey_date")
    private String JourneyDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }
    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getInitial() {
        return Initial;
    }

    public void setInitial(String initial) {
        Initial = initial;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }

    public String getFlightid() {
        return Flightid;
    }

    public void setFlightid(String flightid) {
        Flightid = flightid;
    }

    public String getJourneyDate() {
        return JourneyDate;
    }

    public void setJourneyDate(String journeyDate) {
        JourneyDate = journeyDate;
    }

    public PassengerIn(int id, String fname, String lname, String initial, String aFinal, String flightid, String journeyDate) {
        this.id = id;
        Fname = fname;
        Lname = lname;
        Initial = initial;
        Final = aFinal;
        Flightid = flightid;
        JourneyDate = journeyDate;
    }

    public PassengerIn() {
        super();
    }

}