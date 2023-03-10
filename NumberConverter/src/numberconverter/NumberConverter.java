// NumberConverter.java

package numberconverter;

import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Converter");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Convert decimal to binary");
            System.out.println("2. Convert decimal to octal");
            System.out.println("3. Convert decimal to hexadecimal");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            if (option == 1 || option == 2 || option == 3) {
                DecimalNumberConverter decimalNumberConverter = new DecimalNumberConverter();

                decimalNumberConverter.setInput();

                switch (option) {
                    case 1:
                        System.out.println(decimalNumberConverter.getDecimalNumber() + " in binary: " + decimalNumberConverter.toBinary());
                        break;
                    case 2:
                        System.out.println(decimalNumberConverter.getDecimalNumber() + " in octal: " + decimalNumberConverter.toOctal());
                        break;
                    case 3:
                        System.out.println(decimalNumberConverter.getDecimalNumber() + " in hexadecimal: " + decimalNumberConverter.toHexadecimal());
                        break;
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using Number Converter.");

        scanner.close();
    }
}
