package com.rbittencourt.coding.kata.cupcake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakeMakerTest {

    @Test
    public void shouldReturnCupcakeWhenIsPureCupcake() {
        Cupcake cupcake = new Cupcake();

        assertEquals("Cupcake", cupcake.description());
    }

    @Test
    public void shouldReturnCupcakeWithChocolate() {
        Ingredient ingredient = new Chocolate(new Cupcake());

        assertEquals("Cupcake with chocolate", ingredient.description());
    }

    @Test
    public void shouldReturnCupcakeWithChocolateAndNuts() {
        Ingredient ingredient = new Nuts(new Chocolate(new Cupcake()));

        assertEquals("Cupcake with chocolate and nuts", ingredient.description());
    }

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
    public void shouldReturnCookieWithChocolateAndNuts() {
        Ingredient ingredient = new Nuts(new Chocolate(new Cookie()));

        assertEquals("Cookie with chocolate and nuts", ingredient.description());
    }

}
