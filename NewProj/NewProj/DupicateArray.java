package NewProj;

import java.util.HashSet;

public class DupicateArray {

	
	 public static void main(String[] args) {
	        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};

	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int value : array) {
	            if (!set.add(value)) {
	               
	                duplicates.add(value);
	            }
	        }

	        System.out.print("Duplicate Element(s) is/are: ");
	        for (int duplicate : duplicates) {
	            System.out.print(duplicate + " ");
	        }
	    }
	}


