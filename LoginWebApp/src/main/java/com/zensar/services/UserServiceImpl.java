package com.zensar.services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		if((user.getUserName()).equals("ck") && (user.getPassword()).equals("abc")) {
			System.out.println("valid user");
			return true;
		}
		
		else {
			System.out.println("Invalid User");
			return false;
		}
		 
	}
}
