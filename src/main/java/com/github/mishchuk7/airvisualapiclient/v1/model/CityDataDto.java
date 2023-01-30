package com.github.mishchuk7.airvisualapiclient.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.mishchuk7.airvisualapiclient.v1.model.current.CurrentDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.location.LocationDto;
import lombok.Data;

@Data
public class CityDataDto {

    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("location")
    private LocationDto locationDto;
    @JsonProperty("current")
    private CurrentDto currentDto;

}
