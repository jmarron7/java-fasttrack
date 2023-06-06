package com.jesusmarron.main;

import com.jesusmarron.main.lemonadestand.LemonJuice;
import com.jesusmarron.main.lemonadestand.Lemonade;
import com.jesusmarron.main.lemonadestand.Sugar;
import com.jesusmarron.main.lemonadestand.Water;

public class Main {
    public static void main(String[] args) {

        LemonJuice lemonJuice = new LemonJuice(5, "ounces");
        Water water = new Water(3, "cups");
        Sugar sugar = new Sugar(12, "tsp");

        Lemonade lemonade = new Lemonade(lemonJuice, water, sugar);
    }

}