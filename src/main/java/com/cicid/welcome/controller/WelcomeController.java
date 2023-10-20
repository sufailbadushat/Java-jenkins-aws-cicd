package com.cicid.welcome.controller;

import com.cicid.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/msg")
    public String welcomeMsg(){
        return welcomeService.sendMsg();
    }
}
