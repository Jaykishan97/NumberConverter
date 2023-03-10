// DecimalNumberConverter.java

package numberconverter;

import java.util.Scanner;

public class DecimalNumberConverter {
    private int decimalNumber;

    public DecimalNumberConverter() {
        this.decimalNumber = 0;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public void setDecimalNumber(int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public void setInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        this.decimalNumber = scanner.nextInt();
    }

    public String toBinary() {
        return Integer.toBinaryString(decimalNumber);
    }

    public String toOctal() {
        return Integer.toOctalString(decimalNumber);
    }

    public String toHexadecimal() {
        return Integer.toHexString(decimalNumber);
    }
}
