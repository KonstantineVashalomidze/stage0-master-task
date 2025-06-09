package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        if (numberOfPaws < 0) throw new IllegalArgumentException("Number of paws shouldn't be negative.");
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    /**
     * Describes animal with color, number of paw(s) and if it has fur.
     * @return Description of animal.
     */
    public String getDescription() {
        return "This animal is mostly " +
                color +
                ". It has " +
                numberOfPaws +
                " paw" +
                (numberOfPaws > 1 ? 's' : "") +
                " and " +
                (hasFur ? 'a' : "no") +
                " fur.";
    }
}
