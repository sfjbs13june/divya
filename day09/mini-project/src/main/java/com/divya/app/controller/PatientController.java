package com.divya.app.controller;

import com.divya.app.model.Appointment;
import com.divya.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PatientController {
    private Map<String, Appointment> DoctorMap = new HashMap<String , Appointment>();

    @GetMapping("/my-appointment")
    public Appointment getAppointment(String patientName){
        Appointment appointment1 = new Appointment("1","patient1","doc1","4-jan-2023");
        Appointment appointment2 = new Appointment("2","patientB","docB","22-jan-2023");
        Appointment appointment3 = new Appointment("3","patientC","docC","28-jan-2023");

        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);
        DoctorMap.put(appointment3.getAppointmentId(),appointment3);

        Appointment result = DoctorMap.get(patientName);
        return result;

    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointment;
    }


}

