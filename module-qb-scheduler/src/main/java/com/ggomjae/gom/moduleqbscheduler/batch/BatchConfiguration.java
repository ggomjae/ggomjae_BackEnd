package com.ggomjae.gom.moduleqbscheduler.batch;

import com.ggomjae.gom.moduleqbscheduler.batch.reader.CustomItemReader;
import com.ggomjae.gom.moduleqbscheduler.batch.reader.CustomItemReader2;
import com.ggomjae.gom.moduleqbscheduler.batch.writer.CustomItemWriter;
import com.ggomjae.gom.moduleqbscheduler.batch.writer.CustomItemWriter3;
import com.ggomjae.gom.moduleqbscheduler.batch.writer.CustomItemWriter2;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.support.CompositeItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@RequiredArgsConstructor
@EnableBatchProcessing
public class BatchConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    // step 1
    private final CustomItemReader customItemReader;
    private final CustomItemWriter customItemWriter;

    // step 2
    private final CustomItemReader2 customItemReader2;
    private final CustomItemWriter2 customItemWrtier2;
    private final CustomItemWriter3 customItemWriter3;

    @Bean
    public Step step() {
        return stepBuilderFactory.get("customStep")
                .<Object, Object> chunk(1)
                .reader(customItemReader)
                .writer(customItemWriter)
                .build();
    }

    @Bean
    public Job testJob() {
        return jobBuilderFactory.get("testJob")
                .incrementer(new RunIdIncrementer())
                .flow(step())
                .end()
                .build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("customStep2")
                .<Object, Object> chunk(1)
                .reader(customItemReader2)
                .writer(compositeItemWriter())
                .build();
    }

    @Bean
    public Job testJob2() {
        return jobBuilderFactory.get("testJob2")
                .incrementer(new RunIdIncrementer())
                .flow(step())
                .end()
                .build();
    }

    @Bean
    public CompositeItemWriter<Object> compositeItemWriter() {
        CompositeItemWriter<Object> compositeItemWriter = new CompositeItemWriter<>();
        compositeItemWriter.setDelegates(Arrays.asList(customItemWrtier2,customItemWriter3));
        return compositeItemWriter;
    }
}