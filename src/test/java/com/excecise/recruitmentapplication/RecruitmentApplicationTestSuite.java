package com.excecise.recruitmentapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Map;

class RecruitmentApplicationTestSuite {
    @Test
    void testCountEachArgumentLetter() {
        //Given
        String arg = "caaZbbbCcc";

        //When
        Map<Character, Integer> resultMap = RecruitmentApplication.countEachArgumentLetter(arg);

        //Then
        Assertions.assertTrue(resultMap.size() == 4);
        Assertions.assertEquals(resultMap.get('a'), 2);
        Assertions.assertEquals(resultMap.get('b'), 3);
        Assertions.assertEquals(resultMap.get('c'), 4);
        Assertions.assertEquals(resultMap.get('z'), 1);
    }
}
