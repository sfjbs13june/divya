package com.divya.db.repository;

import com.divya.db.model.Message;
import com.divya.db.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

