package NewProj;

import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int i, j, k, row;

        System.out.println("Enter the number:");
        row = myObj.nextInt();
        for (i = 1; i <= row; i++) {
          
        	
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            
          
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
    
            System.out.println();
        }
    }
}
