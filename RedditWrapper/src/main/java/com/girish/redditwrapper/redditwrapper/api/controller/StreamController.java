package com.girish.redditwrapper.redditwrapper.api.controller;

import com.girish.redditwrapper.redditwrapper.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamController {

    private final StreamService streamService;

    @Autowired
    public StreamController(StreamService streamService){
        this.streamService = streamService;
    }
    @GetMapping("/stream/health")
    String runStream(){
        return this.streamService.getHealth();
    }
}
