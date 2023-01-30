package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.location.GPSCoordinatesDto;

/**
 * Return nearest city's {@link CityDataDto}, using a specified set of GPS coordinates.
 *
 * @author Serhii Mishchenko
 * @since 0.0.1
 */

public interface NearestCityDataGPSClient {

    /**
     * @param apiKey            - AirVisual API key.
     * @param gpsCoordinatesDto - {@link GPSCoordinatesDto} object for storing GPS coordinates.
     * @return - {@link CityDataDto} object.
     */
    CityDataDto retrieveNearestCityDataGPS(String apiKey, GPSCoordinatesDto gpsCoordinatesDto);
}
