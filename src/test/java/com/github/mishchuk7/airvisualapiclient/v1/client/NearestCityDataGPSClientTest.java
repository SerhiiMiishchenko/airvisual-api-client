package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.client.impl.AirVisualClientFactory;
import com.github.mishchuk7.airvisualapiclient.v1.exception.AirVisualApiClientException;
import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.location.GPSCoordinatesDto;
import org.junit.jupiter.api.Test;

import static com.github.mishchuk7.airvisualapiclient.v1.TestUtil.API_KEY;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NearestCityDataGPSClientTest {

    private final NearestCityDataGPSClient nearestCityDataGPSClient = AirVisualClientFactory.nearestCityDataGPSClient();

    @Test
    public void shouldReturnCityData() {
        GPSCoordinatesDto gpsCoordinatesDto = new GPSCoordinatesDto(30, 50);
        CityDataDto cityDataDto = nearestCityDataGPSClient.retrieveNearestCityDataGPS(API_KEY, gpsCoordinatesDto);

        assertNotNull(cityDataDto);
    }

    @Test
    public void shouldThrowsExceptionWhenWrongGPSCoordinates() {
        assertThrows(AirVisualApiClientException.class, () -> new GPSCoordinatesDto(91, 180));
    }
}