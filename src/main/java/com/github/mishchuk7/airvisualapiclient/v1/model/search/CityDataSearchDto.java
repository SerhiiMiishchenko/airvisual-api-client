package com.github.mishchuk7.airvisualapiclient.v1.model.search;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class CityDataSearchDto {

    @NonNull
    private String country;
    @NonNull
    private String state;
    @NonNull
    private String city;

}
