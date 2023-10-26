package NewProj;

import java.util.Scanner;



public class MultiPro {



    static int globalStaticVariable = 10;



    int instanceVariable;



    static {

        System.out.println("Static Initialization Block executed.");

    }



    {

        System.out.println("Instance Initialization Block executed.");

    }



    public MultiPro(int value) {

        this.instanceVariable = value;

        System.out.println("Constructor with a parameter executed.");

    }



    public void instanceMethod() {

        System.out.println("Instance method executed.");

    }



    public static void staticMethod() {

        System.out.println("Static method executed.");

    }



    public static void main(String[] args) {

        staticMethod();

        System.out.println("Accessing globalStaticVariable: " + globalStaticVariable);



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");

        int userInput = scanner.nextInt();



        MultiPro object = new MultiPro(userInput);

        object.instanceMethod();



        int result = calculateSquare(userInput);

        System.out.println("Square of " + userInput + " is: " + result);



        scanner.close();

    }



    public static int calculateSquare(int number) {

        return number * number;

    }

}
