package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {

        // NOTE: This won't actually swap anything outside this function since first and second are primitives.
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;


        System.out.println(first);
        System.out.println(second);
    }


}
