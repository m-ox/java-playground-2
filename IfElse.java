public class IfElse {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int num3 = 3;
        if (num2 % num3 == 0) {
            System.out.println("No remainder");
        } else if (num1 % num3 == 2) {
            System.out.println("Remainder of 2");
        } else {
            System.out.println("Nothing else to compare");
        }
    }
}
