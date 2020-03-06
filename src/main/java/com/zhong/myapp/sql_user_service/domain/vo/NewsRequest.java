package com.zhong.myapp.sql_user_service.domain.vo;

import java.util.Set;

import com.zhong.myapp.sql_user_service.domain.models.Category;
import com.zhong.myapp.sql_user_service.domain.models.Tag;

import lombok.Data;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Data
public class NewsRequest {

  String title;

  String content;

  Set<Category> categories;

  Set<Tag> tags;

}
