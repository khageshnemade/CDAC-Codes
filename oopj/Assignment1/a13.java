public class a13 {
    public static void main(String[] args) {
        short num = 12345;
        String str = Short.toString(num);
        System.out.println("The string representation of short " + " is " + str + ".");
   
        Short instance = Short.valueOf(num);
        System.out.println("The Short instance is: " + instance);
        String str1 = "12345";
        System.out.println("The String instance is: " + str1);
        Short instance1 = Short.valueOf(str1);
        System.out.println("The Short instance is: " + instance1);
    }
}
