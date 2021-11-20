package com.rbittencourt.coding.kata.cupcake;

public class Chocolate extends CakeDecorator {

    public Chocolate(Ingredient ingredient) {
        super(ingredient);
    }

    public String description() {
        if (!ingredient.description().contains("with")) {
            return ingredient.description() + " with chocolate";
        }

        return ingredient.description() + " and ";
    }

}
