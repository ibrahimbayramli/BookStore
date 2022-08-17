package com.ibrahimbayramli.BookStore.security.jwt;

import com.ibrahimbayramli.BookStore.security.UserPrincipal;

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);
}
