package com.ibrahimbayramli.BookStore.security.jwt;

import com.ibrahimbayramli.BookStore.security.UserPrincipal;
import com.sha.springbootbooksellermaven.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider
{
    String generateToken(UserPrincipal auth);

    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
Footer

