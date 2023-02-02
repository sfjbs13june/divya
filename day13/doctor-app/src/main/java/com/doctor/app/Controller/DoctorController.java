package com.doctor.app.Controller;

import com.doctor.app.Methods.OptionalApp;
import com.doctor.app.Model.Appointment;
import com.doctor.app.Model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DoctorController {
    private Map<String,Appointment> DoctorMap= new HashMap<String,Appointment>();

    Prescription prescription1 = new Prescription("p1","ap1","fever","pat1","nihal");
    Prescription prescription2 = new Prescription("p2","ap2","cough","pat2","vihal");

    @RequestMapping("/doctor")
   public Map<String,Appointment> Requestdoctor()
    {

        Appointment appointment1 = new Appointment("ap1", "pat1", "doc1", "1-01-2023", prescription1);
        Appointment appointment2 = new Appointment("ap2","pat2","doc2","1-01-2023",prescription2);
        DoctorMap.put(appointment1.getDoctorName(),appointment1);
        DoctorMap.put(appointment2.getDoctorName(),appointment2);
        System.out.println(DoctorMap);
        return DoctorMap;
           }

//           Optional Method
    public void RequestdoctorbyOptional() {
        OptionalApp optionsApp=new OptionalApp();
        optionsApp.getPatient("ap1").ifPresent(appointment-> System.out.println(appointment.getAppointmentId()));
    }

//
    @GetMapping("/doctor/appointment")
    public Appointment getAppointments(@RequestParam String appointmentId){

        Appointment appointment1 = new Appointment("ap1", "pat1", "doc1", "1-01-2023", prescription1);
        Appointment appointment2 = new Appointment("ap2","pat2","doc2","1-01-2023",prescription2);
        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);

        List<Appointment> list = new ArrayList<>();
        Appointment result= DoctorMap.get(appointmentId);
        list.add(result);
        System.out.println(result);
        return result;
    }


    @PostMapping("doctor/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointment;
    }

}
