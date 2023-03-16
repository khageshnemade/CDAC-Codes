import java.util.Scanner;
class gcd {
	public static void main(String[] args){
		int a, b,g=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers to find out Gcd");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=2;i<=a;i++){
			if(a%i==0&&b%i==0)
		g=i;}
System.out.println("GCD is "+g);	
	}
	
}