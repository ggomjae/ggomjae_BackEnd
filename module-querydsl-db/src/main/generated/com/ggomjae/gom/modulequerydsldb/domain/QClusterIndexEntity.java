package com.ggomjae.gom.modulequerydsldb.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClusterIndexEntity is a Querydsl query type for ClusterIndexEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClusterIndexEntity extends EntityPathBase<ClusterIndexEntity> {

    private static final long serialVersionUID = -865524950L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClusterIndexEntity clusterIndexEntity = new QClusterIndexEntity("clusterIndexEntity");

    public final com.ggomjae.gom.modulequerydsldb.domain.compositeKey.QClusterIndexEntityKey clusterIndexEntityKey;

    public QClusterIndexEntity(String variable) {
        this(ClusterIndexEntity.class, forVariable(variable), INITS);
    }

    public QClusterIndexEntity(Path<? extends ClusterIndexEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClusterIndexEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClusterIndexEntity(PathMetadata metadata, PathInits inits) {
        this(ClusterIndexEntity.class, metadata, inits);
    }

    public QClusterIndexEntity(Class<? extends ClusterIndexEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.clusterIndexEntityKey = inits.isInitialized("clusterIndexEntityKey") ? new com.ggomjae.gom.modulequerydsldb.domain.compositeKey.QClusterIndexEntityKey(forProperty("clusterIndexEntityKey")) : null;
    }

}

