package NewProj;

public class Matrix3row3col {
	  public static void main(String[] args) {
	        int rows = 3;
	        int columns = 3;

	        int[][] matrix1 = {
	            {1, 2, 3},
	            {1, 1, 1},
	            {1, 1, 1}
	        };

	        int[][] matrix2 = {
	        		{1, 2, 3},
		            {1, 1, 1},
		            {1, 1, 1}
	            
	        };

	        int[][] sumMatrix = new int[rows][columns];

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        System.out.println("Sum of matrices:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sumMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
