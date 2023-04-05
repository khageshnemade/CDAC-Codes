public class a20 {
    public static void main(String[] args) {
        long num = 123456789L;

        // Convert a long value to a String
        String numStr = Long.toString(num);
        System.out.println("The long value " + num + " converted to a String is: " + numStr);

        // Convert a long value to a Long instance
        Long numObj = Long.valueOf(num);
        System.out.println("The long value " + num + " converted to a Long instance is: " + numObj);

        // Convert a String instance to a Long instance
        String numStr2 = "123456789";
        Long numObj2 = Long.valueOf(numStr2);
        System.out.println("The String value " + numStr2 + " converted to a Long instance is: " + numObj2);

        // Convert a long value to binary, octal, and hexadecimal Strings
        String binaryStr = Long.toBinaryString(num);
        String octalStr = Long.toOctalString(num);
        String hexStr = Long.toHexString(num);
        System.out.println("The long value " + num + " converted to binary: " + binaryStr);
        System.out.println("The long value " + num + " converted to octal: " + octalStr);
        System.out.println("The long value " + num + " converted to hexadecimal: " + hexStr);
    }
}
