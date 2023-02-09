package com.divya.app.controller;



import com.divya.app.model.Appointment;
import com.divya.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepos;

    @RequestMapping(value = "doctor-appointment", method = RequestMethod.GET)
    public List<Appointment> getAppointments(@RequestParam String doctorName) {

        return appointmentRepos.findBydoctorName(doctorName);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        appointment = appointmentRepos.save(appointment);
        return appointment;
    }
}
