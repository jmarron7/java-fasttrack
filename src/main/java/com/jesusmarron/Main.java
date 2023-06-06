package com.jesusmarron;

public class Main {
    public static void main(String[] args) {

//        int x = -5;
//
//        x += 2; // -3
//        x -= 2; // -5
//        x /= 2; // -2
//        x *= 2; // -4
//        // x %= 2; // 0
//
//        String hello = "Hello World";
//
//        System.out.println(x);
//        System.out.println(hello);
//
//        int totalSugarInGlass = 0;
//        int sugar = 5;
//        int maxSugar = 10;
//
//        if (sugar <= maxSugar) {
//            totalSugarInGlass += sugar;
//        }

        int[] numbers = new int[5];

        int count = 1;
        for (int i = 0; i < numbers.length; i++, count++) {
            numbers[i] = count;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}