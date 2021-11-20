package com.rbittencourt.coding.kata.cupcake;

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

}
