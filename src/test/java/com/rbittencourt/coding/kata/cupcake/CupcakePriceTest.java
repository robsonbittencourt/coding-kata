package com.rbittencourt.coding.kata.cupcake;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakePriceTest {

    @Test
    public void shouldReturnPriceForCupcake() {
        Ingredient ingredient = new Cupcake();

        assertEquals(new BigDecimal("1"), ingredient.price());
    }

    @Test
    public void shouldReturnPriceForCupcakeWithChocolate() {
        Ingredient ingredient = new Chocolate(new Cupcake());

        assertEquals(new BigDecimal("1.1"), ingredient.price());
    }

    @Test
    public void shouldReturnPriceForCupcakeWithNuts() {
        Ingredient ingredient = new Nuts(new Cupcake());

        assertEquals(new BigDecimal("1.2"), ingredient.price());
    }

    @Test
    public void shouldReturnPriceForCupcakeWithChocolateAndNuts() {
        Ingredient ingredient = new Nuts(new Chocolate(new Cupcake()));

        assertEquals(new BigDecimal("1.3"), ingredient.price());
    }

}
