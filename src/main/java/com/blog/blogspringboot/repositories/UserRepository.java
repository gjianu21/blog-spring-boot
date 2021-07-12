package com.blog.blogspringboot.repositories;

import com.blog.blogspringboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
    User findUserByEmail(String email);
    User findUserByUserName(String email);

}
