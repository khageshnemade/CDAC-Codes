public class a30 {
    public static void main(String[] args) {
        double num1 = 3.14159;
        double num2 = 2.71828;

        // Find the minimum value between two double numbers
        double minNum = Double.min(num1, num2);
        System.out.println("Minimum value: " + minNum);

        // Find the maximum value between two double numbers
        double maxNum = Double.max(num1, num2);
        System.out.println("Maximum value: " + maxNum);

        // Add two double numbers
        double sum = Double.sum(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
