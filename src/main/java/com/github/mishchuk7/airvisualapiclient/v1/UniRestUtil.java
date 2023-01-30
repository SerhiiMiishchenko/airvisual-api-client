package com.github.mishchuk7.airvisualapiclient.v1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.mishchuk7.airvisualapiclient.v1.exception.AirVisualApiClientException;
import com.github.mishchuk7.airvisualapiclient.v1.model.StatusResponseDto;
import kong.unirest.*;

import java.util.List;

/**
 * Unit with static methods for using Unirest library.
 *
 * @author Serhii Mishchenko
 * @since 0.1
 */

public final class UniRestUtil {

    private static final String HOST = "http://api.airvisual.com/v2";

    public static final String COUNTRIES_FORMAT = "/countries";
    public static final String STATES_FORMAT = "/states";
    public static final String CITIES_FORMAT = "/cities";
    public static final String NEAREST_CITY_FORMAT = "/nearest_city";
    public static final String CITY_FORMAT = "/city";
    public static final String STATUS_KEY = "status";

    private static final ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();


    /**
     * @param path   - a path to the required resource
     * @param params - optional query string parameters
     * @return {@link HttpResponse} from server in the {@link JsonNode} view
     */
    public static HttpResponse<JsonNode> get(String path, String... params) {
        HttpResponse<JsonNode> response;
        try {
            response = getResponseWithQueryString(HOST + path, params);
            if (response.getStatus() != HttpStatus.OK) {
                throw new AirVisualApiClientException(String.format("There are validation errors. statusCode = %s", response.getStatus()),
                        readValueWrapper(response.getBody().getObject().get(STATUS_KEY).toString(), new TypeReference<List<StatusResponseDto>>() {
                        }));
            }
        } catch (UnirestException e) {
            throw new AirVisualApiClientException(String.format("Request failed, path=%s", HOST + path), e);
        }
        return response;
    }

    /**
     * @param content      - value for the reading
     * @param valueTypeRef - the value of type to which the value should be cast
     * @param <T>          - the type to which the value should be cast
     * @return value of type T
     */
    public static <T> T readValueWrapper(String content, TypeReference<T> valueTypeRef) {
        try {
            return objectMapper.readValue(content, valueTypeRef);
        } catch (JsonProcessingException e) {
            throw new AirVisualApiClientException("Object Mapping failure", e);
        }
    }

    private static HttpResponse<JsonNode> getResponseWithQueryString(String path, String... params) {
        GetRequest request = Unirest.get(path);
        for (int i = 0; i < params.length - 1; i += 2) {
            request.queryString(params[i], params[i + 1]);
        }
        return request.asJson();
    }

}
