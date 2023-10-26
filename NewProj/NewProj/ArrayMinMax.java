package NewProj;

public class ArrayMinMax {
	
	   public static void main(String[] args) {
	        int[] array = {5, 7, 2, 4, 9};

	        if (array.length >= 1) {
	            int min = array[0];
	            int max = array[0];

	           
	            for (int i = 1; i < array.length; i++) {
	                if (array[i] < min) {
	                    min = array[i];
	                }
	                if (array[i] > max) {
	                    max = array[i];
	                }
	            }

	            int difference = max - min;
	            System.out.println("Difference between the largest and smallest values of the array: " + difference);
	        } else {
	            System.out.println("The array must have at least one element.");
	        }
	    }
}
