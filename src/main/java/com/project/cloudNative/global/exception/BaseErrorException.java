package com.project.cloudNative.global.exception;

import lombok.Getter;

@Getter
public class BaseErrorException extends RuntimeException {

    private final int ErrorCode;

    public BaseErrorException(int errorCode, String message) {
        super(message);
        ErrorCode = errorCode;
    }
}
