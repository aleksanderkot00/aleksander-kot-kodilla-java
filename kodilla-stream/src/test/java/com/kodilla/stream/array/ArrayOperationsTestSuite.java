package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 18;
        numbers[2] = 13;
        numbers[3] = 24;
        numbers[4] = 6;
        numbers[5] = 1;
        numbers[6] = 9;
        numbers[7] = 17;
        numbers[8] = 21;
        numbers[9] = 8;
        //When
        double average = ArrayOperations.getAverage(numbers).getAsDouble();
        //Then
        Assert.assertEquals(12.2, average, 0.00001);
        }
}
