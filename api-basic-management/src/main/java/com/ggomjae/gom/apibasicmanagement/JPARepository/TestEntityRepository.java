package com.ggomjae.gom.apibasicmanagement.JPARepository;

import com.ggomjae.gom.modulequerydsldb.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}



