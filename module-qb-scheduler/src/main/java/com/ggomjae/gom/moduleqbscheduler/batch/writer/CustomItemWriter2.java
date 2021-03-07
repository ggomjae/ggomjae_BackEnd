package com.ggomjae.gom.moduleqbscheduler.batch.writer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomItemWriter2 implements ItemWriter<Object> {

    @Override
    public void write(List<? extends Object> arg0) throws Exception {

    }
}