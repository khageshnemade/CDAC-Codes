import java.util.Scanner;
class maxmin1{
	public static void main(String args[]){
		Scanner ma = new Scanner(System.in);
		System.out.println("ENter three numbers to check ");
		int n1=ma.nextInt();
	int n2=ma.nextInt();
	int n3=ma.nextInt();
	int n4=ma.nextInt();	
	  int max = (n1 > n2 && n1 > n3 && n1 > n4) ?
               n1 : ((n2 > n3 && n2 > n4) ?
               n2 : (n3 > n4 ? n3 : n4));
	int min=(n1<n2&&n1<n3&&n1<n4)?n1:((n2<n3&&n2<n4)?n2:(n3<n4?n3:n4));
	
	System.out.println("Smallest number is "+min);
	System.out.println("largest number is "+max);
	
	}
	
}