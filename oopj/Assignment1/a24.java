public class a24 {
    public static void main(String[] args) {
        float num = 3.14f;

        // Convert float value to String
        String numStr = String.valueOf(num);
        System.out.println("Float value as String: " + numStr);

        // Convert float value to Float instance
        Float numFloat = Float.valueOf(num);
        System.out.println("Float value as Float instance: " + numFloat);

        // Convert String instance to Float instance
        String numStr2 = "5.678";
        Float numFloat2 = Float.parseFloat(numStr2);
        System.out.println("String instance as Float instance: " + numFloat2);

        // Convert float value to hexadecimal string
        String hexStr = Float.toHexString(num);
        System.out.println("Float value as hexadecimal string: " + hexStr);
    }
}
