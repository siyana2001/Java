package NewProj;

class parent{
	void display() {
		System.out.println("motherr");
	}
}
class childd extends parent{
	void display() {
  		super.display();
		System.out.println("Children");
		
	}
}

public class MethodOverride {
	public static void main(String arge[]) {
		childd myObj = new childd();
		myObj.display();
		
	}

}
