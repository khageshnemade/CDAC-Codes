public class a27 {
    public static void main(String[] args) {
        // Number of bits used to represent a double value
        int bits = Double.SIZE;
        System.out.println("Number of bits used: " + bits);

        // Number of bytes used to represent a double value
        int bytes = Double.BYTES;
        System.out.println("Number of bytes used: " + bytes);

        // Minimum value of a double
        double min = Double.MIN_VALUE;
        System.out.println("Minimum value: " + min);

        // Maximum value of a double
        double max = Double.MAX_VALUE;
        System.out.println("Maximum value: " + max);
    }
}
