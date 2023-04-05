public class a32 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Invalid");
        }
        
for(int i=0;i<args.length;i++)
System.out.print(args[i]);System.out.println();
        String fullName = String.join("_", args);
        System.out.println("Your full name is: " + fullName);
    }
}
