package NewProj;

import java.util.Scanner;

public class BioData {
	public static void main(String[]args) {
		Scanner myObj = new Scanner(System.in);
		 
		System.out.println("Enter your First name:");
		String name = myObj.next();
		
		
		System.out.println("Enter your Last name:");
		String lastname = myObj.next();
	
		
		System.out.println("Enter your Age:");
		int age = myObj.nextInt();
		
		 
		System.out.println("Enter your Address:");
		String address = myObj.next();
		myObj.nextLine();
		myObj.nextLine();
		myObj.nextLine();
		myObj.nextLine();
		
		System.out.println("Enter your Phone number");
	     long phn=myObj.nextLong();
	      
	 	System.out.println("Enter your CGPA");
		float cgpa=myObj.nextFloat();
		
		
		
		
		
	}

}



