package com.example;

import org.junit.Test;
import org.mockito.*;

import java.util.*;

import static org.junit.Assert.*;

public class CatTest extends TestBase {
    @Mock
    Predator predator;

    @Test
    public void getCatSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }

    @Test
    public void getCatFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);
        List<String> actualEatMeat = cat.getFood();
        assertEquals(expectedFood, actualEatMeat);
    }
}
