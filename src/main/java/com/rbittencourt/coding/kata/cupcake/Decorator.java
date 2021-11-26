package com.rbittencourt.coding.kata.cupcake;

import java.math.BigDecimal;

public abstract class Decorator implements Ingredient {

    protected Ingredient ingredient;

    public Decorator(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    protected abstract String name();

    public String description() {
        String description = ingredient.description();
        description += getDescriptionComplement();
        description +=  name();

        return description;
    }

    public BigDecimal price() {
        return ingredient.price();
    }

    private String getDescriptionComplement() {
        return !ingredient.description().contains("with") ? " with " : " and ";
    }

}
