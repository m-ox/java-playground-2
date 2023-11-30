package Basics;

public class Classes {
    String fruit = "orange";

    public static void main(String[] args) {
        Classes myFruit = new Classes();
        System.out.println(myFruit.fruit);

        myFruit.fruit = "apple";
        System.out.println(myFruit.fruit);
    }
}
