package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test of the class that selects even numbers from the collection")

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @DisplayName("test of the class that selects even numbers from the collection")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);
        //Then
        Assert.assertEquals(emptyList, listNumbers);
    }
    @DisplayName("Test checking if the class behaves correctly when the list contains even and odd numbers")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(234,567,22,899,12,15,3,5));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(234,22,12));

        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing"+listNumbers);
        //Then
        Assert.assertEquals(oddList,listNumbers);
    }
}