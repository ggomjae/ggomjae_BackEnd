package com.ggomjae.gom.apitestmanagement.controller;


import com.ggomjae.gom.apitestmanagement.exception.UserNotExceptionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String throwTestMethod(@RequestParam String type){
        if(type.equals("throw")) {
            throw new UserNotExceptionResponse("TEST");
        }

        return "test";
    }
}
