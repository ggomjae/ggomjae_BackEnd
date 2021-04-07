package com.ggomjae.gom.modulebasicutils.time;

import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
public class DateRange {

    public static void main(String[] args){
        Timestamp time1 = StringToTimestemp.getTimestempByNotFormat("2021-04-06");
        log.info("현재 날짜 첫 시간 : {}", time1);

        Timestamp time2 = new Timestamp(System.currentTimeMillis());
        log.info("현재 날짜 시간 : {}", time2);

        // 차이구하기
        DateRange.getTimeRange(time1.getTime(), time2.getTime());
    }

    public static void getTimeRange(long time1, long time2){
        try {

            //in milliseconds
            long diff = time2 - time1;

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            log.info("days : {}",diffDays);
            log.info("hours : {}",diffHours);
            log.info("minutes : {}",diffMinutes);
            log.info("seconds : {}",diffSeconds);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
