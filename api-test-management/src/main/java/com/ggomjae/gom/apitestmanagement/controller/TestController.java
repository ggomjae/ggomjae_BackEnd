package com.ggomjae.gom.apitestmanagement.controller;


import com.ggomjae.gom.apitestmanagement.dto.ResponseTestDto;
import com.ggomjae.gom.apitestmanagement.exception.UserNotExceptionResponse;
import com.ggomjae.gom.apitestmanagement.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    // type=throw -> exception
    @GetMapping
    public String throwTestMethod(@RequestParam String type){
        if(type.equals("throw")) {
            throw new UserNotExceptionResponse("TEST");
        }

        return "test";
    }

    // Controller Test
    @GetMapping("/book/{book_id}")
    public ResponseTestDto retrieveBook(@PathVariable Long book_id) {
        return testService.retrieveBook(book_id);
    }
}
