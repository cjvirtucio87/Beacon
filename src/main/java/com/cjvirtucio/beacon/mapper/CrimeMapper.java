package com.cjvirtucio.beacon.mapper;

import com.cjvirtucio.beacon.value.Crime;
import org.apache.ibatis.annotations.Param;

public interface CrimeMapper {
    Crime getCrimeById(@Param("CrimeId") int id);
}
