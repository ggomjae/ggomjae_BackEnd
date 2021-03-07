package com.ggomjae.gom.moduleqbscheduler.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class CustomItemWriter implements ItemWriter<Object> {

    @Override
    public void write(List<? extends Object> arg0) throws Exception {

    }
}