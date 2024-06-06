package com.api.ToDo.service;

import com.api.ToDo.domain.user.UserAuthenticated;
import com.api.ToDo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByEmail(username).map(UserAuthenticated::new).orElseThrow(()-> new UsernameNotFoundException("user not found"));

    }
}
