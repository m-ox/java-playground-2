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
    
    public static int getDaysInMonth (int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> isLeapYear(year) ? 29: 28;
                default -> -1;
            };
        }
    }
}
