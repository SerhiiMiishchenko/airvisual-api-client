package com.github.mishchuk7.airvisualapiclient.v1.model.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Data transfer object for Pollution.
 */
@Data
public class PollutionDto {

    /**
     * timestamp
     */
    @JsonProperty("ts")
    private LocalDateTime timeStamp;

    /**
     * AQI value based on US EPA standard
     */
    @JsonProperty("aqius")
    private String aqius;


    /**
     * main pollutant for US AQI
     */
    @JsonProperty("mainus")
    private String mainus;


    /**
     * AQI value based on China MEP standard
     */
    @JsonProperty("aqicn")
    private String aqicn;


    /**
     * main pollutant for Chinese AQI
     */
    @JsonProperty("maincn")
    private String maincn;
}
