package NewProj;

import java.util.Scanner;

public class Switch {
	    public static void main(String[] args) {
	        
	    	  Scanner myObj = new Scanner(System.in);

	          System.out.println("Enter the number in week(1 to 7):");
	          int day = myObj.nextInt();
	        
	        switch (day) {
	            case 1:
	                System.out.println("It's Sunday!");
	                break;
	            case 2:
	                System.out.println("It's Monday!");
	                break;
	            case 3:
	                System.out.println("It's Tuesday!");
	                break;
	            case 4:
	                System.out.println("It's Wednesday!");
	                break;
	            case 5:
	                System.out.println("It's Thursday!");
	                break;
	            case 6:
	                System.out.println("It's Friday!");
	                break;
	            case 7:
	                System.out.println("It's Saturday!");
	                break;
	            default:
	                System.out.println("Invalid day of the week.");
	                break;
	        }
	    }
	}



