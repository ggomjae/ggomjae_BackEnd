package com.ggomjae.gom.modulebasicutils.time;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Slf4j
public class CurrentTimeFinal {

    public static void main(String[] args){
        /*
         *    3가지 전부 현재 시간을 구하는 것이고 String으로 반환되는 값입니다.
         *
         */

        Date time = new Date();
        log.info("time : {}",time); // Mon Apr 05 21:54:20 KST 2021

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");

        String time1 = format1.format(time);
        String time2 = format2.format(time);

        log.info("time1 : {}", time1); // 2021-04-05 22:06:34
        log.info("time2 : {}", time2);
////////////////////////////////////////////////////////////////////////////////////////////////
        Calendar calendar = Calendar.getInstance();

        String format_time1 = format1.format(calendar.getTime());
        String format_time2 = format2.format(calendar.getTime());

        log.info("time1 : {}", format_time1); // 2021-04-05 22:06:34
        log.info("time2 : {}", format_time2);

////////////////////////////////////////////////////////////////////////////////////////////////
        String format_time3 = format1.format (System.currentTimeMillis());
        String format_time4 = format2.format (System.currentTimeMillis());

        log.info("time1 : {}", format_time3); // 2021-04-05 22:06:34
        log.info("time2 : {}", format_time4);
    }
}
