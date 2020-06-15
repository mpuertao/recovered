package com.springframework.recovered.repository;

import com.springframework.recovered.model.Recovered;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveredRepository extends MongoRepository<Recovered, Integer> {
}
