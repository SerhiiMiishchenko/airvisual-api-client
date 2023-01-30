package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.client.impl.AirVisualClientFactory;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.CityDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.CitiesInStateSearchDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.mishchuk7.airvisualapiclient.v1.TestUtil.*;

class CitiesInStateClientTest {

    CitiesInStateClient citiesInStateClient = AirVisualClientFactory.citiesInStateClient();

    @Test
    public void shouldReturnCities() {
        CitiesInStateSearchDto citiesInStateSearchDto = CitiesInStateSearchDto.builder()
                .country(COUNTRY)
                .state(STATE)
                .build();
        List<CityDto> cityDtos = citiesInStateClient.retrieveCities(API_KEY, citiesInStateSearchDto);

        assertFalse(cityDtos.isEmpty());
    }
}