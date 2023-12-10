import java.util.*;

class Strong {
    public static int fact(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        
        int num = s.nextInt();
        int orgNum = num;
        int sum = 0;
        while(orgNum != 0) {
            int rem = orgNum % 10;
            sum = sum + fact(rem);
            orgNum = orgNum / 10;
        }
        if(sum == num) {
            System.out.println("the number " + num + " is a strong number");
        }
        else {
            System.out.println("the number " + num + " is not a strong number");
        }
    }
}