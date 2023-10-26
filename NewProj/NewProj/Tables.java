package NewProj;

import java.util.Scanner;

public class Tables {
	public static void main(String args []) {
		Scanner table = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = table.nextInt();
		
		   for (int i = 1; i <= 10; i++) {
	            int result = num * i;
	            System.out.println(num + " x " + i + " = " + result);
	        }
		
		
	}
	
}
