package org.demo.springbootThymeleaf.repository;

import org.demo.springbootThymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByName(String username);
}
