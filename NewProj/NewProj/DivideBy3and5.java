package NewProj;

public class DivideBy3and5 {
	public static void main(String args[]) {
		System.out.println("Divided by 3: ");
		for(int i=0; i<100; i++) {
			if(i % 3 == 0) {
			System.out.print(i +",");
		}
	}
	
	System.out.println("\n");
	
		System.out.println("Divided by 5: ");
		for(int i=0; i<100; i++) {
			if(i % 5 == 0) {
			System.out.print(i + ", ");
			
		}
			
		}
        System.out.println("\n");

		System.out.println("Divided by 3 & 5:");
		for (int i=0; i<100; i++) {
			if(i % 3== 0  && i % 5 == 0) {
			System.out.print(i + " ,");
		}
	
	}
  }
}