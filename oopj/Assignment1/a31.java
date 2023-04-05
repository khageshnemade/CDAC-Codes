import java.util.Scanner;

public class a31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int num = Integer.parseInt(input);
            System.out.println("The number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input + " is not a number.");
        }
    }
}
