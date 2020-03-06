package com.zhong.myapp.sql_user_service.domain.models;

import javax.persistence.Embeddable;
import lombok.Data;

/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
@Embeddable
public class Tag {

  String value;

}
