package com.ggomjae.gom.apibasicmanagement.dto;

import com.ggomjae.gom.modulequerydsldb.domain.Member;
import lombok.Builder;
import lombok.Getter;
import javax.validation.constraints.NotNull;

import java.sql.Timestamp;

@Getter
public class ServiceCreateMemberDto {

    @NotNull
    private final Integer memberAge;

    @NotNull
    private final String memberName;

    @Builder
    public ServiceCreateMemberDto(Integer memberAge, String memberName){
        this.memberAge = memberAge;
        this.memberName = memberName;
    }

    public Member toMember(){
        return Member.builder()
                .memberAge(this.memberAge)
                .memberName(this.memberName)
                .time(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}
