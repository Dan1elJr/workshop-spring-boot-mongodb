package com.danieljunior.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieljunior.workshopmongo.domain.User;
import com.danieljunior.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
