package com.ggomjae.gom.modulebasicutils.supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args){

        // Cost 비용
        Long cost = 1000L;

        // role_Type에 따른 비용 계산
        log.info("MemberType : {} , Member_Cost : {} ",MemberType.STUDENT, MemberType.STUDENT.getCost(cost));
        log.info("MemberType : {} , Member_Cost : {}",MemberType.ADMIN, MemberType.ADMIN.getCost(cost));
        log.info("MemberType : {} , Member_Cost : {}",MemberType.GENERAL, MemberType.GENERAL.getCost(cost));
    }
}
