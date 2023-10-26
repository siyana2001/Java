package NewProj;

public class Constructor {
	int rollno;
	String name;
	
	public  Constructor() {
		
		rollno = 23;
		name = "siyana";
	}
	 Constructor(int num, String data ){
		 rollno = num;
		 name = data;
	 }
	 
	 public static void main(String args[]) {
		 Constructor obj = new Constructor();
		 Constructor obj1 = new  Constructor();
		  System.out.println(obj.rollno);
		  System.out.println(obj.name);
		  System.out.println(obj1.rollno);
		  System.out.println(obj1.name);
		  
	 }
	
}
