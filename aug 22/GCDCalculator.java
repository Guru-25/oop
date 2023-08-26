import java.util.*;

class GCDCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("enter the second number: ");
        int num2 = s.nextInt();

        int gcd = calculateGCD(num1, num2);

        System.out.println("gcd of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}