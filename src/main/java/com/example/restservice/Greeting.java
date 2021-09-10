package com.example.restservice;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(String content, Long id) {
        this.id=id;
        this.content = content;
    }

    public Long getId(){
        return id;
    }

    public String getContent() {
        return content;
    }

}
