package com.project.cloudNative.domain.user.exception;

import com.project.cloudNative.global.exception.BaseErrorException;

public class UserNotRegisterException extends BaseErrorException {
    public UserNotRegisterException(int errorCode, String message) {
        super(errorCode, message);
    }

}
