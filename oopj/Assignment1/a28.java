public class a28 {
    public static void main(String[] args) {
        // Double value to String
        double num1 = 3.14159;
        String str1 = Double.toString(num1);
        System.out.println("Double value to String: " + str1);

        // Double value to Double instance
        double num2 = 2.71828;
        Double doubleObj = Double.valueOf(num2);
        System.out.println("Double value to Double instance: " + doubleObj);

        // String to Double instance
        String str2 = "1.23456";
        Double doubleObj2 = Double.valueOf(str2);
        System.out.println("String to Double instance: " + doubleObj2);

        // Double value to binary, octal, and hexadecimal
        double num3 = 10.5;
        String binary = Long.toBinaryString(Double.doubleToLongBits(num3));
        System.out.println("Double value to binary: " + binary);

        String octal = Long.toOctalString(Double.doubleToLongBits(num3));
        System.out.println("Double value to octal: " + octal);

        String hex = Long.toHexString(Double.doubleToLongBits(num3));
        System.out.println("Double value to hexadecimal: " + hex);
    }
}
