package com.divya.app.model;

public class Hospital {

    String name;
    String doctername;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctername() {
        return doctername;
    }

    public void setDoctername(String doctername) {
        this.doctername = doctername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Hospital(String name, String doctername, String address) {
        this.name = name;
        this.doctername = doctername;
        this.address = address;
    }

    public void setDoctorname(String doctorname) {
    }
}
