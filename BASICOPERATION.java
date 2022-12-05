package attendance;

import java.util.Scanner;

public class conditional {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

			System.out.println("Enter year: ");
			int year = scan.nextInt();

			if (year % 100 == 0) {
			   System.out.println(year + " is not a leap year.");
			}

			else if (year % 4 == 0) {
			   System.out.println(year + " is a leap year.");
			}

			else {
			  System.out.println(year + " not a leap year");
			}
		 
			return;
		 }
		
	}
