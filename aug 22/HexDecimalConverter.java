import java.util.*;

class HexDecimalConverter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("1 for hexadecimal to decimal\n2 for decimal to hexadecimal\nenter a choice: ");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.print("enter hexadecimal number: ");
                String hexInput = s.next();

                int decimalValue = 0;
                String digits = "0123456789ABCDEF";
                hexInput = hexInput.toUpperCase();

                for (int i = 0; i < hexInput.length(); i++) {
                    char c = hexInput.charAt(i);
                    int digit = digits.indexOf(c);
                    decimalValue = decimalValue * 16 + digit;
                }

                System.out.println("decimal equivalent: " + decimalValue);
                break;

            case 2:
                System.out.print("enter a decimal number: ");
                int decimalInput = s.nextInt();

                StringBuilder hexValue = new StringBuilder();
                String hexDigits = "0123456789ABCDEF";

                while (decimalInput > 0) {
                    int digit = decimalInput % 16;
                    hexValue.insert(0, hexDigits.charAt(digit));
                    decimalInput = decimalInput / 16;
                }

                System.out.println("hexadecimal equivalent: " + hexValue.toString());
                break;

            default:
                System.out.println("invalid choice");
                break;
        }
    }
}