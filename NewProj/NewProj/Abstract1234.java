
package NewProj;

abstract class Goaa{
	abstract void vacation();
}

abstract class Tour extends Goaa{
	void  vacation() {
		System.out.println("happy holidayy");
		
	}
	
abstract void ooty();
}
public class Abstract1234 extends Tour{

	@Override
	void ooty() {
		System.out.println("My Trip");
	}
	
public static void main(String args[]) {
	Abstract1234 obs = new Abstract1234();

	obs.vacation();
	obs.ooty();
}



}

