package com.epam.loops;

public class Power {
    /**
     * Prints evaluation of number to the power into console.
     * @param numberToPrint
     * @param power
     */
    public void printPower(int numberToPrint, int power) {
        if (power < 0) {
            System.out.println("Power should be non-negative");
            return;
        }

        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
