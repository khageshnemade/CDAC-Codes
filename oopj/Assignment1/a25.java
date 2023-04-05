public class a25 {
    public static void main(String[] args) {
        Float numFloat = 3.14f;

        // Convert Float to byte
        byte numByte = numFloat.byteValue();
        System.out.println("Float as byte: " + numByte);

        // Convert Float to short
        short numShort = numFloat.shortValue();
        System.out.println("Float as short: " + numShort);

        // Convert Float to int
        int numInt = numFloat.intValue();
        System.out.println("Float as int: " + numInt);

        // Convert Float to long
        long numLong = numFloat.longValue();
        System.out.println("Float as long: " + numLong);

        // Convert Float to float
        float numFloat2 = numFloat.floatValue();
        System.out.println("Float as float: " + numFloat2);

        // Convert Float to double
        double numDouble = numFloat.doubleValue();
        System.out.println("Float as double: " + numDouble);
    }
}

