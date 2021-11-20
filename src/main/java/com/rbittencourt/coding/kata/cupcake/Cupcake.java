package com.rbittencourt.coding.kata.cupcake;

public class Cupcake {

    private Chocolate chocolate;
    private Nuts nuts;

    public Cupcake() {
    }

    public Cupcake(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public Cupcake(Chocolate chocolate, Nuts nuts) {
        this.chocolate = chocolate;
        this.nuts = nuts;
    }

    public String description() {
        if (this.chocolate != null && this.nuts != null) {
            return "Cupcake with " + chocolate.description() + " and " + nuts.description();
        }

        if (this.chocolate != null) {
            return "Cupcake with " + chocolate.description();
        }

        return "Cupcake";
    }

}
