package com.project.cloudNative.domain.user.entity;

import com.project.cloudNative.domain.user.dto.UserRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter

public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String username;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public static User of(String email, String password, String username) {
        return User.builder()
                .email(email)
                .password(password)
                .username(username)
                .createdAt(LocalDate.now())
                .updatedAt(LocalDate.now())
                .build();
    }

}
