package com.ggomjae.gom.modulequerydsldb.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class NonClusterIndexEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "non_cluster_index_id")
    private Long id;

    @Column(name = "time")
    private Timestamp time;

    @Column(name = "name")
    private String name;
}
