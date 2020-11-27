package com.example.shoppinglist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.shoppinglist.domain.User;
import com.example.shoppinglist.domain.UserDAO;

/**
 * This class is used by spring security to authenticate and authorize user
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<User> listOfUser = userDAO.findByUsername(username);
		User curruser = listOfUser.get(0);
		UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getPasswordHash(),
				AuthorityUtils.createAuthorityList(curruser.getRole()));
		return user;
	}
}