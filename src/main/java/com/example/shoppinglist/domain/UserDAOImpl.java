package com.example.shoppinglist.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private JdbcTemplate jdbcT;

	public JdbcTemplate getJdbcT() {
		return jdbcT;
	}

	public void setJdbcT(JdbcTemplate jdbcT) {
		this.jdbcT = jdbcT;
	}

	public List<User> findByUsername(String username) {
		String sql = "SELECT * FROM dbo.users_table WHERE username = ?";
		Object[] parameters = new Object[] { username };
		RowMapper<User> mapper = new UserRowMapper();
		List<User> user = jdbcT.query(sql, parameters, mapper);

		return user;
	}
}
