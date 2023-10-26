package NewProj;

import java.util.Scanner;

public class Matrix {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		 
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
		int i , j;
		System.out.println("Enter the first set of matrix:");
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				a[i][j] = myObj.nextInt();
			}
		}
		System.out.println("Enter the second set of matrix:");
		for(i=0; i<b.length; i++) {
			for(j=0; j<b[i].length; j++) {
				b[i][j] = myObj.nextInt();
			}
	}
		System.out.println("And the Addition of matrix is:");
		for(i=0; i<c.length; i++) {
			for(j=0; j<c[i].length; j++) {
				c[i][j] = a[i][j]+ b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
     }
	
}
}
