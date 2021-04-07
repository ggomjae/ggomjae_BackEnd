package com.ggomjae.gom.modulequerydsldb.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "test_id")
    private Long id;

    @Column(name = "test_content")
    private String testContent;

    @Builder
    public TestEntity(String testContent){
        this.testContent = testContent;
    }
}
