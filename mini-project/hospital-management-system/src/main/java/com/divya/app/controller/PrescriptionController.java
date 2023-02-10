package com.divya.app.controller;

import com.divya.app.model.Prescription;
import com.divya.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(@RequestParam String patientName){
        return prescriptionRepository.findAllByPatientName(patientName);
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        return prescription;
    }

}

