import java.util.Scanner;

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount() {
        if(unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        }
        else if(unitsConsumed > 100 && unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        }
        else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    public void displayBillDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs." + billAmount);
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int choice;
              do{ System.out.println("Enter name and units consumed"); ElectricityBill bill = new ElectricityBill(sc.nextLine(), sc.nextInt());
        bill.calculateBillAmount();
        bill.displayBillDetails();
    System.out.println("Enter 0 to exit 1  to calculate again ");choice=sc.nextInt();sc.nextLine();}while(choice!=0);
    sc.close();}
}
