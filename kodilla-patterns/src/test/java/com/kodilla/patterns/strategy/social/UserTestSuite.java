package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User tomek = new Millenials("Tomek");
        User piotrek = new YGeneration("Piotrek");
        User bartek = new ZGeneration("Bartek");

        //When
        String whereTomekShered = tomek.shareOnSocialMedia();
        String wherePiotrekShered = piotrek.shareOnSocialMedia();
        String whereBartekShered = bartek.shareOnSocialMedia();

        //Then
        Assert.assertEquals("Shared on Facebook", whereTomekShered);
        Assert.assertEquals("Shared on Twitter", wherePiotrekShered);
        Assert.assertEquals("Shared on Snapchat", whereBartekShered);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User marcin = new Millenials("Marcin");

        //When
        String whereMarcinShered = marcin.shareOnSocialMedia();
        marcin.setSocialPublisher(new SnapchatPublisher());
        String whereMarcinSheredAfterChange = marcin.shareOnSocialMedia();

        //Then
        Assert.assertEquals("Shared on Facebook", whereMarcinShered);
        Assert.assertEquals("Shared on Snapchat", whereMarcinSheredAfterChange);
    }
}
