package com.jesusmarron.main.lemonadestand;

public class Water {
    private int amount;
    private String unit;

    public Water(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public void drink(int amount) {
        if (this.amount < amount) {
            throw new IllegalArgumentException("You cannot drink more water than is available");
        } else {
        this.amount -= amount;
        }
    }
}
