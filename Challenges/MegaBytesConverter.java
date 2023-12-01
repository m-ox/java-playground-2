package Challenges;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
         int megabytes = kilobytes / 1024;
            int remainder = kilobytes % 1024;
            String res = String.format("%s KB = %s MB and %s KB", kilobytes, megabytes, remainder);
            System.out.println(res);   
        }
    }
}
