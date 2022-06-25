package com.bridgelabz.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class springController {

    @RequestMapping(value = ("/hello"),method = RequestMethod.GET)
    public String hello(){

        return "Hello everyone from bridgelabz....!";
    }

    @GetMapping("/world")
    public String world(){
        return "helloo world.........!";
    }

}
