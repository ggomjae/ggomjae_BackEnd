package com.ggomjae.gom.apitestmanagement.service;

import com.ggomjae.gom.apitestmanagement.repository.TestBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    TestService testService;

    @Mock
    TestBookRepository testRepository;

    @BeforeEach
    private void init() {
        testService = new TestService(testRepository);
    }

    @Test
    public void test_service() {

        Assertions.assertNotNull(testService);
    }
}