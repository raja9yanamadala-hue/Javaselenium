package oops;

  /* ----> static varibles and methods are directly acsses with out create object.
     direct acsses used to the class name.
     
     ----> but non ststic varibles and methods acsses by useing create an object  
    
     -----> non static method direct acsses the anythig both stuff */
     
public class static_ {
	int b=22;
	static int a=33;
	
	static void m1() 
	{
	System.out.println("this is non static stuff");
	}
	static void m2() {
		System.out.println("this is static method");
	}
	
	// non static method
	void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) { 
		
		//  acsses the static stuff
		System.out.println(static_.a);
		static_.m1();
		
		//acsses the non static stuff
		static_ obj=new static_();
		System.out.println(obj.b);
		obj.m2();
		obj.m3();
	}

}
