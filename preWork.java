package edu.rahbjee.prework;

import java.util.Scanner;

public class preWork {
	public static void main(String[] args) {
		// Create the Scanner object 
		Scanner input = new Scanner(System.in);
		// Output the prompt
		System.out.println("Enter a number you would like reversed: ");
		// Wait for the user to enter an integer & assign to the integer variable "original"
		int original = input.nextInt();
		// Initialize the reversed integer variable
		int reverse = 0;
		// Create a while loop to cycle through each digit
		while(original != 0) {
			// Multiply by 10 to change digits place &
			// Add the last digit of the input number to the reverse number 
			reverse = (reverse*10) + (original%10);
			//Divide original by 10 to move to a higher digits place
			original = original/10;
		}
		System.out.println("The reverse of the inputted number is: " + reverse);
	}
}