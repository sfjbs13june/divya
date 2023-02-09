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
    static
    PrescriptionRepository prescriptionRepos;
    @RequestMapping(value = "/view-prescription",method = RequestMethod.GET)
    public List<Prescription> getAllPrescriptions(String patientName)
    {
       return PrescriptionRepository.findByPatientName(patientName);
    }

    @RequestMapping(value = "/save-prescription",method = RequestMethod.POST)
    public static Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepos.save(prescription);
        return prescription;
    }
}

