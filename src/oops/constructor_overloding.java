package oops;

public class constructor_overloding {
	
	constructor_overloding(int a,int b)
	{
	System.out.println(a+b);	
	}
	constructor_overloding(int a,double b)
	{
	System.out.println(a+b);	
	}
	constructor_overloding(float a,float b)
	{
	System.out.println();	
	}
	public static void main(String[] args) {
	
		constructor_overloding over=new constructor_overloding(66,44);
		
	}

}
