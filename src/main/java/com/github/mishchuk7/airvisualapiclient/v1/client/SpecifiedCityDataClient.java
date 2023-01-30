package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.CityDataSearchDto;

/**
 * Return specified city's {@link CityDataDto} object.
 *
 * @author Serhii Mishchenko
 * @since 0.0.1
 */
public interface SpecifiedCityDataClient {

    /**
     * Retrieve {@link CityDataDto} object for the specified city.
     *
     * @param apiKey            - AirVisual API key.
     * @param cityDataSearchDto - {@link CityDataSearchDto} object for retrieving specified city's data.
     * @return - {@link CityDataDto} object.
     */
    CityDataDto retrieveSpecifiedCityData(String apiKey, CityDataSearchDto cityDataSearchDto);
}
