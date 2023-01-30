package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;

/**
 * Return nearest city's {@link CityDataDto}, using IP address geolocation.
 *
 * @author Serhii Mishchenko
 * @since 0.0.1
 */

public interface NearestCityDataClient {

    /**
     * Retrieve {@link CityDataDto} object using IP address geolocation.
     *
     * @param apiKey - AirVisual API key.
     * @return - {@link CityDataDto} object.
     */
    CityDataDto retrieveCityData(String apiKey);
}
