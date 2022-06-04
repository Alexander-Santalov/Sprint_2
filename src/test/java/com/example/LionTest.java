package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

import java.util.*;

import static org.junit.Assert.*;

public class LionTest extends TestBase {

    @Mock
    private Feline feline;

    @Test
    public void getLionFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedFood, actualEatMeat);
    }

    @Test
    public void getLionKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualGetKittens = lion.getKittens();
        assertEquals(1, actualGetKittens);
    }

    @Test
    public void getExceptionMessage() {
        try {
            new Lion("самец", feline);
            Assert.fail("Expected Exception");
        } catch (Exception thrown) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    thrown.getMessage());
        }
    }


}