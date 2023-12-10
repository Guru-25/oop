import java.util.*;

class Duplicate {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n, i, j, flag = 0;
        System.out.print("enter no of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("enter elements: ");
        for(i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for(i = 0; i < n - 1; i++) {
            if(a[i] != a[i + 1]) {
                b[flag] = a[i];
                flag++;
            }
        }
        b[flag] = a[n - 1];
        flag++;


        System.out.println("without duplicates: ");
        for(i = 0; i < flag; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.println("with duplicates: ");
        for(i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}