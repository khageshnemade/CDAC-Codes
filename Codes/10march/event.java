import java.util.Scanner;
class event{
		public static void main(String args[]){
		Scanner ma = new Scanner(System.in);
		System.err.println("Enter the nuumber is");
		int a= ma.nextInt();
	
		boolean b =a%2==0? true :false;
		if(b==true){
		System.out.println("the number is even ");}else{
				System.out.println("the number is odd");
}}}