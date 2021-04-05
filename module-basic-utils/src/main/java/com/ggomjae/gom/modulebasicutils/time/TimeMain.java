package com.ggomjae.gom.modulebasicutils.time;

import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
public class TimeMain {

    public static void main(String[] args){

        // return : 2009-03-20 10:20:30.0
        Timestamp timestamp = StringToTimestemp.getTimestempByFormat("2009-03-20 10:20:30.0");
        log.info("String To Timestamp : {}", timestamp);

        // return : 2009-03-20 00:00:00.0
        Timestamp timestamp1 = StringToTimestemp.getTimestempByNotFormat("2009-03-20");
        log.info("String To Timestamp : {}", timestamp1);
    }
}
