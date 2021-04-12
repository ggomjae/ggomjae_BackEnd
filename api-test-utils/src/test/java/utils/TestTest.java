package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    @DisplayName("First_TEMP_TEST")
    public void testMethod(){
        String tempStr = "ggomjae";
        String tempResult = utils.Test.testMethod(tempStr);

        assertEquals(tempStr,tempResult);
    }
}