package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSecondChallenge {

    @Test
    void testProbablyIWillThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.51)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 1.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1))

        );
    }
}