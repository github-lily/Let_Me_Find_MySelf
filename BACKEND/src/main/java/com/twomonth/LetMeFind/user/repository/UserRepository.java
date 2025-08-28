package com.twomonth.LetMeFind.user.repository;

import com.twomonth.LetMeFind.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {}

