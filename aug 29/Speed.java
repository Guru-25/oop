import java.util.*;

class Speed {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("distance in meters: ");
        float distance = s.nextFloat();
        System.out.print("hour: ");
        float hour = s.nextFloat();
        System.out.print("minutes: ");
        float minutes = s.nextFloat();
        System.out.print("seconds: ");
        float seconds = s.nextFloat();
        double meters = (double) distance / ((hour * 60 * 60) + (minutes * 60) + seconds);
        double km = (double) (distance/1000) / (hour + (minutes / 60) + (seconds / (60 * 60)));
        double miles = (double) (distance/1609) / (hour + (minutes / 60) + (seconds / (60 * 60)));
        System.out.printf("Your speed in meters per second is %.8f\n", meters);
        System.out.printf("Your speed in km/h is %.8f\n", km);
        System.out.printf("Your speed in miles/h %.8f\n", miles);
    }
}