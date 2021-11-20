package com.rbittencourt.coding.kata.cupcake;

import java.math.BigDecimal;

public class Nuts extends CakeDecorator {

    public Nuts(Ingredient ingredient) {
        super(ingredient);
    }

    public String description() {
        if (!ingredient.description().contains("with")) {
            return ingredient.description() + " with nuts";
        }

        return ingredient.description() + " and nuts";
    }

    @Override
    public BigDecimal price() {
        return ingredient.price().add(new BigDecimal("0.2"));
    }

}
