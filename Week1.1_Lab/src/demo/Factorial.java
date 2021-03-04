package demo;

import java.util.Scanner;

/*
 * Author: Vinay
 * Week 1/1  Example: Write a console app to print factorial of 5.
 */

public class Factorial {

	public static void main(String[] args) {
	 //input the number to calculate factorial  
	 System.out.println("Enter a number to find a factorial value");
	 
	 //Scanner object to get a user input
	 Scanner scan = new Scanner(System.in); 
	 int number = scan.nextInt();
	 
     //calling a recursion method  
	 long fact = calculateFactorial(number);
	 
	 //print the results of factorial value
     System.out.println("Factorial of " + number + " is " + fact);
	}//end of main
	
	//recursive method to calculate factorial numbers
	public static long calculateFactorial(int num)
    {
        if (num >= 1)
            return num * calculateFactorial(num - 1);
        else
            return 1;
    }//end 

}//end of class
