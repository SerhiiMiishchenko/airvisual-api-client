package com.github.mishchuk7.airvisualapiclient.v1.model.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class LocationDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("coordinates")
    private List<String> coordinates;
}
