package com.zhong.myapp.sql_user_service.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.zhong.myapp.sql_user_service.domain.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
