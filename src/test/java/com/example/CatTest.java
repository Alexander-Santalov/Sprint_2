package com.example;

import org.junit.Test;
import org.mockito.*;

import java.util.*;

import static org.junit.Assert.*;

public class CatTest extends TestBase {

    @Test
    public void getCatSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }

    @Mock
    Predator predator;

    @Test
    public void getCatFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Mockito.when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualEatMeat = cat.getFood();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), actualEatMeat);
    }
}
