package com.springframework.recovered.unittest.repository;

import com.springframework.recovered.unittest.model.Recovered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveredRepository extends JpaRepository<Recovered, Integer> {
}
