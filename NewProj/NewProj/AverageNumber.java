package NewProj;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String args []) {
		
		Scanner averages = new Scanner(System.in);
		
		System.out.println("Enter the three numbers:");
		double number1 = averages.nextDouble();
		double number2 = averages.nextDouble();
		double number3 = averages.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;
		System.out.println("The average of three numbers is : " + average);
		
				
	}
}