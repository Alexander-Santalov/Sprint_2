package com.example;

import org.junit.Test;
import org.mockito.*;

import java.util.*;

import static org.junit.Assert.*;

public class CatTest extends TestBase {
    @Mock
    Feline feline;

    @Test
    public void getCatSoundTest() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }

    @Test
    public void getCatFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualEatMeat = cat.getFood();
        assertEquals(expectedFood, actualEatMeat);
    }
}
