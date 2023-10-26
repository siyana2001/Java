package NewProj;

public class ReverseArray {
	 public static void main(String[] args) {
	        int[] originalArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

	        int length = originalArray.length;
	        int[] reversedArray = new int[length];

	     
	        for (int i = 0; i < length; i++) {
	            reversedArray[i] = originalArray[length - 1 - i];
	        }

	    
	        System.out.println("Original Array: " + arrayToString(originalArray));
	        System.out.println("Reverse Array: " + arrayToString(reversedArray));
	    }

	    public static String arrayToString(int[] arr) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < arr.length; i++) {
	            result.append(arr[i]);
	            if (i < arr.length - 1) {
	                result.append(", ");
	            }
	        }
	        return result.toString();
	    }
	}


