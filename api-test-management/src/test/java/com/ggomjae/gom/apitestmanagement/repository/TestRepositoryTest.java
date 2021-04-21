package com.ggomjae.gom.apitestmanagement.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TestRepositoryTest {

    Logger log = (Logger) LoggerFactory.getLogger(TestRepositoryTest.class);


    @Autowired
    TestRepository testRepository;

    @Test
    @DisplayName("어노테이션을 쓰지 않아도 Repository가 존재하는지 확인하는 테스트")
    public void test() {
        log.info("testRepository value : {}", testRepository);
        Assertions.assertNotNull(testRepository);
    }
}
