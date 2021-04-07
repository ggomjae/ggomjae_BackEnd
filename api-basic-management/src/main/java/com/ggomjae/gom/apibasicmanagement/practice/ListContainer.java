package com.ggomjae.gom.apibasicmanagement.practice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class ListContainer {

    private final ListProcessor1 listProcessor1;
    private final ListProcessor2 listProcessor2;

    private List<String> list1;
    private List<String> list2;

    @PostConstruct
    public void init(){
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    private void sendData(){
        listProcessor1.addData("list1");
        listProcessor2.addData("list2");
    }

    public void displayListStep(){
        this.sendData();
        this.list1 = listProcessor1.getProcessedList();
        this.list2 = listProcessor2.getProcessedList();

        list1.forEach(System.out::println);
        log.info("----------------------");
        list2.forEach(System.out::println);
    }
}
