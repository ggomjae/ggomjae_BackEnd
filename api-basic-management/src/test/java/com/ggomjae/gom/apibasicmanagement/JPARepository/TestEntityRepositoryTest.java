package com.ggomjae.gom.apibasicmanagement.JPARepository;

import com.ggomjae.gom.modulequerydsldb.domain.TestEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestEntityRepositoryTest {


    @Spy
    TestEntityRepository testEntityRepository;

    @Test
    public void test_save(){

        //given
        TestEntity testEntity = TestEntity.builder()
                .testContent("ggomjae")
                .build();

        //when
        
    }
}