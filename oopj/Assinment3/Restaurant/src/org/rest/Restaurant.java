package org.rest;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurant {
	static String arr1[]= {"dish1","dish2","dish3","dish4","dish5","dish6","dish7","dish8","dish9","dish10"};
	static double price[]= {10.0,11.2,14.5,15.5,34.5,46.4,35.3,23.5,23.4,23.424};
	
		static Scanner sc=new Scanner(System.in);
	public static int menulist() {
		System.out.println("1.View the current menu with prices ");
		System.out.println("2.Add a new dish to the menu");
		System.out.println("3.Remove a dish from the menu ");
		System.out.println("4.Modify the price of a dish on the menu");
		System.out.println("5.Exit the program");
		System.out.print("Enter your choice : ");
		return sc.nextInt();
	}
	public static void viewMenu() {
		System.out.println("Menulist%%%%%%%%%%&&&&&&&&&");
		for(int i=0;i<arr1.length;i++) {
		
				System.out.println(arr1[i]+" =======  "+price[i]);
			
		}
		System.out.println("Menulist%%%%%%%%%%&&&&&&&&&");
	}
	public static void addDish() {
	System.out.println("Enter the name of the dish and its price");
	arr1[arr1.length]=sc.next();price[price.length]=sc.nextInt();System.out.println("Successful Addition");	
	}
	public static void removeDish() {
		System.out.println("Enter the name of the dish and its price");
		arr1[arr1.length]=sc.next();price[price.length]=sc.nextInt();System.out.println("Successful Addition");	
		}
		
	
	public static void modifyPrice() {
		// TODO Auto-generated method stub
		
	} 
		
		
		
	}

