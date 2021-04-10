package com.ggomjae.gom.modulequerydsldb.domain.compositeKey;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClusterIndexEntityKey is a Querydsl query type for ClusterIndexEntityKey
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QClusterIndexEntityKey extends BeanPath<ClusterIndexEntityKey> {

    private static final long serialVersionUID = -176459715L;

    public static final QClusterIndexEntityKey clusterIndexEntityKey = new QClusterIndexEntityKey("clusterIndexEntityKey");

    public final StringPath name = createString("name");

    public final DateTimePath<java.sql.Timestamp> time = createDateTime("time", java.sql.Timestamp.class);

    public QClusterIndexEntityKey(String variable) {
        super(ClusterIndexEntityKey.class, forVariable(variable));
    }

    public QClusterIndexEntityKey(Path<? extends ClusterIndexEntityKey> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClusterIndexEntityKey(PathMetadata metadata) {
        super(ClusterIndexEntityKey.class, metadata);
    }

}

