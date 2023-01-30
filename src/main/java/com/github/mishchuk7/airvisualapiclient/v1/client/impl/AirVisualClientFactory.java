package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.github.mishchuk7.airvisualapiclient.v1.client.*;

/**
 * Factory for creating instances of {@link StatesInCountryClient}, {@link SpecifiedCityDataClient}, {@link NearestCityDataGPSClient},
 * {@link NearestCityDataClient}, {@link CountryClient} and {@link CitiesInStateClient}
 */
public final class AirVisualClientFactory {

    private AirVisualClientFactory() {
    }

    /**
     * Creates an instance of {@link StatesInCountryClient}
     *
     * @return the new instance
     */
    public static StatesInCountryClient statesInCountryClient() {
        return new StatesInCountryClientImpl();
    }

    /**
     * Creates an instance of {@link SpecifiedCityDataClient}
     *
     * @return the new instance
     */
    public static SpecifiedCityDataClient specifiedCityDataClient() {
        return new SpecifiedCityDataClientImpl();
    }

    /**
     * Creates an instance of {@link NearestCityDataGPSClient}
     *
     * @return the new instance
     */
    public static NearestCityDataGPSClient nearestCityDataGPSClient() {
        return new NearestCityDataGPSClientImpl();
    }

    /**
     * Creates an instance of {@link NearestCityDataClient}
     *
     * @return the new instance
     */
    public static NearestCityDataClient nearestCityDataClient() {
        return new NearestCityDataClientImpl();
    }

    /**
     * Creates an instance of {@link CountryClient}
     *
     * @return the new instance
     */
    public static CountryClient countryClient() {
        return new CountryClientImpl();
    }

    /**
     * Creates an instance of {@link CitiesInStateClient}
     *
     * @return the new instance
     */
    public static CitiesInStateClient citiesInStateClient() {
        return new CitiesInStateClientImpl();
    }

}
