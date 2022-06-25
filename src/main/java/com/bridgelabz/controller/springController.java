package com.bridgelabz.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/send/{name}")
    public String post(@PathVariable String name){
        return "Hello"+"  "   + name + "......!";
    }
    @PostMapping("/query")
    public String share(@RequestParam String name){
        return  "hello " +""+ name +"......!";
    }
}
