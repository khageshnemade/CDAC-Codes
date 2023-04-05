package org.array.operations;
import java.util.Arrays;
import java.util.Scanner;

public class Array {static int a[];
	
	static Scanner sc=new Scanner(System.in);
	public static void accept() {
		System.out.println("Enter the array size");
		
		a=new int [sc.nextInt()];
		System.out.print("Enter values : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	public static void display() {
		System.out.println("Array values are : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}		
	}
	public static void suma() {int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}System.out.println("Sum : "+sum);
		
	}
	public static void average() {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}System.out.println("Average : "+sum/a.length);
		
	}
	public static void largest() {int largest=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>largest)largest=a[i]; 
		}	System.out.println("Largest : "+largest);	
	}
	public static void smallest() {
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]<smallest)smallest=a[i]; 
		}System.out.println("smallest : "+smallest);		
	}		
	
	public static void sorted() {  for (int i = 0; i < a.length; i++) {
        for (int j = i; j < a.length; j++) {
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
		
		
	}}}System.out.print("Array is now sorted and result is ");
	System.out.println(Arrays.toString(a)); }}

