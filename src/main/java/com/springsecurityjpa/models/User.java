package com.springsecurityjpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
@Id
private String id;

private String roles;

private boolean active;

private String password;

private String userName;
}
