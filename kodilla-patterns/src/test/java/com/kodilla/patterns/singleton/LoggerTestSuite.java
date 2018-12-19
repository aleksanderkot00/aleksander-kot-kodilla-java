package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testInitialGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("", lastLog);
    }

    @Test
    public void testChangedGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Log23");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log23", lastLog);
    }
}
