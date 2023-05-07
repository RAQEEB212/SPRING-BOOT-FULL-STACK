package com.SIBA.demo.dao;


import com.SIBA.demo.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}



