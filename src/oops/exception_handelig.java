package oops;

public class exception_handelig {
	public static void main(String[] args) {
		System.out.println("program sarted");
		int i=10;
		try 
		{
			System.out.println(i/0);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			}
		  System.out.println("program ended");
		
	}
}
