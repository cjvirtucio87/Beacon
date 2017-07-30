package com.cjvirtucio.beacon.service;

import com.cjvirtucio.beacon.mapper.CrimeMapper;
import com.cjvirtucio.beacon.value.Crime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrimeService {

    @Autowired
    private CrimeMapper crimeMapper;

    public Crime getCrimeById(int id) {
        return crimeMapper.getCrimeById(id);
    }

    public int createCrime(Crime crime) {
        return crimeMapper.createCrime(crime);
    }
}
