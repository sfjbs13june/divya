package com.doctor.app.Controller;

import com.doctor.app.Model.Appointment;
import com.doctor.app.Model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;


@RestController
public class PrescriptionController {
    private Map<String, Prescription> DoctorMap= new HashMap<String,Prescription>();
    @GetMapping("/prescription/view")
    public Prescription getAllPrescriptions(String patientName){

        Prescription result = DoctorMap.get(patientName);
        return result;
    }

    @PostMapping("/prescription/save")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        DoctorMap.put(prescription.getPrescriptionId(),prescription);
        return prescription;
    }
}
