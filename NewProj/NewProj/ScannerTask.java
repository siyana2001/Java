package NewProj;

import java.util.Scanner;

public class ScannerTask {
	public static void main (String args []) {
		Scanner mynum = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstnumber = mynum.nextInt();
		
		System.out.println("Enter the second number");
		int secondnumber = mynum.nextInt();
		
		int add = firstnumber + secondnumber;
		
		System.out.println("The sum of " + firstnumber + " and " + secondnumber + " is  "  + add);
		
	}
	

}
