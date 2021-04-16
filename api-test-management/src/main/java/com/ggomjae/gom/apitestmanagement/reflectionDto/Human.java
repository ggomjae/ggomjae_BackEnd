package com.ggomjae.gom.apitestmanagement.reflectionDto;

import lombok.ToString;

@ToString
public class Human {
    private String name;
    private int age;
    private String company;

    public Human() {
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}