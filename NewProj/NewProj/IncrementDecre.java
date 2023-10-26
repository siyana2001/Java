package NewProj;

public class IncrementDecre {
	public static void main(String args[]) {
		int a = 2;
		
		int preIncrementResult = ++a; 
        int postIncrementResult = a++; 
        int preDecrementResult = --a; 
        int postDecrementResult = a--;
        
        System.out.println(preIncrementResult);
        System.out.println(postIncrementResult);
        System.out.println(preDecrementResult);
        System.out.println(postDecrementResult);

        
	}
}
