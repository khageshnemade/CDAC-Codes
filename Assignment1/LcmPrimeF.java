import java.util.Scanner;
class LcmPrimeF {
	public static void main(String[] args){
		int num1,num2,temp,i=2,j=0,k=0,l=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		temp=num1;
	int a[]=new int[10];
	int b[]=new int[10];
		System.out.println("Prime factrs of given number 1 is");
		while(temp>1){
			if(temp%i==0){a[j]=i;
			System.out.print(a[j]+",");
			j++;temp=temp/i;}else{i++;}
		}System.out.println("prime factors of num2 ");
		temp=num2;
		while(temp>1){
			if(temp%l==0){b[k]=l;
			
			System.out.print(b[k]+",");k++;
			temp=temp/l;}else{l++;}
				i=0;j=0;
				}System.out.println("The lenngth is "+a.length);System.out.println(b.length);
				//while(i<a.length){while(j<b.length){if(a[i]==b[j]){a[j]=1;}j++;}i++;}
				for(i=0;i<a.length;i++){
					for(j=0;j<b.length;j++)
					{if(a[i]==b[j]){b[j]=1;break;}}}
				int m=0,result=1;
		j=0; System.out.print("a ");
				while(j<a.length){
					
					System.out.print(" "+a[j]);
					j++;
				}			
			j=0;System.out.print("b ");
				while(j<b.length){
					
					System.out.print(" "+b[j]);
					j++;
				}
			
		
			while(m<a.length){
				if(a[m]!=0){result=result*a[m];}
				m++;
				
			}m=0;
			while(m<b.length){
				
				if(b[m]!=0){result=result*b[m];}
				m++;
			}
		System.out.println("The lcm is  " +result);
		}
		
		
	
}