package Challenges;

public class SumOddRange {
    public static boolean isOdd (int number) {
        return number % 2 == 1;
    }
    
    public static int sumOdd (int start, int end) {
        if (end >= start && (end > 0 && start > 0)) {
            int sum = 0;
            for (int num = start; num <= end; num++) {
                if (isOdd(num)) {
                    sum += num;
                }
            };
            return sum;
        } else {
            return -1;
        }
    };
}
