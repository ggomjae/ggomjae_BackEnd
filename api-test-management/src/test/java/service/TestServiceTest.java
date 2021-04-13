package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    /*
        given	  객체를 생성 할 때 사용 - 설정
        when	  객체를 얻어 올 때 사용 - 조건 - 무조건 이 값을 리턴해야한다.
        then	  객체를 비교 할 때 사용
        verify	  확인 작업을 할 때 사용

        변수명 이렇게 : assertEquals(expected, actual)

        https://github.com/ggomjae/REST_API/blob/master/src/test/java/com/example/restapi/service/UserServiceTest.java
     */

    @InjectMocks
    private TestService testService;

    @Test
    void test_service(){
        String result = testService.testMethod("ggomjae");
        assertEquals(result, "ggomjae");
    }
}