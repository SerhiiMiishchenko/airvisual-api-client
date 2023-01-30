package com.github.mishchuk7.airvisualapiclient.v1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.mishchuk7.airvisualapiclient.v1.exception.AirVisualApiClientException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UniRestUtilTest {

    @Test
    @DisplayName("Incorrect path throws exception")
    public void incorrectPathThrowsException() {
        assertThrows(AirVisualApiClientException.class,() -> UniRestUtil.get("bad path"));
    }

    @Test
    @DisplayName("Reading incorrect json throw exception")
    public void checkThrowExceptionWhenParsingIncorrectJson() {
        assertThrows(AirVisualApiClientException.class, () -> UniRestUtil.readValueWrapper("incorrect json", new TypeReference<>() {}));
    }
}