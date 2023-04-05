public class a19 {
    public static void main(String[] args) {
        long num = 123456789L;

        // Find the number of bits used to represent a long value
        int numBits = Long.SIZE;
        System.out.println("Number of bits used to represent the long value " + num + " is: " + numBits);

        // Find the number of bytes used to represent a long value
        int numBytes = Long.BYTES;
        System.out.println("Number of bytes used to represent the long value " + num + " is: " + numBytes);

        // Find the minimum value of a long
        long minLong = Long.MIN_VALUE;
        System.out.println("Minimum value of a long is: " + minLong);

        // Find the maximum value of a long
        long maxLong = Long.MAX_VALUE;
        System.out.println("Maximum value of a long is: " + maxLong);
    }
}
