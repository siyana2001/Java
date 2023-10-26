package NewProj;

public class FabinacciSeries {
	public static void main(String args[]) {
		int n = 10;
		int a = 0, b = 1;
      System.out.println("Fibonacci series up to " + n + " terms:");
   
        for(int i = 0; i< n; i++){
        	
        	System.out.println(a +" ");
        	int newNum = a+ b;
        	a = b;
        	b = newNum;
        }
	}	
    	}
    	
    	
    	
    	





