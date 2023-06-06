package com.jesusmarron.main.lemonadestand;

public class Lemonade {
    Water water;
    LemonJuice lemonJuice;
    Sugar sugar;

    public Lemonade(LemonJuice lemonJuice, Water water, Sugar sugar) {
        this.lemonJuice = lemonJuice;
        this.water = water;
        this.sugar = sugar;
    }

}
