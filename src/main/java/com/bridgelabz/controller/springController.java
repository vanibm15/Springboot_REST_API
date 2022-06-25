package com.bridgelabz.controller;

import com.bridgelabz.entity.UserModel;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("shared")
    public String shared(@RequestBody UserModel user){
       return "hello"+  "" +user.getFirstName()+""+ user.getLastName();
    }
}
