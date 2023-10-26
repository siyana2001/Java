package NewProj;

public class SpringProj2Buffer {
	
	public static void main (String args []) {
		 
		StringBuffer str = new StringBuffer ("welcome ");
		
		 System.out.println(str.append("Not welcome "));
		 System.out.println(str);
		 System.out.println(str.insert(0," hai " ));
		 System.out.println(str.replace(0, 1, "like"));
		 System.out.println(str.length());
		 System.out.println(str.subSequence(0, 2));
		 System.out.println(str.charAt(0));
		 
	
	
	}

}
