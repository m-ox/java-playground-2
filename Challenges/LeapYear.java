package Challenges;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year  <= 9999) {
            boolean yearFour = year % 4 == 0;
            boolean yearHundred = year % 100 == 0;
            boolean yearFourHundred = year % 400 == 0;

            if (yearFour && !yearHundred) {
                return true;
            } else if (yearHundred && yearFourHundred) {
                return true;
            } else if (yearFourHundred) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
