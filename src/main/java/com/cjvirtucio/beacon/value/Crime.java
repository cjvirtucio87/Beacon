package com.cjvirtucio.beacon.value;

import lombok.Data;
import org.joda.time.DateTime;

@Data
public class Crime {
    private int id;
    private DateTime crimeDate;
    private String crimeTime;
    private String crimeCode;
    private String location;
    private String description;
    private String weapon;
    private int post;
    private String districtName;
    private int districtId;
    private String neighborhood;
    private String coords;
    private String crimeCaseNumber;
}