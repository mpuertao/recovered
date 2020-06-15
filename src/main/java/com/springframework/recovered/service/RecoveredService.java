package com.springframework.recovered.service;

import com.springframework.recovered.model.Recovered;
import com.springframework.recovered.repository.RecoveredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RecoveredService {

    @Autowired
    private RecoveredRepository recoveredRepository;

    public List<Recovered> retrieveAllRecovered() {
        return recoveredRepository.findAll();
    }

    public Recovered retrieveRecovered(@PathVariable int id) {
        Recovered recovered = recoveredRepository.findById(id)
                .get();
        Recovered response = new Recovered();
        response.setName(recovered.getName()
        .toLowerCase());
        response.setId(recovered.getId());
        response.setAge(recovered.getAge());
        return response;
    }

    public Integer createRecovered(@RequestBody Recovered recovered) {
        return recoveredRepository.save(recovered)
                .getId();
    }
}
