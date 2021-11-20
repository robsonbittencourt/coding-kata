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
    public void shouldReturnCookieWhenIsPureCupcake() {
        Cookie cookie = new Cookie();

        assertEquals("Cookie", cookie.description());
    }

    @Test
    public void shouldReturnCupcakeWithChocolate() {
        Cupcake cupcake = new Cupcake(new Chocolate());

        assertEquals("Cupcake with chocolate", cupcake.description());
    }

    @Test
    public void shouldReturnCupcakeWithChocolateAndNuts() {
        Cupcake cupcake = new Cupcake(new Chocolate(), new Nuts());

        assertEquals("Cupcake with chocolate and nuts", cupcake.description());
    }

}
