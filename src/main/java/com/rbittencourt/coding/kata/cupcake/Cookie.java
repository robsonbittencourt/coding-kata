package com.rbittencourt.coding.kata.cupcake;

import java.math.BigDecimal;

public class Cookie implements Ingredient {

    public String description() {
        return "Cookie";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("2");
    }

}
