package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    /**
     * Prints number of days in console on the certain year and month.
     * @param year
     * @param month
     */
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        YearMonth yearMonth = YearMonth.of(year, month);
        System.out.println(yearMonth.lengthOfMonth());
    }

}
