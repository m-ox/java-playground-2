package Challenges;

public class Barking {
     public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
         if (hourOfDay < 0 || hourOfDay > 23) {
             return false;
         }
         // this confirms there is barking and also verifies the hour
         return barking && (hourOfDay < 8 || hourOfDay > 22);
     }
}
