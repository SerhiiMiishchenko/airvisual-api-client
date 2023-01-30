package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.model.country.CityDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.CitiesInStateSearchDto;

import java.util.List;

/**
 * Get a list of cities from specified state.
 *
 * @author Serhii Mishchenko
 * @since 0.0.1
 */

public interface CitiesInStateClient {

    /**
     * Get a list of cities from specified state.
     *
     * @param apiKey        - AirVisual API key
     * @param citySearchDto - object for search
     * @return {@link List}{@link CityDto}
     */
    List<CityDto> retrieveCities(String apiKey, CitiesInStateSearchDto citySearchDto);

}
