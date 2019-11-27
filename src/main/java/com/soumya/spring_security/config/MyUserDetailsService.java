package com.soumya.spring_security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.soumya.spring_security.model.User;
import com.soumya.spring_security.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user = userRepository.findByUsername(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
		
		System.out.println("Username:"  + user.get().getUsername() + ", Password: " + user.get().getPassword());
		
		return user.map(MyUserDetials::new).get();
	}

}