package com.rbittencourt.coding.kata.cupcake;

import java.math.BigDecimal;

public class Cupcake implements Ingredient {

    public String description() {
        return "Cupcake";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("1");
    }

}
