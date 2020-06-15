package com.springframework.recovered.unittest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.springframework.recovered.unittest.model.Recovered;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveredRepository extends MongoRepository<Recovered, Integer> {
}
