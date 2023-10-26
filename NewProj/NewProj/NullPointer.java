package NewProj;

public class NullPointer {
	 public static void main(String[] args) {
	        String str = null;
	        
	        try {
	            int length = str.length(); 
	            System.out.println("String Length: " + length);
	        } catch (NullPointerException ex) {
	            System.err.println("NullPointerException caught: " + ex);
	        }
	    }

}
