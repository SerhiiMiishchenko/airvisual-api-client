package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.NearestCityDataGPSClient;
import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.location.GPSCoordinatesDto;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.*;

/**
 * {@inheritDoc}
 */
class NearestCityDataGPSClientImpl implements NearestCityDataGPSClient {

    @Override
    public CityDataDto retrieveNearestCityDataGPS(String apiKey, GPSCoordinatesDto gpsCoordinatesDto) {
        String lat = String.valueOf(gpsCoordinatesDto.getLatitude());
        String lon = String.valueOf(gpsCoordinatesDto.getLongitude());
        HttpResponse<JsonNode> response = UniRestUtil.get(UniRestUtil.NEAREST_CITY_FORMAT, LATITUDE, lat, LONGITUDE, lon
                , KEY, apiKey);
        String json = response.getBody().getObject().get(DATA).toString();
        return UniRestUtil.readValueWrapper(json, new TypeReference<>() {
        });
    }
}
