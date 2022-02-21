package com.dailycodebuffer.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @RequestMapping(value = "/",method = RequestMethod.GET)// This is very long
    @GetMapping("/")
    public String helloworld(){
        return "Welcome to Daily code buffer!! Added";
    }

}
