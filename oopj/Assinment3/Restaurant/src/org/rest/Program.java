package org.rest;
import org.rest.Restaurant;

public class Program {
	
	public static void main(String[] args) {
	
	int choice;
	while((choice=Restaurant.menulist())!=5) {
		switch(choice) {
		case 1:Restaurant.viewMenu();
			break;
		case 2:Restaurant.addDish();
		break;
		case 3:Restaurant.removeDish();
			break;
		case 4:Restaurant.modifyPrice();
		break;
		default:System.out.println("Enter correct option");
		
		
		}
	}

}
}
