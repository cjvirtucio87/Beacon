package com.cjvirtucio.beacon.hospitals;

import lombok.Data;

@Data
public class Hospital {

    private int id;
    private String name;
    private String type;
    private String zipCode;
    private String neighborhood;
    private String councilDistrict;
    private String districtName;
    private int districtId;
    private String location;
}
