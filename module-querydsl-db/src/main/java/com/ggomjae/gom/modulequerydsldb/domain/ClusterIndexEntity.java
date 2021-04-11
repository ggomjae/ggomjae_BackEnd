package com.ggomjae.gom.modulequerydsldb.domain;


import com.ggomjae.gom.modulequerydsldb.domain.compositeKey.ClusterIndexEntityKey;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ClusterIndexEntity {

    @EmbeddedId
    private ClusterIndexEntityKey clusterIndexEntityKey;
}
