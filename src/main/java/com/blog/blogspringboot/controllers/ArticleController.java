package com.blog.blogspringboot.controllers;

import com.blog.blogspringboot.models.Articles;
import com.blog.blogspringboot.models.User;
import com.blog.blogspringboot.repositories.ArticlesRepository;
import com.blog.blogspringboot.repositories.UserRepository;
import com.blog.blogspringboot.services.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticlesRepository articlesRepository;

    @Autowired
    ArticleService articleService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/allArticlesByAuthor")
    public List<Articles> findAllArticlesByAuthor(String author){
        return articleService.findByAuthor(author);
    }

    @GetMapping("/allArticlesByTitle")
    public List<Articles> findAllArticlesByTitle(String title){
        return articleService.findByTitle(title);
    }

    @GetMapping("/allArticlesByDestination")
    public List<Articles> findAllArticlesByDestination(String destination){
        log.info("allArticlesByDestination was called");
        return articleService.findByDestination(destination);
    }

    @GetMapping("/allArticles")
    public List<Articles> findAllArticles(){
        log.info("findAllArticles was called");
        return articlesRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    @ResponseBody
    public Articles findArticleById(@PathVariable Long id){
        log.info("findArticleById was called: ", id);
        return articleService.findOneById(id);
    }

    @PostMapping("/saveArticle")
    public void createArticle(@RequestBody Articles article){
        log.info("an article was created");
        articlesRepository.saveAndFlush(article);
    }

}
