package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.CitiesInStateClient;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.CityDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.CitiesInStateSearchDto;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import java.util.List;

import static com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil.CITIES_FORMAT;
import static com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil.readValueWrapper;
import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.*;

/**
 * {@inheritDoc}
 */
class CitiesInStateClientImpl implements CitiesInStateClient {

    @Override
    public List<CityDto> retrieveCities(String apiKey, CitiesInStateSearchDto citiesInStateSearchDto) {
        String state = citiesInStateSearchDto.getState();
        String country = citiesInStateSearchDto.getCountry();
        HttpResponse<JsonNode> response = UniRestUtil.get(CITIES_FORMAT, KEY, apiKey, COUNTRY, country, STATE, state);
        String json = response.getBody().getObject().get(DATA).toString();
        return readValueWrapper(json, new TypeReference<>() {
        });
    }

}
