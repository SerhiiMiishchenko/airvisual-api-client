package com.github.mishchuk7.airvisualapiclient.v1.client;

import com.github.mishchuk7.airvisualapiclient.v1.client.impl.AirVisualClientFactory;
import com.github.mishchuk7.airvisualapiclient.v1.model.country.StateDto;
import com.github.mishchuk7.airvisualapiclient.v1.model.search.StatesInCountrySearchDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.mishchuk7.airvisualapiclient.v1.TestUtil.API_KEY;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StatesInCountryClientTest {

    private final StatesInCountryClient statesInCountryClient = AirVisualClientFactory.statesInCountryClient();

    @Test
    public void shouldReturnStates() {
        StatesInCountrySearchDto statesInCountrySearchDto = new StatesInCountrySearchDto("Ukraine");
        List<StateDto> stateDtos = statesInCountryClient.retrieveStatesInCountry(API_KEY, statesInCountrySearchDto);

        assertTrue(stateDtos.size() > 0);
    }
}