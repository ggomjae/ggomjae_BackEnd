package com.ggomjae.gom.moduleqbscheduler.batch.writer;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomItemWriter implements ItemWriter<Object> {

    @Override
    public void write(List<? extends Object> arg0) throws Exception {

    }
}