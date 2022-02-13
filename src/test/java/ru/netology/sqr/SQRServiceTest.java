package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"start finish V1,200,300,3",
            "start finish V2,400,600,5"}
    )
    void shouldCalculate(String testName, int start, int finish, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateNumbers(start, finish);

        assertEquals(expected, actual);


    }
}
