package com.zhong.myapp.sql_user_service.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhong.myapp.sql_user_service.domain.models.News;

public interface NewsRepository extends JpaRepository<News, String> {

}