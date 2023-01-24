package com.divya.app.service;



import com.divya.app.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientService {

    public Patient updateDetail(Patient patient,String disease){
        patient.setDisease(disease);
        return patient;
    }
}
