package Methods;

public class Methods {
    public static void printFunc() {
        System.out.println("This is executed!");
    }

    public static void feedMe(String food, int amount) {
        if (amount > 1) {
            String res = String.format("There are %s %ss.", amount, food);
            System.out.println(res);
        } else {
            String res = String.format("There is only %s %s.", amount, food);
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        // printFunc();
        String foodString = "plum";
        String foodString2 = "orange";
        feedMe(foodString, 1);
        feedMe(foodString2, 3);
    }
}
