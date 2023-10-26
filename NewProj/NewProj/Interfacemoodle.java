package NewProj;
interface Kgm1 {
 void development();

 int students = 5;
}

class Kgisl implements Kgm1 {
 public void development() {
     System.out.println("Kgisl is focused on development.");
 }

 public void arts() {
     System.out.println("Kgisl offers arts programs.");
 }

 public void engineering() {
     System.out.println("Kgisl offers engineering programs.");
 }
 
}
interface Kgcas {
 void bsc();
}

public class Interfacemoodle{
 public static void main(String[] args) {
     Kgisl kgisl = new Kgisl();

   
     kgisl.development();
     
     System.out.println("Number of students: " + Kgm1.students);

     kgisl.arts();
     kgisl.engineering();
 }
}
