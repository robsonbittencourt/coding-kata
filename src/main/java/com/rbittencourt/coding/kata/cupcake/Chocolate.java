package com.rbittencourt.coding.kata.cupcake;

import java.math.BigDecimal;

public class Chocolate extends Decorator {

    public Chocolate(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String name() {
        return "chocolate";
    }

    public BigDecimal price() {
        return ingredient.price().add(new BigDecimal("0.1"));
    }

}
