package com.blog.blogspringboot.services;

import com.blog.blogspringboot.models.Articles;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {

    List<Articles> findByTitle(String title);
    List<Articles> findByAuthor(String author);
    List<Articles> findByDestination(String destination);
    Articles findOneById(Long id);
}
