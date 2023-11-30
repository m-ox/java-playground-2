package Basics;
public class Strings {
    public static void main(String[] args) {
        String text = "good morning starshine";
        String text2 = " the \"world\" says hello";
        System.out.println(text.toUpperCase());
        System.out.println(text.indexOf("o"));
        System.out.println(text + text2);

        String[] textArr = {"kitty", "cat"};
        int[] numArr = {1, 2 ,3};
        System.out.println(textArr[1] + numArr[1]);
    }
}
