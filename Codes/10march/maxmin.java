import java.util.Scanner;
 public class maxmin{
	public static void main(String args[]){
		Scanner ma = new Scanner(System.in);
		System.out.println("ENter three numbers to check ");
		int a=ma.nextInt();
	int b=ma.nextInt();
	int c=ma.nextInt();
	if(a>b&&a>c){
		System.out.println("Max="+a);
		if(b<c){
			System.out.println("Min="+b);
		}
		}
	else if(b>a&&b>c){
		System.out.println("Max="+b);
		if(a<c){
			System.out.println("Min="+a);
		}
	}
			else if(c>b&&c>a){
				System.out.println("Max="+c);
				if(b<a){
					System.out.println("Min="+b);
				}else{System.out.println("Min="+a);}
				
			}
	}
	
}