public class a6a {
    public static void main1(String[] args) {
        
      
        System.out.println("Size in bits  "+Byte.BYTES);  System.out.println("Sixe in bits "+Byte.SIZE);
       System.out.println(" max value: " +Byte.MIN_VALUE);
       System.out.println(" min value: " +Byte.MAX_VALUE);
      
    }
    public static void main2(String[] args) {
        byte res = 87;
        
      // byte to string
      System.out.println(Byte.toString(res));
    }
    public static void main(String[] args) {
        byte res = 87;
         // byte to Byte instance
        Byte b= new Byte(res);
      System.out.println(b);
    }
    public static void main4(String[] args) {
        String res = new String("87");
         // String to Byte instance
        Byte b= Byte.parseByte(res);
      System.out.println(b);
    }
}
