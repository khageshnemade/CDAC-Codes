import java.util.Scanner;
class grade{
public static void main(String args[]){
	Scanner dc=new Scanner(System.in);
	System.out.println("enter the marks obtained by user");
	double marks=dc.nextDouble();
	System.out.println("enter the total marks ");
	double total_marks=dc.nextDouble();
	
double perc=(marks/total_marks)*100;
System.out.println("Percentage is "+perc);
	if(perc>=95){
		System.out.println("You are getting grade Distinction");
	}
else if(perc>=85){
		System.out.println("You are getting grade Firstclass");
	}	
	else if(perc>=75){
		System.out.println("You are getting grade Secondclass");
	}
		else if(perc>=65){
		System.out.println("You are getting grade Thirdclass");
	}else{
		System.out.println("You are Failed");
	}
	
}
}