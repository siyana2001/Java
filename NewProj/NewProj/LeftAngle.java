

package NewProj;

import java.util.Scanner;

public class LeftAngle {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		int i , j, row;
		
		System.out.println("Enter the number:");
		row = myObj.nextInt();
		 
		for(i=0; i<row; i++) {
			for(j=row; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}



