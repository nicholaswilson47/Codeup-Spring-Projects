package com.codeup.SpringBlog.models;

import javax.persistence.*;

@Entity
@Table(name ="posts" )
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", length = 3000, nullable = false)
    private String body;


}
