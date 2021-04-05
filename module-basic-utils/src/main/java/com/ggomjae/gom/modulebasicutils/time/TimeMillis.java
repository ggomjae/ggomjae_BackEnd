package com.ggomjae.gom.modulebasicutils.time;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMillis {

    public static Timestamp getCurrentTimestampByMillisecond(){
        return new Timestamp(System.currentTimeMillis());
    }

    public static String getCurrentStringTimeByMillisecond(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long timeInMillis =System.currentTimeMillis();

        Date timeInDate = new Date(timeInMillis);
        return simpleDateFormat.format(timeInDate);
    }
}
