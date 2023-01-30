package com.github.mishchuk7.airvisualapiclient.v1.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Data transfer object for country
 *
 * @author Serhii Mishchenko
 */

@Data
public class CountryDto {

    @JsonProperty("country")
    private String name;
}
