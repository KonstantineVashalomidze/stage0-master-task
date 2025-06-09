package com.epam.langSyntax;

public class NumberReverter {

    /**
     * Prints reversed number in console.
     * @param number Number to reverse.
     */
    public void revert(int number) {
        long revertedNumber = 0;

        while (number != 0) {
            revertedNumber = revertedNumber * 10 + number % 10;
            number = number / 10;
        }

        System.out.println(revertedNumber);
    }
}