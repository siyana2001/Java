package NewProj;

class MyClass {
    private int value;

    public MyClass() {
        this(0);
    }

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class ThisMoodle {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(42);

        System.out.println("obj1's value: " + obj1.getValue());
        System.out.println("obj2's value: " + obj2.getValue());
    }
}


