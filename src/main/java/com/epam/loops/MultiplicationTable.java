package com.epam.loops;

public class MultiplicationTable {
    /**
     * Prints multiplication table for given number.
     * @param numberTableToPrint
     */
    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint < 0) {
            System.out.println("Please provide a positive integer");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (numberTableToPrint * i));
        }
    }
}
