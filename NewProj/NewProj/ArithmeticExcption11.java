package NewProj;

public class ArithmeticExcption11 {
	public static void main(String[] args) {
        
       

        try {
        	int num = 10/0;
            System.out.println("Result: " + num );
        }
        
        catch (ArithmeticException e) {
            System.out.println("caught");
        }
        
        System.out.println("hello");
    }
}
