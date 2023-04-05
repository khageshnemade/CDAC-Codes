
import java.util.Scanner;
class BMICalculator{double height;
    double weight;
BMICalculator(double h, double w){
this.height=h;
this.weight=w;}

    double getWeight(){return weight;} void setWeight(double w){this.weight=w;}
    double getHeight(){return height;}void setHeight(double h){this.height=h;}
   //method to calculate BMI
      double calculateBMI(){return (weight/(height*height));}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your heigth in meter and weight in kg");
   
BMICalculator bm= new BMICalculator(sc.nextDouble(),sc.nextDouble());
double bmi= bm.calculateBMI();
System.out.println("Your BMI is : "+bmi);
bm.setHeight(1.5);bm.setWeight(66);
double Obmi= bm.calculateBMI();
System.out.println("BMI after override by setter method "+Obmi+"height:"+bm.getHeight()+"Weight:"+bm.getWeight());
sc.close();
}
}