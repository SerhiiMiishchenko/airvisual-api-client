package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.exception.AirVisualApiClientException;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.CountryDto;

import java.util.List;

/**
 * Return an array of all supported countries*.
 * countries with no active stations will not be returned
 * Each country object contains its English name country (requested by other endpoints)
 *
 * @author Serhii Mishchenko
 * @since 0.0.1
 */
public interface CountryClient {

    /**
     * Return the collection of countries
     *
     * @param apiKey - AirVisual token
     * @return the collection of {@link CountryDto} objects
     */
    List<CountryDto> retrieveCountries(String apiKey) throws AirVisualApiClientException;
}
