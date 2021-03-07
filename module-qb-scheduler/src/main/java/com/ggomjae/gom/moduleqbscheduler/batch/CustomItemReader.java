package com.ggomjae.gom.moduleqbscheduler.batch;

import com.ggomjae.gom.moduleqbscheduler.batch.listcontainer.CustomItemListContainer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomItemReader implements ItemReader<Object> {

    private List<String> stringList;
    private final CustomItemListContainer customItemListContainer;

    @BeforeStep
    public void init(){
        stringList = new ArrayList<>();
    }

    @Override
    public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        log.info("----------------------------");
        customItemListContainer.init();
        customItemListContainer.add("first");
        customItemListContainer.add("second");
        stringList = customItemListContainer.getProcessedList();
        stringList.forEach(System.out::println);
        log.info("----------------------------");

        return null;
    }
}