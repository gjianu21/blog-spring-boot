package com.blog.blogspringboot.services;

import com.blog.blogspringboot.models.User;
import com.blog.blogspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {

    String checkUserForLogIn(String userEmail) throws Exception;
}
