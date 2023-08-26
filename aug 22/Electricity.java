import java.util.*;

class Electricity {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the units: ");
        int units = s.nextInt();
        int price = 0;

        if (units <= 100) {
            price = units * 0;
        } else if (units <= 200) {
            price = (units - 100) * 5;
        } else {
            price = (100 * 0) + (100 * 5) + (units - 200) * 10;
        }

        System.out.println("total bill amount: $" + price);
    }
}
