package com.project.cloudNative.domain.user.service;

import com.project.cloudNative.domain.user.dto.UserRequestDto;
import com.project.cloudNative.domain.user.dto.UserResponseDto;
import com.project.cloudNative.domain.user.entity.User;
import com.project.cloudNative.domain.user.exception.ErrorMessage;
import com.project.cloudNative.domain.user.exception.UserNotRegisterException;
import com.project.cloudNative.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.project.cloudNative.domain.user.exception.ErrorMessage.USER_NOT_REGISTER;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserResponseDto save(UserRequestDto userDto) {

        String encodePW = bCryptPasswordEncoder.encode(userDto.password());
        try {
            User savedUser = userRepository.save(User.of(userDto.email(), encodePW, userDto.username()));
            return new UserResponseDto(savedUser.getId());

        } catch (UserNotRegisterException e) {
            throw new UserNotRegisterException(USER_NOT_REGISTER.getCode(), USER_NOT_REGISTER.getMessage());
        }

    }
}
