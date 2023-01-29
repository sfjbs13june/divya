package com.divya.app.model;

import org.springframework.stereotype.Component;

@Component
public class Appointment {

    String appointmentId;
    String patientName;
    String doctorName;
    String date;

    public Appointment(String appointmentId, String patientName, String doctorName, String date){

        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;

    }
    public String getAppointmentId(){
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
