package com.ibrahimbayramli.BookStore.service;

import com.ibrahimbayramli.BookStore.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;


}
