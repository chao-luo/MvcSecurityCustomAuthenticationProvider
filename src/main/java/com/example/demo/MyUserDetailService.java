/*package com.example.demo;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.dto.UserDetail;
@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UserRepository rep;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetail user = rep.findById(username).get();
		System.out.println(user);
		if (user == null) {
			throw new RuntimeException("Invalid credentials! Username not correct.");
		}
		return new User(user.getUsername(), user.getPassword(),
				user.getAuthorites().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
	}

}
*/