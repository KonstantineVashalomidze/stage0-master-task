package com.epam.langSyntax;

public class DigitsSumCalculator {
    /**
     * Prints sum of digits of the given number.
     * @param number Containing digits to sum up.
     */
    public void calculateSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println(sum);
    }

}
