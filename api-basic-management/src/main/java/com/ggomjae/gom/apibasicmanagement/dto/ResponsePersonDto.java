package com.ggomjae.gom.apibasicmanagement.dto;

import com.ggomjae.gom.modulequerydsldb.domain.Person;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ResponsePersonDto {

    String personName;

    public ResponsePersonDto(Person entity){
        this.personName = entity.getName();
    }
}
