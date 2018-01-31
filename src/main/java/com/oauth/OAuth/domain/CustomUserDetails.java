package com.oauth.OAuth.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

	private String username;
	
	private String password;
	
	Collection<? extends GrantedAuthority> authorities;
	
	public CustomUserDetails(User byUserName) {
		this.username=byUserName.getUsername();
		this.password=byUserName.getPassword();
		
		List<GrantedAuthority> auths=new ArrayList<>();
		for(Role role:byUserName.getRoles()) {
			auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
			
		}
		this.authorities=auths;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
