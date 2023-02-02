package com.divya.app.controller;

import com.divya.app.model.Patient;
import com.divya.app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patient) {
        patient = patientRepository.save(patient);
        return patient;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Patient> readStudent() {
        return patientRepository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Patient readByNamePatient(@PathVariable("name") String name) {
        return patientRepository.findByName(name);
    }
}

