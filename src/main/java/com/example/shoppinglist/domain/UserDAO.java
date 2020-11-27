package com.example.shoppinglist.domain;

import java.util.List;

public interface UserDAO {

	public List<User> findByUsername(String username);
}
