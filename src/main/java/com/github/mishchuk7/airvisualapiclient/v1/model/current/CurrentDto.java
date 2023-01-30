package com.github.mishchuk7.airvisualapiclient.v1.model.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrentDto {

    @JsonProperty("pollution")
    private PollutionDto pollutionDto;
    @JsonProperty("weather")
    private WeatherDto weatherDto;
}
