package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {5, 18, 13, 24, 6, 1, 9, 17, 21, 8};
        //When
        double average = ArrayOperations.getAverage(numbers).getAsDouble();
        //Then
        Assert.assertEquals(12.2, average, 0.00001);
        }
}
