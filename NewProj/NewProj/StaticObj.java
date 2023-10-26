package NewProj;

public class StaticObj {

    static {
        System.out.println("This is the static block.");
    }

  
    {
        System.out.println("This is the instance initialization block.");
    }

    public StaticObj() {
        System.out.println("This is the constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method.");
        StaticObj obj1 = new StaticObj();
        StaticObj obj2 = new StaticObj();
    }
}

