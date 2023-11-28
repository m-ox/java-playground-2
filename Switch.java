public class Switch {
    public static void main(String[] args) {
        int month = 5;
        String monthString = "";
        switch (month) {
            case 1:
            case 2:
            case 3:
            monthString = "January";
              break;
            case 4:
            case 5:
            monthString = "April";
              break;
          }
        System.out.println(monthString);
    }
}
