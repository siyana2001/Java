package NewProj;

import java.util.Scanner;

public class MaximumValue {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);



System.out.print("Enter the first number: ");

double number1 = scanner.nextDouble();



System.out.print("Enter the second number: ");

double number2 = scanner.nextDouble();



double maxNumber = Math.max(number1, number2);



System.out.println("The maximum value between " + number1 + " and " + number2 + " is: " + maxNumber);



scanner.close();

}

}


