package com.project.cloudNative.domain.user.dto;

public record UserRequestDto(

     String email,
     String password,
     String username

) {
}
