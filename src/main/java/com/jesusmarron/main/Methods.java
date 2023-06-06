package com.jesusmarron.main;

public class Methods {
    public static void main(String[] args) {

        System.out.println(add(1,5));
        System.out.println(concat("Hello ", "World!"));
        System.out.println(divide(6, 0));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String concat(String a, String b) {
        return a + b;
    }

    /**
     * Divides two integers and returns the result
     * @param a - the integer to divide
     * @param b - the integer to divide by
     * @return - the result of dividing a by b
     * @throws IllegalArgumentException - if b == 0
     */
    public static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }
}
