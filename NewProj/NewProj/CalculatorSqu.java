package NewProj;

import java.util.Scanner;



public class CalculatorSqu {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter the number to be squared: ");

        double number = scanner.nextDouble();



        double result = Math.pow(number, 2);



        System.out.println(number + "^2 = " + result);



        scanner.close();

    }

}


