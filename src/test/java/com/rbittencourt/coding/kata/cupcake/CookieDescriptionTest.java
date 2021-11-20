package com.rbittencourt.coding.kata.cupcake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookieDescriptionTest {

    @Test
    public void shouldReturnCookieWhenIsPureCupcake() {
        Cookie cookie = new Cookie();

        assertEquals("Cookie", cookie.description());
    }

    @Test
    public void shouldReturnCookieWithChocolate() {
        Ingredient ingredient = new Chocolate(new Cookie());

        assertEquals("Cookie with chocolate", ingredient.description());
    }

    @Test
    public void shouldReturnCookieWithNuts() {
        Ingredient ingredient = new Nuts(new Cookie());

        assertEquals("Cookie with nuts", ingredient.description());
    }

    @Test
    public void shouldReturnCookieWithChocolateAndNuts() {
        Ingredient ingredient = new Nuts(new Chocolate(new Cookie()));

        assertEquals("Cookie with chocolate and nuts", ingredient.description());
    }

}
