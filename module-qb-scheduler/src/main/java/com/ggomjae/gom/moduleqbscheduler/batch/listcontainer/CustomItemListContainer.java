package com.ggomjae.gom.moduleqbscheduler.batch.listcontainer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Getter
@Component
public class CustomItemListContainer {

    private List<String> processedList;

    public void init(){
        processedList.clear();
    }

    public void add(String data){
        processedList.add(data);
    }
}
