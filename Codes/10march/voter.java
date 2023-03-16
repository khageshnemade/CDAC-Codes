import java.util.Scanner;
class voter{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
System.out.println("Enter your age, nationality, vid(YES or NO)");
int a= sc.nextInt();
sc.nextLine();
String nation=sc.nextLine();
String vid =sc.nextLine();

System.out.println("vid="+vid);
System.out.println("age="+a);
System.out.println("nationality="+nation);
if (nation.equals("indian")){
if(a>18&&vid.equals("yes")){System.out.println("you are eligible to voting");}
else{System.out.println("you are not eligible to voting");
}}
else{System.out.println("you are not eligible to voting");}
}}