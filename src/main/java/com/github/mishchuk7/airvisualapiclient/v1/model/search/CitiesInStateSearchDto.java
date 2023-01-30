package com.github.mishchuk7.airvisualapiclient.v1.model.search;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class CitiesInStateSearchDto {

    @NonNull
    private String country;
    @NonNull
    private String state;
}
