package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.practice.ListContainer;
import com.ggomjae.gom.apibasicmanagement.service.PersonService;
import com.ggomjae.gom.apibasicmanagement.service.PostReplyService;
import com.ggomjae.gom.modulequerydsldb.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PracticeController {

    private final ListContainer listContainer;
    private final PostReplyService postReplyService;
    private final PersonService personService;

    @GetMapping("/practice")
    public void displayListStep(){
        listContainer.displayListStep();
    }

    @PostMapping("/reply")
    public void saveReply(){
        postReplyService.saveReply();
    }

    // 미완
    @PostMapping("/person")
    public void savePerson(){
        personService.savePerson();
    }

    @GetMapping("/person")
    public List<Person> retrieveAllPerson(){
        return personService.retrieveAllPerson();
    }
}
