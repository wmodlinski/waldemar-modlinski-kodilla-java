package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("Zalogowany nowy użytkownik");

        //Then
        assertEquals("Zalogowany nowy użytkownik", logger.getLastLog());

    }
}
