package com.github.mishchuk7.airvisualapiclient.v1.model.country;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Data transfer object for state
 *
 * @author Serhii Mishchenko
 */

@Data
public class StateDto {

    @JsonProperty("state")
    private String name;
}
