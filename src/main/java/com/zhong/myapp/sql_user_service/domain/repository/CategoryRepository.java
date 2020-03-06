package com.zhong.myapp.sql_user_service.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zhong.myapp.sql_user_service.domain.models.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

  List<Category> findByName(String name);

  List<Category> findByNameIgnoreCaseStartingWith(String name);

}
