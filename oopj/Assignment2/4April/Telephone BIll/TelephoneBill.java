import java.util.Scanner;

public class TelephoneBill {
    private String customerName;
    private String phoneNumber;
    private int numCalls;
    private int callDuration;
    
    // Constructor
    public TelephoneBill(String name, String phone, int calls, int duration) {
        this.customerName = name;
        this.phoneNumber = phone;
        this.numCalls = calls;
        this.callDuration = duration;
    }
    
    // Getters and setters
    public String getCustomerName() {
        return this.customerName;
    }
    
      
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
      
    public int getNumCalls() {
        return this.numCalls;
    }
        
    public int getCallDuration() {
        return this.callDuration;
    }
    
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }
    public void setNumCalls(int calls) {
        this.numCalls = calls;
    } 
    public void setCallDuration(int duration) {
        this.callDuration = duration;
    }
    
    // Business logic methods
    public double calculateBill() {
       double bill;
       if(numCalls<=100){
        bill=numCalls*.5;
       }else{
        bill=100*.5+((numCalls-100)*.25);
       }
       if(bill>=10)
        return bill;
        else return 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do{// Get user inputs
           
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        
        System.out.print("Enter number of calls made: ");
        int calls = scanner.nextInt();
        
        System.out.print("Enter total duration of calls (in minutes): ");
        int duration = scanner.nextInt();
        TelephoneBill bill = new TelephoneBill(name, phone, calls, duration);
        
       // Calculate bill and display result
      
        double amount = bill.calculateBill();
        System.out.printf("Customer: %s\nPhone: %s\nNumber of calls: %d\nDuration: %d minutes\nBill: $%.2f\n",
                bill.getCustomerName(), bill.getPhoneNumber(), bill.getNumCalls(), bill.getCallDuration(), amount);
                System.out.println("Enter 1 to calculate again or 0 to exit");
         choice = scanner.nextInt();
         scanner.nextLine();
     }while(choice !=0);
     scanner.close();
    }
}
