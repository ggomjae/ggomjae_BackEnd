package com.ggomjae.gom.apibasicmanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @PostMapping("/home")
    public String homeMethod(){
        return "ggomjae";
    }
}
