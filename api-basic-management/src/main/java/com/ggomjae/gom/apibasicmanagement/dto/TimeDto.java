package com.ggomjae.gom.apibasicmanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class TimeDto {

    private String time;

    @Builder
    public TimeDto(String time){
        this.time = time;
    }

}
