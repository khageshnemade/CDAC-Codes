public class a22 {
    public static void main(String[] args) {
        long num1 = 123456789L;
        long num2 = 987654321L;
        
        // Find the minimum value of a long
        long minLong = Long.MIN_VALUE;
        System.out.println("Minimum long value: " + minLong);
        
        // Find the maximum value of a long
        long maxLong = Long.MAX_VALUE;
        System.out.println("Maximum long value: " + maxLong);
        
        // Add two long numbers using Long.sum()
        long sum = Long.sum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
