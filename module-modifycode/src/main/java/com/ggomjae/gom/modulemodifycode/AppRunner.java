package com.ggomjae.gom.modulemodifycode;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ClassLoader loader = AppRunner.class.getClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
    }
}