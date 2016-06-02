package edu.rahbjee.prework;

import java.util.Scanner;

public class PreWorkpt2 {
	

	public static void main(String[] args) {
		// Prompt asking the user to enter in two dates (given format) starting with the latter date.
		System.out.println("Please enter in two dates (yyyy-MM-dd format) entering the latter date first: ");
		Scanner input = new Scanner(System.in);
		// First input is assigned to String "one" while the second input is assigned to String "two" 
		String one = input.nextLine();
		String two = input.nextLine();
		// Separates the entered strings into a String array containing substrings of the year, month, day
		String [] firstdate = one.split("-");
		String [] seconddate = two.split("-");
		//The next lines convert the substrings into proper integers that java can use to calculate differences
		int year1 = Integer.parseInt(firstdate[0]);
		int month1 = Integer.parseInt(firstdate[1]);
		int day1 = Integer.parseInt(firstdate[2]);
		int year2 = Integer.parseInt(seconddate[0]);
		int month2 = Integer.parseInt(seconddate[1]);
		int day2 = Integer.parseInt(seconddate[2]);
		// Differences are calculated on the premise that the first date entered comes after the second input (as requested in prompt)
		int yeardiff = year1 - year2;
		int monthdiff;
		int daydiff;
		// If loops catch certain conditions & adjust the difference calculations accordingly
		if (month2>month1){
			yeardiff = yeardiff - 1;
			monthdiff = (month1 + 12) - month2;
		} else {
			monthdiff = month1 - month2;
		}
		if (day2>day1){
			if (month1 == 2){
				monthdiff = monthdiff - 1;
				daydiff = (day1 + 28) - day2;
			}else if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12) {
				monthdiff = monthdiff - 1;
				daydiff = (day1 + 31) - day2;
			} else {
				monthdiff = monthdiff - 1;
				daydiff = (day1 + 30) - day2;
			}
		} else {
			daydiff = day1 - day2;
		}
		// Accounting for the presence of a leap year & whether that will affect our calculations.
		if (year2 % 4 == 0 && month2 <= 2) {
			daydiff = daydiff + 1;
		}  else if (year1 % 4 == 0 && month1 > 2){
			daydiff = daydiff + 1;
		}
		System.out.println("There are " + yeardiff + " year(s), " + monthdiff + " month(s), and " + daydiff + " day(s) between the two dates you have entered.");
		input.close();
	}

}
