package Challenges;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double integer, double integer2) {
        long firstRounded = (long) (integer * 1000);
        long secondRounded = (long) (integer2* 1000);
        return firstRounded == secondRounded;
    }
}
