package com.ggomjae.gom.apibasicmanagement.practice;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListProcessor1 {

    private List<String> processedList;

    @PostConstruct
    public void init(){
        processedList = new ArrayList<>();
    }

    public List<String> getProcessedList(){
        return this.processedList;
    }

    public void addData(String data){
        processedList.add(data);
    }
}
