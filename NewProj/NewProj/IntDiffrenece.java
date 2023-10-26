package NewProj;

import java.util.Scanner;

public class IntDiffrenece {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input of 1st Integer:");
		int num1 = scanner.nextInt();
		
		System.out.println("Input of 2nd Integer:");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double avr =( num1 + num2 )/ 2;
		int dist = Math.abs(num1 - num2);
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		 
		
		System.out.println("The sum of integer:" + sum);
		System.out.println("The difference of integer:" + sub);
		System.out.println("The product of integer:" + mul);
		System.out.println("The average of integer:" + avr);
		System.out.println("The distance of integer:" + dist);
		System.out.println("Minimum integer:" + min);
		System.out.println("Maximum integer:" + max);
		
		
	}

}
