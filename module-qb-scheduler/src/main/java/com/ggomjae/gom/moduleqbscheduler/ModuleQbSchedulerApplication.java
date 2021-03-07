package com.ggomjae.gom.moduleqbscheduler;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling       // 스케줄러 기능을 사용할수 있게 활성화
@EnableBatchProcessing  // 배치기능 활성화
@SpringBootApplication
public class ModuleQbSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleQbSchedulerApplication.class, args);
    }

}
