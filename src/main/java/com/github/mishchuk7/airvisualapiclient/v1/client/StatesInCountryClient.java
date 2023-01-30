package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.model.country.StateDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.StatesInCountrySearchDto;

import java.util.List;

/**
 * Return an array of all supported states(states with no active stations will not be returned) , inside a specified country.
 * Each state object contains its English name state (requested by other endpoints)
 *
 * @author Serhii Mishchenko
 * @since 0.0.1
 */

public interface StatesInCountryClient {

    /**
     * Retrieve the collection of {@link StateDto} in the specified country.
     *
     * @param apiKey                   - AirVisual API key
     * @param statesInCountrySearchDto - {@link StatesInCountrySearchDto} object for search a states
     * @return the collection of {@link StateDto}
     */

    List<StateDto> retrieveStatesInCountry(String apiKey, StatesInCountrySearchDto statesInCountrySearchDto);

}
