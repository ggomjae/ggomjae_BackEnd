package com.ggomjae.gom.modulebasicutils.time;

import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
public class TimeMain {

    public static void main(String[] args){

        // return : 2009-03-20 10:20:30.0
        Timestamp timestamp = StringToTimestemp.getTimestemp("2009-03-20 10:20:30.0");

    }
}
