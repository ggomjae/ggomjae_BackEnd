package com.ggomjae.gom.apibasicmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.ggomjae.gom.modulequerydsldb","com.ggomjae.gom.modulebasicdb"})
@EnableJpaRepositories(basePackages = {"com.ggomjae.gom.apibasicmanagement"})
@SpringBootApplication
public class ApiBasicManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiBasicManagementApplication.class, args);
    }

}
