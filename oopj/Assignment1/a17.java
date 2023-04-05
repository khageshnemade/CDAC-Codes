public class a17 {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(12345);
        
        byte b = integer.byteValue();
        short s = integer.shortValue();
        int i = integer.intValue();
        long l = integer.longValue();
        float f = integer.floatValue();
        double d = integer.doubleValue();
        
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
    }
}

