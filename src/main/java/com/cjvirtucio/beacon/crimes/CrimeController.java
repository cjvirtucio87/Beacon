package com.cjvirtucio.beacon.crimes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("crimes")
public class CrimeController {

    private final CrimeService crimeService;

    public CrimeController(CrimeService crimeService) {
        this.crimeService = crimeService;
    }

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
