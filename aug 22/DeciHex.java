import java.util.Scanner;
import java.util.Scanner;
public class DeciHex {
public static void main(String[] args) {
int choice;
int num, dig;
String res = "";
char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
Scanner scanner = new Scanner(System.in);
System.out.println("Choose the conversion:");
System.out.println("1) Hexadecimal to Decimal");
System.out.println("2) Decimal to Hexadecimal");
choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.println("Hexadecimal to Decimal");
System.out.print("Enter the hexadecimal number: ");
String hexInput = scanner.next();
num = Integer.parseInt(hexInput, 16);
System.out.println("Number in decimal: " + num);
break;
case 2:
System.out.println("Decimal to Hexadecimal");
System.out.print("Enter the decimal number: ");
num = scanner.nextInt();
while (num > 0) {
dig = num % 16;
res = hex[dig] + res;
num = num / 16;
}
System.out.println("Number in hexadecimal: " + res);
break;
default:
System.out.println("Invalid choice");
} } }
