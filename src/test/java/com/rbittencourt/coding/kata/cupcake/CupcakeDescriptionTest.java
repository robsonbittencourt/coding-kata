package com.rbittencourt.coding.kata.cupcake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakeDescriptionTest {

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
    public void shouldReturnCupcakeWithNuts() {
        Ingredient ingredient = new Nuts(new Cupcake());

        assertEquals("Cupcake with nuts", ingredient.description());
    }

    @Test
    public void shouldReturnCupcakeWithChocolateAndNuts() {
        Ingredient ingredient = new Nuts(new Chocolate(new Cupcake()));

        assertEquals("Cupcake with chocolate and nuts", ingredient.description());
    }

}
