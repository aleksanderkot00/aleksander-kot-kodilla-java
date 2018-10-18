package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result =  exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(result, numbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(Integer i = 0; i < 10; i++ ){
            numbers.add(i);
        }
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result =  exterminator.exterminate(numbers);
        //Then
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for(Integer i = 0; i < 10; i = i + 2){
            evenNumbers.add(i);
        }
        Assert.assertEquals(result, evenNumbers);
    }
}
