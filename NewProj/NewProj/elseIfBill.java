package NewProj;

import java.util.Scanner;

public class elseIfBill {
	public static void main(String[]args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your unit:");
		int unit = myObj.nextInt();
	
		int billUnit =  3* unit;
		System.out.println("Bill Amount:  " + billUnit);
		
		if(billUnit>300) {
			System.out.println(" Please pay the money");
			
		}
		
		else {
			System.out.println("No need to pay");
		}
	}

}
