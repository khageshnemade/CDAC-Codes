import java.util.Scanner;
class pattern15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the rws and coulumn ");
		int n=sc.nextInt();
for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		if(j==1||j==i)
		System.out.print("*");
	else System.out.print(" ");
	}
	
	System.out.println();
}
for(int j=0;j<=n;j++)System.out.print("*");
}	
}