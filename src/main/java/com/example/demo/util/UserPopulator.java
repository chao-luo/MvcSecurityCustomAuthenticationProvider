package com.example.demo.util;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserRepository;
import com.example.demo.dto.UserDetail;

@Component
//@Profile("test")
public class UserPopulator implements CommandLineRunner {

	@Autowired UserRepository rep;
	@Override
	public void run(String... args) throws Exception {
		rep.save(new UserDetail("payal","payal", Arrays.asList("USER","ADMIN"),true));
		rep.save(new UserDetail("ruchi","ruchi", Arrays.asList("USER"),true));
	}

}
