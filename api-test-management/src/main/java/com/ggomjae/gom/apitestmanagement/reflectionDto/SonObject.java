package com.ggomjae.gom.apitestmanagement.reflectionDto;

public class SonObject extends ParentObject {

    private String name;

    public SonObject(String name) {
        super("Parent");
        this.name = name;
    }

    public void say() {
        System.out.println("SON HI");
    }
}
