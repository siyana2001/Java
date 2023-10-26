package NewProj;

public class MethodOverloading {
	static int addMethod(int x, int y) {
		return x+y;
		}
	static double addMethod(double x ,double y) {
		return x-y;
	}
	static int addMethod(int x, int y, int z) {
		return x+y+z;
	}
	
	public static void main (String args[]) {
		int var1 = addMethod(3,5);
		double var2 =addMethod(3.0,4.9);
		int var3 =addMethod(27,23, 45);
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}

}



//public class Greeting {
//   
//    public void greet() {
//        System.out.println("Hello!");
//    }
//
//    
//    public void greet(String name) {
//        System.out.println("Hello, " + name + "!");
//    }
//
//    public static void main(String[] args) {
//        Greeting greeting = new Greeting();
//
//       
//        greeting.greet(); 
//        greeting.greet("Alice"); 
//    }
//}
