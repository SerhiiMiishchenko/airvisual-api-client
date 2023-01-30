package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.TestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.impl.AirVisualClientFactory;
import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearestCityDataClientTest {

    private final NearestCityDataClient nearestCityDataClient = AirVisualClientFactory.nearestCityDataClient();

    @Test
    public void shouldReturnCityDataForNearestCity() {
        CityDataDto cityDataDto = nearestCityDataClient.retrieveCityData(TestUtil.API_KEY);

        assertNotNull(cityDataDto);
    }
}