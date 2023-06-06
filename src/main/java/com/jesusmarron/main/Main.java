package com.jesusmarron.main;

import com.jesusmarron.main.lemonadestand.Water;

public class Main {
    public static void main(String[] args) {

        Water water1 = new Water(5, "cups");

        water1.drink(2);

        System.out.println(water1);
    }

}