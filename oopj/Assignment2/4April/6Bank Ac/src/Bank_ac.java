import java.util.Scanner;
import java.util.Random;
class Bank_ac{
    Scanner sc=new Scanner(System.in);
    Random a= new Random();
    private String acholdername;
    private int acnumber;
private double acbal;
public void newAC( ){
    System.out.println("Enter ac Holder name : ");
    this.acholdername =sc.nextLine();
    this.acbal=0;   
    this.acnumber=Math.abs(a.nextInt());
}
public  void depositMoney(){
    System.out.println("enter he account number and the amount to be deposited.");
sc.nextInt();this.acbal+=sc.nextDouble();
System.out.println("successfully deposited ");
}
public void  withdrawMoney(){
    System.out.println("enter the account number and the amount to be withdrawn");
    int a=sc.nextInt();
this.acbal-=sc.nextDouble();
    System.out.println("successfully withdrawn"+a+"amount");
}
public  void displayAcBal(){
    System.out.println("enter the account number");
    int a=sc.nextInt();
    System.out.println("your ac balance is "+this.acbal);
}
public  void diplayAllDetails(){
    System.out.println("enter the account Holder name");
    this.acholdername=sc.nextLine();System.out.println("your bank details are");
    System.out.printf("Ac number: %d\nac holder name: %s\nac balance : %d\n",this.acnumber,this.acholdername,this.acbal);
}
}
class Program{
    public static void main(String[] args) {
        Bank_ac b=new Bank_ac();
        
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display account balance");
            System.out.println("5. Display account holder's information");
            System.out.println("6. Exit");  
             Scanner sc=new Scanner(System.in);int option = sc.nextInt();

         

            switch (option) {
                case 1:
                   b.newAC();
                    break;
                case 2:
                    b.depositMoney();
                    break;
                case 3:
                    b.withdrawMoney();
                    break;
                case 4:
                    b.displayAcBal();
                    break;
                case 5:
                   b.diplayAllDetails();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option selected.");
                    
                   
            }System.out.println("Enter 1 to menu 0 to exit"); if(sc.nextInt()==0)break;else continue;}
    }
  
}