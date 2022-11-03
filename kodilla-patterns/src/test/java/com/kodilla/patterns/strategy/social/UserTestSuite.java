package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class UserTestSuite {

//    @Test
//    void testDefaultSharingStrategies() {
//
//        //Given
//        User janek = new Millenials("Janek");
//        User bartek = new ZGeneration("Bartek");
//        User jakub = new YGeneration("Jakub");
//
//        //When
//        String janekPublishes = janek.sharePost();
//        System.out.println(janek.getName() + " publikuje na " + janekPublishes + "u.");
//        String bartekPublishes = bartek.sharePost();
//        System.out.println(bartek.getName() + " publikuje na " + bartekPublishes + "cie.");
//        String jakubPublishes = jakub.sharePost();
//        System.out.println(jakub.getName() + " publikuje na " + jakubPublishes + "ze." );
//
//        //Then
//        assertEquals("FACEBOOK", janekPublishes);
//        assertEquals("SNAPCHAT", bartekPublishes);
//        assertEquals("TWITTER", jakubPublishes);
//
//    }
//
//    @Test
//    void testIndividualSharingStrategy() {
//
//        //Given
//        User janek = new Millenials("Janek");
//
//        //When
//        String janekPublishes = janek.sharePost();
//        System.out.println(janek.getName() + " publikuje na " + janekPublishes + "u.");
//        janek.setSocialPublisher(new SnapchatPublisher());
//        String janekPublishesNow = janek.sharePost();
//        System.out.println(janek.getName() + " publikował na " + janekPublishes + "u, ale ostatnio przerzucił się na " + janekPublishesNow);
//
//        //Then
//        assertEquals("SNAPCHAT", janekPublishesNow);
//    }
}