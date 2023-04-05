 public class a21 {
    public static void main(String[] args) {
        Long myLong = Long.valueOf(123456789L);
        
        // Convert Long to byte
        byte myByte = myLong.byteValue();
        System.out.println("Byte value: " + myByte);
        
        // Convert Long to short
        short myShort = myLong.shortValue();
        System.out.println("Short value: " + myShort);
        
        // Convert Long to int
        int myInt = myLong.intValue();
        System.out.println("Int value: " + myInt);
        
        // Convert Long to long (no conversion needed)
        long myLong2 = myLong.longValue();
        System.out.println("Long value: " + myLong2);
        
        // Convert Long to float
        float myFloat = myLong.floatValue();
        System.out.println("Float value: " + myFloat);
        
        // Convert Long to double
        double myDouble = myLong.doubleValue();
        System.out.println("Double value: " + myDouble);
    }
}
