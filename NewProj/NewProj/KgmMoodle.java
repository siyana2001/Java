package NewProj;

public class KgmMoodle {

   
    public int calculateWeight(int weightInKg) {
        
        int weightInGrams = weightInKg * 1000;
        return weightInGrams;
    }

    public static void main(String[] args) {
    
        KgmMoodle kgm = new KgmMoodle();

       
        int grams = kgm.calculateWeight(5); 

       
        System.out.println("Weight in grams: " + grams);
    }
}
