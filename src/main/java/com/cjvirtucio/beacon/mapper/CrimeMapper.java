package com.cjvirtucio.beacon.mapper;

import com.cjvirtucio.beacon.value.Crime;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrimeMapper {

    List<Crime> getCrimesByDistrictId(@Param("DistrictId") int id);

    int getCrimeCountForDistrict(@Param("DistrictId") int id);
}
