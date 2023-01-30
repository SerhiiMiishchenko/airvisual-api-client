package com.github.mishchuk7.airvisualapiclient.v1.model.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class StatesInCountrySearchDto {

    @NonNull
    private String country;
}
