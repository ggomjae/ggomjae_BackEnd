package com.ggomjae.gom.apibasicmanagement.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//@Component - 우선 실행시키기위해서 주석.
@RequiredArgsConstructor
public class CycleTest1 {

    private final CycleTest2 cycleTest2;

    public void testMethod(){
        cycleTest2.testMethod();
    }
}
