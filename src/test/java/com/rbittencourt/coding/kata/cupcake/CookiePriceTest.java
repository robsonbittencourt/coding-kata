package com.rbittencourt.coding.kata.cupcake;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookiePriceTest {

    @Test
    public void shouldReturnPriceForCookie() {
        Ingredient ingredient = new Cookie();

        assertEquals(new BigDecimal("2"), ingredient.price());
    }

    @Test
    public void shouldReturnPriceForCookieWithChocolate() {
        Ingredient ingredient = new Chocolate(new Cookie());

        assertEquals(new BigDecimal("2.1"), ingredient.price());
    }

    @Test
    public void shouldReturnPriceForCookieWithNuts() {
        Ingredient ingredient = new Nuts(new Cookie());

        assertEquals(new BigDecimal("2.2"), ingredient.price());
    }

    @Test
    public void shouldReturnPriceForCookieWithChocolateAndNuts() {
        Ingredient ingredient = new Nuts(new Chocolate(new Cookie()));

        assertEquals(new BigDecimal("2.3"), ingredient.price());
    }

}
