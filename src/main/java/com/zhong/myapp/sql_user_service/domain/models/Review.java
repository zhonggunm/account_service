package com.zhong.myapp.sql_user_service.domain.models;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author claudioed on 29/10/17. Project cms
 */
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Embeddable
public class Review {

  public Review() {
		super();
	}

public Review(String userId, String status) {
		super();
		this.userId = userId;
		this.status = status;
	}

String userId;

  String status;

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

}
