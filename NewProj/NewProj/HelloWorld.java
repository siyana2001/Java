package NewProj;

public class HelloWorld {
	public static void main(String args[]) {
		int x=10;
		int y=20;
		 int addResult = x + y;
	        System.out.println("Addition: " + addResult);


	        int subResult = x - y;
	        System.out.println("Subtraction: " + subResult);
	        
	        int multiResult = x * y;
	        System.out.println("Multipilication:" + multiResult);
	        
	        int divisionResult = x / y; 
	        System.out.println("Division: " + divisionResult);
	        
	        
	        int modulusResult = x % y; 
	        System.out.println("Modulus: " + modulusResult);
	        
	        
	        boolean value1 = (x > 10) && (y < 20);
	        boolean value2 = (x > 10) || (y < 20);
	        boolean value = (x > 10) && (y < 20);

	        System.out.println("value1 (x > 5) && (y < 30): " + value1);
	        System.out.println("value2 (x > 15) || (y < 15): " + value2);
	        System.out.println("value3 !(x == y): " + value);
	                                                              
	   
	      
	}

}
