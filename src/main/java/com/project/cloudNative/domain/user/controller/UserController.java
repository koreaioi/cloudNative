package com.project.cloudNative.domain.user.controller;

import com.project.cloudNative.domain.user.dto.UserRequestDto;
import com.project.cloudNative.domain.user.dto.UserResponseDto;
import com.project.cloudNative.domain.user.entity.User;
import com.project.cloudNative.domain.user.service.UserService;
import com.project.cloudNative.global.exception.Response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String Hello(){
        return "Hello World";
    }

    @PostMapping
    public ApiResponse<UserResponseDto> register(@RequestBody UserRequestDto userDto ){

        UserResponseDto response = userService.save(userDto);

        return ApiResponse.success(200, "Success fully registered", response);
    }

}
