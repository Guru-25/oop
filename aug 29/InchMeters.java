import java.util.*;

public class InchMeters {
    public static void main(String args[]) {
        float inch, meters;
        Scanner s = new Scanner(System.in);
        System.out.print("enter inch: ");
        inch = s.nextFloat();
        System.out.println("meters is: " + inch * 0.0254f);
        System.out.print("enter meter: ");
        meters = s.nextFloat();
        System.out.println("inch is: " + meters / 0.0254f);
    }
}