package com.sau.bookcigi.repository;

import com.sau.bookcigi.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
