package com.ggomjae.gom.apitestmanagement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ggomjae.gom.apitestmanagement.reflectionDto.Human;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        String message = "{\"name\":\"gom\",\"age\":\"29\",\"company\":\"seoul\"}";
        Human human = objectMapper.readValue(message, Human.class);

        System.out.println("human:" + human);
    }
}