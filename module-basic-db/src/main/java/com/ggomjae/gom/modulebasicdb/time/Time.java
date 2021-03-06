package com.ggomjae.gom.modulebasicdb.time;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Timestamp timestamp;

    @Builder
    public Time(Timestamp timestamp){
        this.timestamp = timestamp;
    }

}
