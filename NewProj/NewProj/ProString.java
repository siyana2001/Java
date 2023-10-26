package NewProj;

public class ProString {
	public static void  main (String args[]) {
//		String alphabets = "abcdefghijklmnopqrstuvwxyz";
//		System.out.println(alphabets.length());
//	
	
 String  name ="computer";
 String name1 = "center";
 String name2 = "computer";
 
 String myObj = new  String("hello"); 
 System.out.println(myObj.length());

 System.out.println(name.length());

 System.out.println(name.endsWith("r"));
 System.out.println(name1.isEmpty());
 System.out.println(name2.toUpperCase());
 System.out.println(name2.toLowerCase());
 System.out.println(name);
 System.out.println(name.charAt(3));
 System.out.println(name.concat(name1));
 System.out.println(name.equals(name1));
 System.out.println(name.isEmpty());
 System.out.println(name.isBlank());
 System.out.println(name.substring(0,5));
 System.out.println(name.replace("co" , "CO"));
 System.out.println(name.replace("computer", "mobile phone"));
 
 
 
 String myplace = "im living in chennai";
 
 System.out.println(myplace.replaceAll(name2, myplace));
 System.out.println(name1.compareTo(name2));
 System.out.println(myplace.trim());

 String world="world needs \"peace\"for";
 System.out.println(world); 
 
	}

	
}
