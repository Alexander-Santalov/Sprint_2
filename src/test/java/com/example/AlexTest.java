package com.example;

import org.junit.Test;
import org.mockito.Mock;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AlexTest extends TestBase {

    @Mock
    Feline feline;

    @Test
    public void getAlexFriendsTest() {
        Alex alex = new Alex(feline);
        List<String> actualFriends = alex.getFriends();
        assertEquals(Arrays.asList("Марти", "Глория", "Мелман"), actualFriends);
    }

    @Test
    public void getAlexHomeTest() {
        Alex alex = new Alex(feline);
        String actualHome = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actualHome);
    }

    @Test
    public void getAlexKittensTest() {
        Alex alex = new Alex(feline);
        int actualKittens = alex.getKittens();
        assertEquals(0, actualKittens);
    }

    @Test
    public void getAlexSexTest() {
        Alex alex = new Alex(feline);
        boolean actualHasMane = alex.doesHaveMane();
        assertTrue(actualHasMane);
    }
}
