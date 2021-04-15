package com.ggomjae.gom.apitestmanagement.reflectionDto;

import lombok.Builder;

public class ParentObject {

    private String type;

    @Builder
    public ParentObject(String type) {
        this.type = type;
    }
}
