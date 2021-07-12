package com.blog.blogspringboot.repositories;

import com.blog.blogspringboot.models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Long> {

    List<Articles> findByTitle(String title);
    List<Articles> findByAuthor(String author);
    List<Articles> findByDestination(String destination);
    Articles getOne(Long id);

}
