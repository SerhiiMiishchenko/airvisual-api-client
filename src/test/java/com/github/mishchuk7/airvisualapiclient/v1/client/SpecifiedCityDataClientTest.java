package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.client.impl.AirVisualClientFactory;
import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.CityDataSearchDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.mishchuk7.airvisualapiclient.v1.TestUtil.*;

class SpecifiedCityDataClientTest {

    private final SpecifiedCityDataClient specifiedCityDataClient = AirVisualClientFactory.specifiedCityDataClient();

    @Test
    @DisplayName("Should return cities data object for specified city")
    public void shouldReturnCityData() {
        CityDataSearchDto cityDataSearchDto = CityDataSearchDto.builder()
                .country(COUNTRY)
                .state(STATE)
                .city(CITY)
                .build();
        CityDataDto cityDataDto = specifiedCityDataClient.retrieveSpecifiedCityData(API_KEY, cityDataSearchDto);

        assertNotNull(cityDataDto);
    }
}