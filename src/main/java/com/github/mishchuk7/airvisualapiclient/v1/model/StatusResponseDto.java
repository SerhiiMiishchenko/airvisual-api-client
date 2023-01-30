package com.github.mishchuk7.airvisualapiclient.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StatusResponseDto {

    @JsonProperty("status")
    private String statusDescription;
}
