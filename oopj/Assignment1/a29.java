public class a29 {
    public static void main(String[] args) {
        Double num = 3.14159;
        byte byteNum = num.byteValue();
        short shortNum = num.shortValue();
        int intNum = num.intValue();
        long longNum = num.longValue();
        float floatNum = num.floatValue();
        double doubleNum = num.doubleValue();

        System.out.println("Double instance: " + num);
        System.out.println("Byte: " + byteNum);
        System.out.println("Short: " + shortNum);
        System.out.println("Int: " + intNum);
        System.out.println("Long: " + longNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Double: " + doubleNum);
    }
}
