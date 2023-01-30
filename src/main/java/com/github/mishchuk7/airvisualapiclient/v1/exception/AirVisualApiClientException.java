package com.github.mishchuk7.airvisualapiclient.v1.exception;

import com.github.mishchuk7.airvisualapiclient.v1.model.StatusResponseDto;

import java.util.List;

/**
 * A {@link RuntimeException} that is thrown in case of an airVisual monitoring failures.
 *
 * @author Serhii Mishchenko
 * @since 0.1
 */

public class AirVisualApiClientException extends RuntimeException {

    private List<StatusResponseDto> returnCodes;

    public AirVisualApiClientException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@link AirVisualApiClientException} with the specified detail message and cause.
     * Note that the detail message associated with cause is not automatically incorporated in this {@link
     * AirVisualApiClientException}'s detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
     * @param cause   the cause (which is saved for later retrieval by the Throwable.getCause() method).
     *                (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */

    public AirVisualApiClientException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new {@link AirVisualApiClientException} with specified collection of the
     * {@link StatusResponseDto} objects.
     *
     * @param message     the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
     * @param returnCodes the collection of the {@link StatusResponseDto} which contain return codes {@linkplain
     *                    <a href="https://api-docs.iqair.com/?version=latest#:~:text=in%20%C2%B5g/m3.-,Return%20codes,%3A%20returned%20when%20more%20than%2010%20calls%20per%20second%20are%20made.,-Detailed%20response%20example">...</a>} from AirVisual API.
     */

    public AirVisualApiClientException(String message, List<StatusResponseDto> returnCodes) {
        super(message);
        this.returnCodes = returnCodes;
    }
}
