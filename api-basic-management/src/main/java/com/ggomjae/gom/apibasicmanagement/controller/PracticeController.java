package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.practice.ListContainer;
import com.ggomjae.gom.apibasicmanagement.service.PostReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PracticeController {

    private final ListContainer listContainer;
    private final PostReplyService postReplyService;

    @GetMapping("/practice")
    public void displayListStep(){
        listContainer.displayListStep();
    }

    @PostMapping("/reply")
    public void saveReply(){
        postReplyService.saveReply();
    }
}
