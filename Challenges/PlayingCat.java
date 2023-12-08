package Challenges;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxValue = summer ? 45 : 35;
        if (temperature >= 25 && temperature <= maxValue) {
            return true;
        } else {
            return false;
        }
    }
}
