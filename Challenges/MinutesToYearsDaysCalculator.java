package Challenges;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60L;
        long days = hours / 24L;
        long years = days / 365L;
        long daysLeft = days % 365L;
        
        System.out.println(minutes + " min = " + years + " y and " + daysLeft + " d");
    }
}
