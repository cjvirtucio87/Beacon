package com.cjvirtucio.beacon.controller;

import com.cjvirtucio.beacon.service.CrimeService;
import com.cjvirtucio.beacon.value.Crime;
import com.cjvirtucio.beacon.value.DistrictData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("crimes")
public class CrimeController {

    @Autowired
    private CrimeService crimeService;

    @GetMapping("/{id}")
    public Crime getCrimeById(@PathVariable int id) {
        return crimeService.getCrimeById(id);
    }

    @PostMapping("/")
    public Crime createCrime(@RequestBody Crime crime) throws Exception {
        int result = crimeService.createCrime(crime);
        if (result > 0) {
            return crime;
        }
        throw new Exception(
                "<<<CREATE FAILURE>>>"
                + "Could not create crime with the following data, "
                + crime
        );
    }
}
