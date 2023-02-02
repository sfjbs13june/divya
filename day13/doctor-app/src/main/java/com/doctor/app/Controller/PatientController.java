package com.doctor.app.Controller;

import com.doctor.app.Model.Appointment;
import com.doctor.app.Model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {

    private Map<String,Appointment> DoctorMap= new HashMap<String,Appointment>();

    Prescription prescription1 = new Prescription("p1","ap1","fever","pat1","doc1");
    Prescription prescription2 = new Prescription("p2","ap2","cough","pat2","doc2");
    @RequestMapping("/patient")
    public Map getPatients(){

        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "1-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc1","1-01-2023",prescription2);
        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);

        return DoctorMap;
    }

    @GetMapping("patient/appointment")
    public Appointment getMyAppointments(@RequestParam String patientName){

        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "1-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc1","1-01-2023",prescription2);
        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);

        
        Appointment result= DoctorMap.get(patientName);
        return result;
    }

    @PostMapping("patient/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointment;
    }
}
