package com.cjvirtucio.beacon.service;

import com.cjvirtucio.beacon.mapper.CrimeMapper;
import com.cjvirtucio.beacon.mapper.HospitalMapper;
import com.cjvirtucio.beacon.value.Crime;
import com.cjvirtucio.beacon.value.DistrictData;
import com.cjvirtucio.beacon.value.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    private CrimeMapper crimeMapper;

    @Autowired
    private HospitalMapper hospitalMapper;

    public List<Crime> getCrimesByDistrictId(int id) {
        return crimeMapper.getCrimesByDistrictId(id);
    }

    public List<Hospital> getHospitalsByDistrictId(int id) {
        return hospitalMapper.getHospitalsByDistrictId(id);
    }

    public DistrictData getDistrictDataByDistrictId(int id) {
        int crimeCount = crimeMapper.getCrimeCountForDistrict(id);
        int hospitalCount = hospitalMapper.getHospitalCountForDistrict(id);
        return DistrictData.create(
                id,
                crimeCount,
                hospitalCount
        );
    }
}
