package com.cjvirtucio.beacon.value;

import lombok.Data;

@Data
public class DistrictData {

    private int districtId;

    private int crimeCount;

    private int hospitalCount;

    private float hospitalsPerCrime;

    public static DistrictData create(int id, int crimeCount, int hospitalCount) {
        DistrictData districtData = new DistrictData();
        districtData.setDistrictId(id);
        districtData.setCrimeCount(crimeCount);
        districtData.setHospitalCount(hospitalCount);
        districtData.setHospitalsPerCrime(
                (float) hospitalCount / (crimeCount <= 0 ? 1 : crimeCount)
        );
        return districtData;
    }
}
