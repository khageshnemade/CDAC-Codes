import java.util.Scanner;
class primefactors {
	public static void main(String[] args){
		int num,temp,i=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num =sc.nextInt();
		temp=num;
		System.out.println("Prime factrs of given number is");
		while(temp>1){
			if(temp%i==0){System.out.print(i+",");
			temp=temp/i;}else{i++;}
		}

	}
	
}