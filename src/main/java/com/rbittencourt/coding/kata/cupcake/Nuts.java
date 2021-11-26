package com.rbittencourt.coding.kata.cupcake;

import java.math.BigDecimal;

public class Nuts extends Decorator {

    public Nuts(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String name() {
        return "nuts";
    }

    @Override
    public BigDecimal price() {
        return ingredient.price().add(new BigDecimal("0.2"));
    }

}
