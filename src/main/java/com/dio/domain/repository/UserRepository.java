package com.dio.domain.repository;

import com.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByGameAccountUsername(String username);
}
