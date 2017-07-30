package com.cjvirtucio.beacon.controller;

import com.cjvirtucio.beacon.service.CrimeService;
import com.cjvirtucio.beacon.value.Crime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crimes")
public class CrimeController {

    @Autowired
    private CrimeService crimeService;

    @GetMapping("/{id}")
    public Crime show(@PathVariable int id) {
        return crimeService.getCrimeById(id);
    }
}
