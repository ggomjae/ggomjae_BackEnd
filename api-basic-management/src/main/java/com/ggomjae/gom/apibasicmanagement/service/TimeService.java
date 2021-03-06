package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.dto.TimeDto;
import com.ggomjae.gom.modulebasicdb.time.Time;
import com.ggomjae.gom.apibasicmanagement.repository.TimeRepository;
import com.ggomjae.gom.modulebasicutils.time.StringToTimestemp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Slf4j
@RequiredArgsConstructor
@Service
public class TimeService {

    private final TimeRepository timeRepository;

    public void saveTime(TimeDto time){
        Timestamp timestamp = StringToTimestemp.getTimestemp(time.getTime());
        timeRepository.save(Time.builder()
            .timestamp(timestamp)
            .build());
    }

    @Transactional(readOnly = true)
    public void displayTime(){
        timeRepository.findAll();
    }
}
