package com.epam.OOP;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal dog = new Dog();

        // Returns extended sentence of the Bird object, not the Animal or Dog.
        String birdDescription = bird.getDescription();
        // Return extended sentence of the Dog object, not the Animal or Dog;
        String dogDescription = dog.getDescription();

        // Prints:
        // This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.
        System.out.println(birdDescription);

        // Prints:
        // This animal is mostly brown. It has 4 paws and a fur. Moreover, it can bark and bite.
        System.out.println(dogDescription);

        /* This concept is called polymorphism and is a powerful technique in Java.
        * It means that an object to take on multiple forms, allowing a
        * single entity to behave differently based on the context. */
    }
}
