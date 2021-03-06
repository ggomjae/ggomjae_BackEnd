package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.dto.TimeDto;
import com.ggomjae.gom.apibasicmanagement.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TimeController {

    private final TimeService timeService;

    @PostMapping("/time")
    public void saveTime(@RequestBody TimeDto time){
        timeService.saveTime(time);
    }

    @GetMapping("/time")
    public void displayTime(){
        timeService.displayTime();
    }

}
