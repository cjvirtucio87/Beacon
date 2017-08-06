package com.cjvirtucio.beacon.crimes;

import org.springframework.stereotype.Service;

@Service
public class CrimeService {

    private final CrimeMapper crimeMapper;

    public CrimeService(CrimeMapper crimeMapper) {
        this.crimeMapper = crimeMapper;
    }

    public Crime getCrimeById(int id) {
        return crimeMapper.getCrimeById(id);
    }

    public int createCrime(Crime crime) {
        return crimeMapper.createCrime(crime);
    }
}
