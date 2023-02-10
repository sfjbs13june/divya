package com.divya.app.controller;



import com.divya.app.model.Appointment;
import com.divya.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepos;

    @RequestMapping(value = "/my-appointment",method = RequestMethod.GET)
    public List<Appointment> getMyAppointments(@RequestParam String patientName){
        return appointmentRepos.findByPatientName(patientName);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {appointment =appointmentRepos.save(appointment);

        return appointment;
    }
}
