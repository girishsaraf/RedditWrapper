package com.girish.redditwrapper.redditwrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.girish.redditwrapper.redditwrapper"})
public class RedditWrapperApplication {
    public static void main(String[] args) { SpringApplication.run(RedditWrapperApplication.class, args); }
}
