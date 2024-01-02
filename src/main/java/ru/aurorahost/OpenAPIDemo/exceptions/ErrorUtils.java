package ru.aurorahost.OpenAPIDemo.exceptions;

public class ErrorUtils {
    private ErrorUtils() {
    }

    public static Error createError(final String errorMessageKey, final String errorCode,
                                    final Integer httpStatusCode) {
        Error error = new Error();
        error.setMessage(errorMessageKey);
        error.setErrorCode(errorCode);
        error.setStatus(httpStatusCode);
        return error;
    }
}
