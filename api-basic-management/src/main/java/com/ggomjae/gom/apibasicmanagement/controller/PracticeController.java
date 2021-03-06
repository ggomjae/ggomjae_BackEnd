package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.practice.ListContainer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PracticeController {

    private final ListContainer listContainer;

    @GetMapping("/practice")
    public void displayListStep(){
        listContainer.displayListStep();
    }
}
