package com.girish.redditwrapper.redditwrapper.service;

import org.springframework.stereotype.Service;

@Service
public class StreamService {

    public String getHealth(){
        return "Streaming Service working";
    }
}
