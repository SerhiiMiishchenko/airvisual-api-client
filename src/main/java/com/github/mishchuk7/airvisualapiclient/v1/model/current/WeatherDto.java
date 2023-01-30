package com.github.mishchuk7.airvisualapiclient.v1.model.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Data transfer object for Weather.
 */
@Data
public class WeatherDto {

    /**
     * timestamp
     */
    @JsonProperty("ts")
    private LocalDateTime timeStamp;

    /**
     * temperature in Celsius
     */
    @JsonProperty("tp")
    private String temperature;

    /**
     * atmospheric pressure in hPa
     */
    @JsonProperty("pr")
    private String pressure;

    /**
     * humidity %
     */
    @JsonProperty("hu")
    private String humidity;

    /**
     * wind speed (m/s)
     */
    @JsonProperty("ws")
    private String windSpeed;

    /**
     * wind direction, as an angle of 360° (N=0, E=90, S=180, W=270)
     */
    @JsonProperty("wd")
    private String windDirectly;

    /**
     * weather icon code
     * {@link icons}
     */
    @JsonProperty("ic")
    private String iconCode;
}
