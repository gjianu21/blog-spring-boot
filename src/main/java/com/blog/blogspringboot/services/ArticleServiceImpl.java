package com.blog.blogspringboot.services;


import com.blog.blogspringboot.models.Articles;
import com.blog.blogspringboot.repositories.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticlesRepository articlesRepository;


    @Override
    public List<Articles> findByTitle(String title) {
        List<Articles> articlesList = articlesRepository.findByTitle(title);
        return articlesList;
    }

    @Override
    public List<Articles> findByAuthor(String author) {
        List<Articles> articlesList = articlesRepository.findByAuthor(author);
        return articlesList;
    }

    @Override
    public List<Articles> findByDestination(String destination) {
        List<Articles> articlesList = articlesRepository.findByDestination(destination);
        return articlesList;
    }

    @Override
    public Articles findOneById(Long id){
        return articlesRepository.getOne(id);
    }
}
