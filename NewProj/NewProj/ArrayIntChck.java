package NewProj;

public class ArrayIntChck {
	
	public static void main(String[] args) {
        int[] array = {77, 77, 65, 65, 65, 77};
        boolean contains65 = false;
        boolean contains77 = false;

        for (int num : array) {
            if (num == 65) {
                contains65 = true;
            }
            if (num == 77) {
                contains77 = true;
            }
        }

        boolean result = contains65 && contains77;
        System.out.println("Result: " + result);
    }


}
