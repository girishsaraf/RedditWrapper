package com.girish.redditwrapper.redditwrapper.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamController {
    @GetMapping("/testStream")
    String testStream(){
        return "Stream Running";
    }
}
