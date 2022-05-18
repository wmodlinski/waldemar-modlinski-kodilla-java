package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] simpleArray = {1, 8, 5, 6, 4, 1, 3, 2, 6, 4, 8, 2, 7, 3, 4, 5, 8, 9, 1, 2};

        //When
        System.out.println("Lista liczb wziętych do średniej poniżej: ");
        double testThisArray = ArrayOperations.getAverage(simpleArray);
        System.out.println();
        System.out.println("Srednia tych liczb wyniesie: " + testThisArray);


        //Then
        Assert.assertEquals(4.45, testThisArray, 0.0001);
    }
}