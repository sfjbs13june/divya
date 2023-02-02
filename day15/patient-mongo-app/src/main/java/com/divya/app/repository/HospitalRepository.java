package com.divya.app.repository;

import com.divya.app.model.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {

    public Hospital findByName(String name);

    public Hospital findByAddress(String address);

    public void deleteByname(String name);

    public Hospital save(Hospital hospital);
}


