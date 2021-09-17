package com.ciara.demo.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "site")
public class Site {

    private String title;
    private String author;

    @Override
    public String toString() {
        return "Site{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void setTitle(String val) {
        this.title = val;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String val) {
        this.author = val;
    }

    public String getAuthor() {
        return this.author;
    }
}
