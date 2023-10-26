package NewProj;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInt {

	public static void main(String args[]) {
		
		ArrayList<Integer> arrint = new ArrayList<>();
		
		arrint.add(100);
		arrint.add(400);
		arrint.add(900);
		arrint.add(1600);
		
		System.out.println(arrint);
		
		ArrayList<String> arr1int = new ArrayList<>();
		arr1int.add("ravi");
		arr1int.add("saas");
		arr1int.add("ravi");
		arr1int.add("deen");
		
		System.out.println(arr1int);
		
		ArrayList<Object> ob = new ArrayList<>();
		
		ob.add("siyana");
		ob.add("roll no: 30");
		ob.add("Maths Mark:");
		ob.add(98);
		ob.add("Science Mark:");
		ob.add(89);
		ob.add("Social Mark:");
		ob.add(88);
		

		System.out.println(ob);
		System.out.println(ob.size());
		System.out.println(ob.get(0));
		System.out.println(ob.set(3, "english mark: 86" ));
		System.out.println(ob);
		
		
		ArrayList<String> stt =new ArrayList<>();
		stt.add("haii");
		stt.add("heyy");
		stt.add("heee");
		System.out.println(stt);
		
		Iterator<String> st = stt.iterator();
		
		while(st.hasNext()) {
			System.out.println(st.next());
		}
			
		Iterator<Integer> inr= arrint.iterator();
		while(inr.hasNext()) {
			System.out.println(inr.next());
		}
		
	}

	
}
