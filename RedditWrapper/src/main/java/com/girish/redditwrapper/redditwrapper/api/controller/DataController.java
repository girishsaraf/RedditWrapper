package com.girish.redditwrapper.redditwrapper.api.controller;

import com.girish.redditwrapper.redditwrapper.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService){
        this.dataService = dataService;
    }
    @GetMapping("/data/health")
    String getData(){
        return this.dataService.getHealth();
    }
}
