package com.github.mishchuk7.airvisualapiclient.v1.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.UniRestUtil;
import com.github.mishchuk7.airvisualapiclient.v1.client.StatesInCountryClient;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.StateDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.StatesInCountrySearchDto;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import java.util.List;

import static com.github.mishchuk7.airvisualapiclient.v1.constants.Constant.*;

/**
 * {@inheritDoc}
 */
class StatesInCountryClientImpl implements StatesInCountryClient {

    @Override
    public List<StateDto> retrieveStatesInCountry(String apiKey, StatesInCountrySearchDto statesInCountrySearchDto) {
        String country = statesInCountrySearchDto.getCountry();
        HttpResponse<JsonNode> response = UniRestUtil.get(UniRestUtil.STATES_FORMAT, KEY, apiKey, COUNTRY, country);
        String json = response.getBody().getObject().get(DATA).toString();
        return UniRestUtil.readValueWrapper(json, new TypeReference<>() {
        });
    }

}
