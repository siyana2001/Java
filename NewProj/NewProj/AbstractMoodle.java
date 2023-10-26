package NewProj;


abstract class Kgm {
  
    public abstract void development();
    public abstract void fullStack();

    public void commonMethod() {
        System.out.println("To All Kgm developers.");
    }
}
public class AbstractMoodle {
	public static void main(String[] args) {
        Kgm developer = new Kgm() {
            @Override
            public void development() {
                System.out.println("Development tasks.");
            }

            @Override
            public void fullStack() {
                System.out.println("Full-stack development.");
            }
        };

        developer.development();
        developer.fullStack();
        developer.commonMethod();
    }

}
