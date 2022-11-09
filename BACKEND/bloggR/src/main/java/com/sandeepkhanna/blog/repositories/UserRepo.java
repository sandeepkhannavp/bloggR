package com.sandeepkhanna.blog.repositories;

import java.util.Optional;

import com.sandeepkhanna.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>
{
	Optional<User> findByEmail(String email);
}
