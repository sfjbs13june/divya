package com.divya.app.repository;
import com.divya.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription, String> {

    public Prescription save(Prescription prescription);

    public List<Prescription> findAllByPatientName(String patientName);

}

