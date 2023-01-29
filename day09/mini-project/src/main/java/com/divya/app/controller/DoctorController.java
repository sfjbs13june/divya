package com.divya.app.controller;



import com.divya.app.model.Appointment;
import com.divya.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DoctorController {

    public Map<String,Appointment> DoctorMap = new HashMap<String,Appointment>();

    Prescription prescription1 = new Prescription("111","111","headache","patient1","doc1");
    Prescription prescription2 = new Prescription("112", "112", "fever", "patient2", "doc2");
    Prescription prescription3 = new Prescription("113", "113", "cold", "patient3", "doc3");

    @RequestMapping("/doctor")
    public HashMap doctor(){
        HashMap DoctorMap = new HashMap();

        Appointment appointment1 = new Appointment("1","patientA","docA","4-jan-2023");
        Appointment appointment2 = new Appointment("2","patientB","docB","22-jan-2023");
        Appointment appointment3 = new Appointment("3","patientC","docC","28-jan-2023");

        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);
        DoctorMap.put(appointment3.getAppointmentId(),appointment3);

        return DoctorMap;
    }
    @GetMapping("/doctor-appointment")
    public HashMap getAppointment(Appointment appointment, @RequestParam String doctorName){
        HashMap DoctorAppointment = new HashMap();
        HashMap DoctorMap = new HashMap();


        Appointment appointment1 = new Appointment("1","patientA","docA","4-jan-2023");
        Appointment appointment2 = new Appointment("2","patientB","docB","22-jan-2023");
        Appointment appointment3 = new Appointment("3","patientC","docC","28-jan-2023");

        return DoctorMap;
    }


    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointment;
    }
}



