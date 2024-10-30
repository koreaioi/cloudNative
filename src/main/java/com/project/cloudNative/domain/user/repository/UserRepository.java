package com.project.cloudNative.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.cloudNative.domain.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
