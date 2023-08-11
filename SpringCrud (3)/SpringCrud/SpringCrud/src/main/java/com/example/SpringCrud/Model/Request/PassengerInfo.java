package com.example.SpringCrud.Model.Request;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class PassengerInfo {
    private int id;
    private String Fname;
    private  String Lname;
    private  String Initial;
    private static String Final;
    private String Flightid;
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

    public  void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public  void setLname(String lname) {
        Lname = lname;
    }

    public  String getInitial() {
        return Initial;
    }

    public  void setInitial(String initial) {
        Initial = initial;
    }

    public  String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        PassengerInfo.Final = Final;
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

}
