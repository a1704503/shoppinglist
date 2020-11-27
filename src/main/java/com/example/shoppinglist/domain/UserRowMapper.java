package com.example.shoppinglist.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getLong("id"));
		user.setPasswordHash(rs.getString("passwordHash"));
		user.setRole(rs.getString("role"));
		user.setUsername(rs.getString("username"));
		return user;
	}

}
