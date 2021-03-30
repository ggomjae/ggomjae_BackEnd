package com.ggomjae.gom.modulebasicutils.supplier;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class Main {

    public static void main(String[] args){

        // Cost 비용
        Long cost = 1000L;

        log.info("before");
        // role_Type에 따른 비용 계산
        log.info("MemberType : {} , Member_Cost : {} ",MemberType.STUDENT, MemberType.STUDENT.getCost(cost));
        log.info("MemberType : {} , Member_Cost : {}",MemberType.ADMIN, MemberType.ADMIN.getCost(cost));
        log.info("MemberType : {} , Member_Cost : {}",MemberType.GENERAL, MemberType.GENERAL.getCost(cost));

        log.info("after");
        // Consumer 적용
        Consumer<MemberType> consumer = type ->
                log.info("MemberType : {} , Member_Cost : {} ", type, type.getCost(cost));
        consumer.accept(MemberType.STUDENT);
        consumer.accept(MemberType.ADMIN);
        consumer.accept(MemberType.GENERAL);

    }
}
