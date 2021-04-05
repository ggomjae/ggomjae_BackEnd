package com.ggomjae.gom.modulebasicutils.time;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Slf4j
@Component
public class StringToTimestemp {

    /*
     *   결과값은 TimeMain에 있습니다.
     */

    public static Timestamp getTimestempByFormat(String time){

        // 2009-03-20 10:20:30.0
        return Timestamp.valueOf(time);
    }

    public static Timestamp getTimestempByNotFormat(String time) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return new Timestamp ((dateFormat.parse(time)).getTime());
        }catch (ParseException p){
            throw new RuntimeException(p.getMessage());
        }
    }
}
