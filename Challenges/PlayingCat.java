package Challenges;

public class PlayingCat {
    // laughs in leet golf code
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxValue = summer ? 45 : 35;
        return temperature >= 25 && temperature <= maxValue;
    }
}
