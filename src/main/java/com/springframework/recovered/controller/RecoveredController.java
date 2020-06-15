package com.springframework.recovered.controller;

import com.springframework.recovered.model.Recovered;
import com.springframework.recovered.service.RecoveredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecoveredController {

    @Autowired
    private RecoveredService recoveredService;

    @GetMapping("/recovered")
    public List<Recovered> retrieveAllRecovered() {
        return recoveredService.retrieveAllRecovered();
    }

    @GetMapping("/recovered/{id}")
    public Recovered retrieveRecovered(@PathVariable int id) {
        return recoveredService.retrieveRecovered(id);
    }

    @PostMapping("/recovered")
    public Integer createRecovered(@RequestBody Recovered recovered) {
        return recoveredService.createRecovered(recovered);
    }
}
