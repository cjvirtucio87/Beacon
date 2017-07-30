package com.cjvirtucio.beacon.controller;

import com.cjvirtucio.beacon.service.DistrictService;
import com.cjvirtucio.beacon.value.Crime;
import com.cjvirtucio.beacon.value.DistrictData;
import com.cjvirtucio.beacon.value.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("districts")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/{id}")
    public DistrictData getDistrictData(@PathVariable int id) {
        return districtService.getDistrictDataByDistrictId(id);
    }

    @GetMapping("/crimes/{id}")
    public List<Crime> getCrimesByDistrictId(@PathVariable int id) {
        return districtService.getCrimesByDistrictId(id);
    }

    @GetMapping("/hospitals/{id}")
    public List<Hospital> getHospitalsByDistrictId(@PathVariable int id) {
        return districtService.getHospitalsByDistrictId(id);
    }
}