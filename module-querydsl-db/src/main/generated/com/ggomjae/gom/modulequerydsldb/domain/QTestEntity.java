package com.ggomjae.gom.modulequerydsldb.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTestEntity is a Querydsl query type for TestEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTestEntity extends EntityPathBase<TestEntity> {

    private static final long serialVersionUID = -1585211324L;

    public static final QTestEntity testEntity = new QTestEntity("testEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath testContent = createString("testContent");

    public QTestEntity(String variable) {
        super(TestEntity.class, forVariable(variable));
    }

    public QTestEntity(Path<? extends TestEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestEntity(PathMetadata metadata) {
        super(TestEntity.class, metadata);
    }

}

