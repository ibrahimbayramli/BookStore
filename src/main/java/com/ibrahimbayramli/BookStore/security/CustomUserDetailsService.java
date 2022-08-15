package com.ibrahimbayramli.BookStore.security;

import com.ibrahimbayramli.BookStore.model.User;
import com.ibrahimbayramli.BookStore.service.IUserService;
import com.ibrahimbayramli.BookStore.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user=userService.findByUserName(username)
                .orElseThrow(()-> new UsernameNotFoundException(username));

        Set<GrantedAuthority> authorities=Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

        return UserPrincipal.builder()
                .user(user).id(user.getId())
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
}
