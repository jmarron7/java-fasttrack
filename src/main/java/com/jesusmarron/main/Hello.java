package com.jesusmarron.main;

public class Hello {
    public static void main(String args[]) {
        int x = -5;

        x += 2; // -3
        x -= 2; // -5
        x /= 2; // -2
        x *= 2; // -4
        x %= 2; // 0

        String hello = "Hello World";

        System.out.println(x);
        System.out.println(hello);

        int totalSugarInGlass = 0;
        int sugar = 5;
        int maxSugar = 10;

        if (sugar <= maxSugar) {
            totalSugarInGlass += sugar;
        }
    }
}
