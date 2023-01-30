package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.SpecifiedCityDataClient;
import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.CityDataSearchDto;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.*;

/**
 * {@inheritDoc}
 */
class SpecifiedCityDataClientImpl implements SpecifiedCityDataClient {

    @Override
    public CityDataDto retrieveSpecifiedCityData(String apiKey, CityDataSearchDto cityDataSearchDto) {
        String country = cityDataSearchDto.getCountry();
        String state = cityDataSearchDto.getState();
        String city = cityDataSearchDto.getCity();
        HttpResponse<JsonNode> response = UniRestUtil.get(UniRestUtil.CITY_FORMAT, KEY, apiKey, CITY, city, STATE, state, COUNTRY, country);
        String json = response.getBody().getObject().get(DATA).toString();
        return UniRestUtil.readValueWrapper(json, new TypeReference<>() {
        });
    }

}
