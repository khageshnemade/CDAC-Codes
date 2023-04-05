public class a33 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide an integer, a float, and a double value as arguments.");
            System.exit(0);
        }

        int intVal = Integer.parseInt(args[0]);
        float floatVal = Float.parseFloat(args[1]);
        double doubleVal = Double.parseDouble(args[2]);

        System.out.println("Performing arithmetic operations on the values...");
        System.out.println("Addition: " + (intVal + floatVal + doubleVal));
        System.out.println("Subtraction: " + (intVal - floatVal - doubleVal));
        System.out.println("Multiplication: " + (intVal * floatVal * doubleVal));
        System.out.println("Division: " + (intVal / floatVal / doubleVal));
    

    }
}
