package com.despereaux.jpaadvance.repository;

import com.despereaux.jpaadvance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
