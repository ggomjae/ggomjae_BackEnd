package com.ggomjae.gom.modulebasicutils.time;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class StringToTimestemp {

    public static Timestamp getTimestemp(String time){
        return Timestamp.valueOf(time);
    }

}
