import java.util.*;

class Roots {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter value of a: ");
        float a = s.nextFloat();
        System.out.print("enter value of b: ");
        float b = s.nextFloat();
        System.out.print("enter value of c: ");
        float c = s.nextFloat();

        double x = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double y = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("The roots are " + x + " and " + y);
    }
}