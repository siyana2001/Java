package NewProj;

import java.util.Scanner;

public class MinimumValue {



public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);



System.out.print("Enter the first number: ");

double number1 = scanner.nextDouble();



System.out.print("Enter the second number: ");

double number2 = scanner.nextDouble();



double minNumber = Math.min(number1, number2);



System.out.println("The minimum value between " + number1 + " and " + number2 + " is: " + minNumber);



scanner.close();

}

}