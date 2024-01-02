package ru.aurorahost.OpenAPIDemo.exceptions;

public enum ErrorCode {
    // Internal Errors: 1 to 0999
    GENERIC_ERROR("APP-0001", "The system is unable to complete the request. Contact system support."),

    HTTP_MEDIA_TYPE_NOT_SUPPORTED("APP-0002", "Requested media type is not supported. Please use application/json or application/xml as 'Content-Type' header value"),

    HTTP_MESSAGE_NOT_WRITABLE("APP-0003", "Missing 'Accept' header. Please add 'Accept' header."),

    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("APP-0004", "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' value"),

    JSON_PARSE_ERROR("APP-0005", "Make sure request payload should be a valid JSON object."),

    HTTP_MESSAGE_NOT_READABLE("APP-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'.");

    private String errorCode;
    private String errorMessageKey;

    ErrorCode(final String errorCode, final String errorMessageKey) {
        this.errorCode = errorCode;
        this.errorMessageKey = errorMessageKey;
    }

    /**
     * @return the errCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @return the errMsgKey
     */
    public String getErrorMessageKey() {
        return errorMessageKey;
    }

}
