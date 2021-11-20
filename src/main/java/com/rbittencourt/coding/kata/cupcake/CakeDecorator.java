package com.rbittencourt.coding.kata.cupcake;

public abstract class CakeDecorator implements Ingredient {

    protected Ingredient ingredient;

    public CakeDecorator(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String description() {
        return ingredient.description();
    }

}
