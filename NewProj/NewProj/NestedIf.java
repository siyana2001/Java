package NewProj;

import java.util.Scanner;

public class NestedIf {
    public static void main(String args[]) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = myObj.nextInt();

        System.out.println("Enter your weight:");
        int weight = myObj.nextInt();

        if (age >=18) {
            if (weight > 55) {
                System.out.println("You're eligible for donating blood.");
            } else {
                System.out.println("Your weight is not eligible for donating blood.");
            }
        } else {
            System.out.println("Your age is less than 18.");
        }
        
       
    }
}
