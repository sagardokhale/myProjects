package com.oauth.OAuth;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.oauth.OAuth.domain.CustomUserDetails;
import com.oauth.OAuth.domain.Role;
import com.oauth.OAuth.domain.User;
import com.oauth.OAuth.repository.UserRepository;

@SpringBootApplication
public class OAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
	}
	
	@Autowired
    public void authenticationManager(AuthenticationManagerBuilder builder,UserRepository repo) throws Exception {
	    if(repo.count()==0) {
	    	repo.save(new User("user","user",Arrays.asList(new Role("USER"),new Role("ACTUATOR"))));
	    }
		
		builder.userDetailsService(new UserDetailsService() {
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				return new CustomUserDetails( repo.findByUsername(username ));
			}
		});
    }
}
