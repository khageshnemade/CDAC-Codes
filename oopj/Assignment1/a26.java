public class a26 {
    public static void main(String[] args) {
        float num1 = 3.14f;
        float num2 = 2.71f;

        // Find the minimum number
        float min = Float.min(num1, num2);
        System.out.println("Minimum number: " + min);

        // Find the maximum number
        float max = Float.max(num1, num2);
        System.out.println("Maximum number: " + max);

        // Add two float numbers
        float sum = Float.sum(num1, num2);
        System.out.println("Sum of two numbers: " + sum);
    }
}


