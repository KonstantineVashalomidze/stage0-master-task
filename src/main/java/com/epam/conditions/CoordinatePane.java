package com.epam.conditions;

public class CoordinatePane {

    /**
     * Consume 2 integers from method args as data of a coordinate point in a XY coordinate system
     * and determine in which quadrant the coordinate point
     * lies(beginning with top right:"first", "second", "third", "fourth", "zero")
     * @param x
     * @param y
     */
    public void printQuadrant(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("zero");
            return;
        }

        int quadrant = Integer.signum(x) + Integer.signum(y) * 2;
        switch (quadrant) {
            case 3 -> System.out.println("first");   // (+1) + (+1)*2 = 3
            case 1 -> System.out.println("second");  // (-1) + (+1)*2 = 1
            case -3 -> System.out.println("third");  // (-1) + (-1)*2 = -3
            case -1 -> System.out.println("fourth"); // (+1) + (-1)*2 = -1
        }
    }
}

