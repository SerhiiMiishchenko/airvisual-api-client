package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.CountryClient;
import com.github.mishchuk7.airvisualapiclient.v1.exception.AirVisualApiClientException;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.CountryDto;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import java.util.List;

import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.KEY;

/**
 * {@inheritDoc}
 */
class CountryClientImpl implements CountryClient {

    @Override
    public List<CountryDto> retrieveCountries(String apiKey) throws AirVisualApiClientException {
        HttpResponse<JsonNode> response = UniRestUtil.get(UniRestUtil.COUNTRIES_FORMAT, KEY, apiKey);
        String json = response.getBody().getObject().get("data").toString();
        return UniRestUtil.readValueWrapper(json, new TypeReference<>() {
        });
    }
}
