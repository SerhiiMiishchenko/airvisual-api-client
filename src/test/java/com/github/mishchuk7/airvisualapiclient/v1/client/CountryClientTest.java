package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.TestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.impl.AirVisualClientFactory;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.CountryDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountryClientTest {

    CountryClient countryClient = AirVisualClientFactory.countryClient();

    @Test
    public void shouldReturnCountries() {
        List<CountryDto> countryDtos = countryClient.retrieveCountries(TestUtil.API_KEY);

        assertFalse(countryDtos.isEmpty());
    }
}