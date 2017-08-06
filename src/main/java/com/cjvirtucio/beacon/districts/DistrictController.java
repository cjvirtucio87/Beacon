package com.cjvirtucio.beacon.districts;

import com.cjvirtucio.beacon.crimes.Crime;
import com.cjvirtucio.beacon.hospitals.Hospital;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("districts")
public class DistrictController {

    private final DistrictService districtService;

    public DistrictController (DistrictService districtService) {
        this.districtService = districtService;
    }

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