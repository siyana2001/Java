package NewProj;

public class ArrayIndxs {

	
	 public static void main(String[] args) {
	        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	        int target = 25;

	        int index = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Index of " + target + " is: " + index);
	        } else {
	            System.out.println(target + " not found in the array.");
	        }
	    
}
}
