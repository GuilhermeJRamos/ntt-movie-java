package com.guilhermeramos.nttmoviejava.application.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
