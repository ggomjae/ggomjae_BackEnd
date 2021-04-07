package com.ggomjae.gom.modulebasicutils.supplier;

import java.util.function.Function;

public enum MemberType {

    STUDENT("STUDENT_COST", cost -> cost / 2 ),
    ADMIN("ADMIN_COST", cost -> 0L ),
    GENERAL("GENERAL", cost -> cost);

    private String role;
    private Function<Long, Long> expression;

    MemberType(String role, Function<Long, Long> expression){
        this.role = role;
        this.expression = expression;
        System.out.println(role);
    }

    public Long getCost(Long cost){
        return this.expression.apply(cost);
    }
}
