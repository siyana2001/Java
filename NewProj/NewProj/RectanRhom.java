package NewProj;

import java.util.Scanner;

class geometry {
	static double recarea;
	static double rhomarea;
	
	
	static void calcurectangle(double length, double width) {
		recarea = length * width;
	}
	
	static void calcurhombus(double length1, double width1) {
		rhomarea = (length1 * width1)/ 2;
	}
	
	
}
 
public class RectanRhom {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		double length = scanner.nextDouble();
		
		System.out.println("Enter the width of the rectangle");
		double width = scanner.nextDouble();
		geometry.calcurectangle(length, width);
		
		
		
		System.out.println("Enter the length of the rhombus");
		double length1 = scanner.nextDouble();
		
		System.out.println("Enter the width of the rhombus");
		double width2 = scanner.nextDouble();
		geometry.calcurhombus(length1, width2);
		
		System.out.println("Area of rectangle is :" + geometry.recarea);
		System.out.println("Area of rectangle is :" + geometry.rhomarea);
		
		
	}

}
