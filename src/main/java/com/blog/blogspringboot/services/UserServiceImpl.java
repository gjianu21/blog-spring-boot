package com.blog.blogspringboot.services;

import com.blog.blogspringboot.models.User;
import com.blog.blogspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;



    public String checkUserForLogIn(String userEmail) throws Exception {
        User userFromDataBase = userRepository.findUserByEmail(userEmail);
        if (userEmail.toLowerCase().equals(userFromDataBase.getEmail().toLowerCase())         ){
            return "user can logIn";
        }else{
            throw new Exception("user cannot login");
        }
    }
}
