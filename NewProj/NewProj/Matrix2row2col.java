package NewProj;

public class Matrix2row2col { 
	    public static void main(String[] args) {
	        int rows = 2;
	        int columns = 2;

	        int[][] matrix1 = {
	            {2, 2},
	            {3, 3}
	        };

	        int[][] matrix2 = {
	            {3, 3},
	            {2, 2}
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


