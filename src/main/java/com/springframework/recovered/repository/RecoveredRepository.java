package com.springframework.recovered.repository;

import com.springframework.recovered.model.Recovered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveredRepository extends JpaRepository<Recovered, Integer> {
}
