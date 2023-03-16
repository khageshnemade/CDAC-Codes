import java.util.Scanner;
class ternary{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int c= n1>n2 ? n1+n2 : n1-n2;
		System.out.println("The outcome is "+c);
		
	}
}
