package com.epam.conditions;

public class SeasonDeterminer {

    /**
     * Given the number of the month ex: "1" -> "Winter" prints its season name or "Wrong month number".
     * @param monthNumber month number.
     */
    public void tellTheSeason(int monthNumber) {

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Winter");   // Dec, Jan, Feb
            case 3, 4, 5 -> System.out.println("Spring");    // Mar, Apr, May
            case 6, 7, 8 -> System.out.println("Summer");    // Jun, Jul, Aug
            case 9, 10, 11 -> System.out.println("Autumn");  // Sep, Oct, Nov
            default -> System.out.println("Wrong month number");
        }
    }

}
