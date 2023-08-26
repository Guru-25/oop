import java.util.*;

class SineCalculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the value of x in radians: ");
        double x = s.nextDouble();

        System.out.print("enter a positive integer n: ");
        int n = s.nextInt();

        double sinValue = 0;
        int sign = 1;
        double term = x;

        for (int i = 1; i <= n; i++) {
            sinValue += sign * term / factorial(2 * i - 1);
            sign *= -1;
            term *= x * x;
        }

        System.out.println("sin(" + x + ") = " + sinValue);
    }

    public static double factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
