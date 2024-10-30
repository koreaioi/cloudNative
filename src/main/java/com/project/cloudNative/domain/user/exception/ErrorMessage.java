package com.project.cloudNative.domain.user.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    USER_NOT_REGISTER(404, "유저를 생성할 수 없습니다.");

    private final int code;
    private final String message;
}
