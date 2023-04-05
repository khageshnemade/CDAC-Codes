import java.util.Scanner;

/*a. title: A string field to store the title of the book. 
b. author: A string field to store the name of the author of the book. 
c. publisher: A string field to store the name of the publisher of the book. 
d. isbn: A string field to store the ISBN number of the book. 
e. year: An integer field to store the year in which the book was published. 
f. price: A double field to store the price of the book. 
g. quantity: An integer field to store the quantity of the book in the inventory.  */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
    
/*a. Constructors, 
b. Getter & setter methods 
c. Business Logic methods 
I. increaseQuantity(int quantity ): A method to increase the quantity of
the book in the inventory by the specified amount. 
II. decreaseQuantity(int quantity): A method to decrease the quantity of
the book in the inventory by the specified amount. 
III. getInventoryValue(): A method to calculate the total value of the 
inventory of the book, which is the product of the price and the 
quantity of the book.  */
    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    public double getInventoryValue() {
        return price * quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /*I. increaseQuantity(int quantity ): A method to increase the quantity of 
the book in the inventory by the specified amount. 
II. decreaseQuantity(int quantity): A method to decrease the quantity of 
the book in the inventory by the specified amount. 
III. getInventoryValue(): A method to calculate the total value of the 
inventory of the book, which is the product of the price and the 
quantity of the book.  */
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
    
    public void decreaseQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Error: Not enough books in inventory.");
        }
    }
    
    
}
class Book1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     Book b=new Book("Khagesh", "Khagesh", "KN", "645892357832589", 1990, 559.0, 50);
     
  int input;
     while(true){
        System.out.println("Enter your choice");
        System.out.println("0 to exit");
        System.out.println("1 to increase quantity and number of quantity ");
        System.out.println("2 to decrease quqntity and number of quantity ");
        System.out.println("3 to print inventory value");
        input=sc.nextInt();
     
    switch(input){
        case 0:System.exit(0);
        break;
        case 1:b.increaseQuantity(sc.nextInt());
        break;
        case 2:b.decreaseQuantity(sc.nextInt());
        break;
        case 3:System.out.printf("a.Title : %s, \nb. author: %s,\n c. publisher : %s,\n d. isbn: %s , \ne. year ; %d, \n g. quantity: %d\n",b.getTitle(), b.getAuthor(), b.getPublisher(), b.getIsbn(), b.getYear(),  b.getQuantity()); 
        break;
     default :
     System.out.println("Please enter valid input");
    }
   } }
}
