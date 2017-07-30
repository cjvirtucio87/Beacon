package com.cjvirtucio.beacon.mapper;

import com.cjvirtucio.beacon.value.Hospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalMapper {

    List<Hospital> getHospitalsByDistrictId(@Param("DistrictId") int id);

    int getHospitalCountForDistrict(@Param("DistrictId") int id);
}
