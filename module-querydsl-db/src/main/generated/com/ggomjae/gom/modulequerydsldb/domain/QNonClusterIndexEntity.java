package com.ggomjae.gom.modulequerydsldb.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNonClusterIndexEntity is a Querydsl query type for NonClusterIndexEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNonClusterIndexEntity extends EntityPathBase<NonClusterIndexEntity> {

    private static final long serialVersionUID = 1002519065L;

    public static final QNonClusterIndexEntity nonClusterIndexEntity = new QNonClusterIndexEntity("nonClusterIndexEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.sql.Timestamp> time = createDateTime("time", java.sql.Timestamp.class);

    public QNonClusterIndexEntity(String variable) {
        super(NonClusterIndexEntity.class, forVariable(variable));
    }

    public QNonClusterIndexEntity(Path<? extends NonClusterIndexEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNonClusterIndexEntity(PathMetadata metadata) {
        super(NonClusterIndexEntity.class, metadata);
    }

}

