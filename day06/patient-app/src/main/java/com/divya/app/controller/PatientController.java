package com.divya.app.controller;

import com.divya.app.exception.*;
import com.divya.app.model.Patient;
import com.divya.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController

public class PatientController {

    @Value("${app.name}")
    String name;

    @Autowired
    PatientService patientService;
    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientIDNotFoundException,PatientNameNotFoundException, PatientAgeNotFoundException,PatientGenderNotFoundException,PatientDiseaseNotFoundException
    {
        if(patient.getId()==null)
        {throw new PatientIDNotFoundException("There is no patient available with the ID");}
        if(patient.getName()==null)
        {throw new PatientNameNotFoundException("There is no patient available with the name");}
        if(patient.getAge()==null)
        {throw new PatientAgeNotFoundException("There is no patient available with the Age");}
        if(patient.getGender()==null)
        {throw new PatientGenderNotFoundException("There is no patient available with the Gender");}
        if(patient.getDisease()==null)
        {throw new PatientDiseaseNotFoundException("There is no patient available with this disease");}



        System.out.println(patient);
        return patient;
    }

    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease)
    {
        return patientService.updateDetail(patient,disease);
    }
}

