import java.util.Scanner;
class pp1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the rws and coulumn ");
		int n=sc.nextInt();
for(int i=1;i<=n;i++){
	for(int j=n;j>=i;j--){
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
	
		System.out.print(i+" ");
	
	}
	
	System.out.println();
}

}	
}