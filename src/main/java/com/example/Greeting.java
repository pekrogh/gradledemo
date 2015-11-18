package com.example;

/**
 * Created by pek on 07/10/2015.
 */
public class Greeting {

    private final long id;
    private final String content;
    private static final String template = "Hello, %s!";

    public Greeting(long id, String content) {
        this.id = id;

        if (content.equalsIgnoreCase("krogh")) {
            this.content = "gamle dreng";
        } else {
            this.content = content;
        }
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return String.format(template, this.content);
    }
}
