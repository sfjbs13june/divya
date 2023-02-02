package com.doctor.app.Methods;

import com.doctor.app.Model.Appointment;
import com.doctor.app.Model.Prescription;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalApp {

    Prescription prescription1 = new Prescription("p1","ap1","fever","pat1","doc1");
    Prescription prescription2 = new Prescription("p2","ap2","cough","pat2","doc2");


    public Optional<Appointment> getPatient(String name){

        Appointment appointment1 = new Appointment("ap1", "pat1", "doc1", "1-01-2023", prescription1);
        Appointment appointment2 = new Appointment("ap2","pat2","doc2","1-01-2023",prescription2);
        Map<String, Appointment> data = new HashMap<>();
        data.put("ap01", appointment1);
        data.put("ap01", appointment2);
        Appointment result= data.get(name);
        return Optional.ofNullable(result);

    }


}
