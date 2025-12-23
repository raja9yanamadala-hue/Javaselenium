package Strings;

public class Steing2 {

	public static void main(String[] args) {
   
		
		//charAt()
		String s="raja sekhar";
		System.out.println(s.charAt(7));
		
		//contains()
		System.out.println(s.contains("raj"));
		
		
		// comparing string eqauls or not
		System.out.println(s.equals("sekhar"));
		
		
		// equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase("Raja sekhar"));
		
		//replace()	
		System.out.println(s.replace("r","k"));
		System.out.println(s.replaceAll("raja", "chandra"));
		
		//subString()
		System.out.println(s.substring(0, 3));
        
		// converting string
		System.out.println(s.toUpperCase());
	
	}

}
