package com.ggomjae.gom.modulequerydsldb.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long personId;

    @Column
    String name;

    @Column
    Integer age;

    @Builder
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
