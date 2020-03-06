package com.zhong.myapp.sql_user_service.domain.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
@Entity
@Table(name = "system_user")
public class User {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  String id;

  String identity;

  String name;

  Role role;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getIdentity() {
	return identity;
}

public void setIdentity(String identity) {
	this.identity = identity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

}
