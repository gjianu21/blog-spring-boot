package com.blog.blogspringboot.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ARTICLES_TABLE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, length = 4000)
    private String title;

    @Column(nullable = false, length = 4000)
    private String tag;

    @Column(nullable = false, length = 4000)
    private String author;

    @Column
    private String dateTime;

    @Column(nullable = false, length = 4000)
    private String imgUrl;

    @Column(length = 4000)
    private String content;

    @Column(nullable = false, length = 4000)
    private String summary;

    @Column
    private String destination;

}
