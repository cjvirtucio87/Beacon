package com.cjvirtucio.beacon.districts;

import com.cjvirtucio.beacon.crimes.CrimeMapper;
import com.cjvirtucio.beacon.hospitals.HospitalMapper;
import com.cjvirtucio.beacon.crimes.Crime;
import com.cjvirtucio.beacon.hospitals.Hospital;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    private final CrimeMapper crimeMapper;

    private final HospitalMapper hospitalMapper;

    public DistrictService (CrimeMapper crimeMapper, HospitalMapper hospitalMapper) {
        this.crimeMapper = crimeMapper;
        this.hospitalMapper = hospitalMapper;
    }

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
