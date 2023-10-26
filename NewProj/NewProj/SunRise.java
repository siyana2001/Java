package NewProj;

import java.util.Scanner;

public class SunRise {
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the time to check parts of the day");
		int hour = myObj.nextInt();
		
		if(hour >= 6 && hour < 9) {
			System.out.println("Its reddish sunny , so Temperature is 21 degree");
		}
		
		else if(hour >= 10 && hour < 1) {
			System.out.println("Its  afernoon hot sunny , so Temperature is 81 degree");
		}
		  
		else if(hour >= 2 && hour < 5) {
			System.out.println("Its evening , so Temperature is 32 degree");
		}
		
		else if(hour >= 7 && hour <11) {
			System.out.println("Its night , so Temperature is 12 degree");
		}
		
		
		
	}
}

		
	
	