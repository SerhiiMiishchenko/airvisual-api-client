package com.github.mishchuk7.airvisualapiclient.v1.model.location;

import com.github.mishchuk7.airvisualapiclient.v1.exception.AirVisualApiClientException;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GPSCoordinatesDto {

    private double latitude;
    private double longitude;

    public GPSCoordinatesDto(double latitude, double longitude) {
        if (latitude < -90 || latitude > 90) {
            throw new AirVisualApiClientException("Latitude must be a numerical value, within range [-90, 90]");
        }
        if (longitude < -180 || longitude > 180) {
            throw new AirVisualApiClientException("Longitude must be a numerical value, within range [-180, 180]");
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
