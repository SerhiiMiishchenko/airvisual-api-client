package com.github.mishchuk7.airvisualapiclient.v1.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CityDto {

    @JsonProperty("city")
    private String name;
}
