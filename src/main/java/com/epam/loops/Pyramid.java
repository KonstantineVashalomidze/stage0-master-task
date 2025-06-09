package com.epam.loops;

public class Pyramid {

    /**
     * Prints pyramid of same numbers representing vertical lines symmetrically around its height starting from 1
     * with given height length.
     * @param cathetusLength
     */
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
