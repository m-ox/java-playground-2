package Basics;
public class Variables {
    public static void main(String[] args) {
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        int myNumber = 123;
        double myDouble = myNumber;
        System.out.println(myDouble);
      }  
}
