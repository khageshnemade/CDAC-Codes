public class a23 {
    public static void main(String[] args) {
        float num = 3.14f;

        // Number of bits used to represent float value
        int bits = Float.SIZE;
        System.out.println("Number of bits used to represent a float value: " + bits);

        // Number of bytes used to represent float value
        int bytes = Float.BYTES;
        System.out.println("Number of bytes used to represent a float value: " + bytes);

        // Minimum value of a float
        float min = Float.MIN_VALUE;
        System.out.println("Minimum value of a float: " + min);

        // Maximum value of a float
        float max = Float.MAX_VALUE;
        System.out.println("Maximum value of a float: " + max);
    }
}
