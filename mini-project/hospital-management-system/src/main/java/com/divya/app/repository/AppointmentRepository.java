package com.divya.app.repository;


import com.divya.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    public  Appointment Save(Appointment appointment);
    public  List<Appointment> findByDoctorName(String doctorName);
   public List<Appointment> findByPatientName(String patientName);


}

