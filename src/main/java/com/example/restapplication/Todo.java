package com.example.restapplication;

import org.springframework.data.annotation.Id;

public class Todo{
    @Id private String id;

    private String title;
    private String body;

    public Todo(String title, String body){
        this.title = title;
        this.body = body;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBody(){
        return this.body;
    }
}