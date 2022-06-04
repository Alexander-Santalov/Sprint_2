package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void getFelineFamilyTest() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void getFelineOneKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }

    @Test
    public void getFelineSetKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens(5);
        assertEquals(5, actualKittens);
    }

    @Test
    public void getFelineFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualFood);
    }

}
