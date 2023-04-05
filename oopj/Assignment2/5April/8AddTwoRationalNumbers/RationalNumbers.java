import java.util.Scanner;

 class RationalNumbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input first rational number
        System.out.println("Enter the first rational number:");
        System.out.print("Numerator: ");
        int num1 = input.nextInt();
        System.out.print("Denominator: ");
        int denom1 = input.nextInt();
        
        // Input second rational number
        System.out.println("Enter the second rational number:");
        System.out.print("Numerator: ");
        int num2 = input.nextInt();
        System.out.print("Denominator: ");
        int denom2 = input.nextInt();
        
        // Input arithmetic operation
        System.out.print("Enter the arithmetic operation (+, -, *, /): ");
        String operator = input.next();
        
        // Perform arithmetic operation
        double resultR=0;
        int resultNum = 0;
        int resultDenom = 0;
        switch (operator) {
            case "+":
                resultNum = num1 * denom2 + num2 * denom1;
                resultDenom = denom1 * denom2;
                resultR=resultNum/resultDenom;
                break;
            case "-":
                resultNum = num1 * denom2 - num2 * denom1;
                resultDenom = denom1 * denom2;
                resultR=resultNum/resultDenom;
                break;
            case "*":
                resultNum = num1 * num2;
                resultDenom = denom1 * denom2;
                resultR=resultNum/resultDenom;
                break;
            case "/":
                resultNum = num1 * denom2;
                resultDenom = denom1 * num2;
                resultR=resultNum/resultDenom;
                break;
            default:
                System.out.println("Invalid operator.");
                System.exit(0);
        }
        
        // Reduce fraction
        int gcd = gcd(resultNum, resultDenom);
        resultNum /= gcd;
        resultDenom /= gcd;
        
        // Output result
        System.out.println("Result: " + resultNum + "/" + resultDenom);
    }
    
    // Returns the greatest common divisor of two integers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
}

