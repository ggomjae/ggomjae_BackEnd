package com.ggomjae.gom.apibasicmanagement.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//@Component -- 실행시키기 위해서 일단 주석
@RequiredArgsConstructor
public class CycleTest2 {

    private final CycleTest1 cycleTest1;

    public void testMethod(){
        cycleTest1.testMethod();
    }
}
