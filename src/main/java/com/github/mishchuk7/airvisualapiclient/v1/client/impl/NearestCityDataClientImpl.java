package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.NearestCityDataClient;
import com.github.mishchuk7.airvisualapiclient.v1.model.CityDataDto;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.DATA;
import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.KEY;

/**
 * {@inheritDoc}
 */
class NearestCityDataClientImpl implements NearestCityDataClient {

    @Override
    public CityDataDto retrieveCityData(String apiKey) {
        HttpResponse<JsonNode> response = UniRestUtil.get(UniRestUtil.NEAREST_CITY_FORMAT, KEY, apiKey);
        String json = response.getBody().getObject().get(DATA).toString();
        return UniRestUtil.readValueWrapper(json, new TypeReference<>() {
        });
    }

}
