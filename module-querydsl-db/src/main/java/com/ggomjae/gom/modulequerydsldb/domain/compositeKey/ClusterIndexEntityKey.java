package com.ggomjae.gom.modulequerydsldb.domain.compositeKey;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;


@Getter
@Embeddable
public class ClusterIndexEntityKey implements Serializable {

    @Column(name = "time")
    private Timestamp time;

    @Column(name = "name")
    private String name;
}
