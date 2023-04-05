class a16{
    public static void main(String[] args) {
    //a
        int value = 12345;
String str = String.valueOf(value);
System.out.println("The String instance is: " + str);
//b
Integer instance = Integer.valueOf(value);
System.out.println("The Integer instance is: " + instance);
//c
String str1 = "12345";
Integer instance1 = Integer.valueOf(str1);
System.out.println("The Integer instance is: " + instance1);

//d
String binary = Integer.toBinaryString(value);
String octal = Integer.toOctalString(value);
String hex = Integer.toHexString(value);

System.out.println("The binary string is: " + binary);
System.out.println("The octal string is: " + octal);
System.out.println("The hexadecimal string is: " + hex);
    }
}