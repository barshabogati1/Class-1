package day14;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("enter the size of an array");
     int size = input.nextInt();
     // To take input
     int []arr = new int[size];
     for ( int i =0; i < arr.length; i++) {
    	 System.out.println("Enter element: ");
    	 arr[i]= input.nextInt();
     }
     // to print and sum element of an array
     
     int sum =0;
     for ( int i =0; i < arr.length; i++) {
    	 System.out.println(i);
    	 sum = sum +arr[i];
     }
     System.out.println(" sum of array element is "+ sum);
     input.close();
	}
	
}
