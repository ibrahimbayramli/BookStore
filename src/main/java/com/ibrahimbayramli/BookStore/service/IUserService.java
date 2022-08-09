package com.ibrahimbayramli.BookStore.service;

import com.ibrahimbayramli.BookStore.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUserName(String username);

    @Transactional
    void makeAdmin(String username);
}
