package com.ggomjae.gom.modulequerydsldb.aceessleveltest;

import com.ggomjae.gom.modulequerydsldb.domain.Person;

public class AccessLevelTest {

    public void test(){

        /*
            불가능
         */
        //Person person = new Person();

        Person person = Person.builder()
                .name("ggomjae")
                .age(20)
                .build();
    }
}
