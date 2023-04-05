public class a11 {
    public static void main(String[] args) {
        char a=args[0].charAt(0);
              /*Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point. */
                boolean b1 = Character.isDigit(a);  
               System.out.println(b1);
                if(b1)
                    System.out.println("Digit :"+a);
                    else {System.out.println("Letter : "+a);
                    boolean b2 = Character.isLowerCase(a);
                    if(b2){
                        System.out.println("in uppercase " +Character.toUpperCase(a)+"  Codepoint :"+(int)a);
                    }  else
                    System.out.println("in lowercase  "+Character.toLowerCase(a)+"  Codepoint :"+(int)a);
                }
    }
}
