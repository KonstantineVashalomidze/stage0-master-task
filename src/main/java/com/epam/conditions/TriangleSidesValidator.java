package com.epam.conditions;

public class TriangleSidesValidator {

    /**
     * Prints weather triangle with given sides exist in console.
     * @param firstSide
     * @param secondSide
     * @param thirdSide
     */
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
            return;
        }
        System.out.println("it's not a triangle");
    }

    /**
     * Validates triangle with given sides.
     * @param firstSide
     * @param secondSide
     * @param thirdSide
     * @return true if valid, false otherwisel
     */
    private boolean isValidTriangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            return false;
        }
        return firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide;
    }

}
