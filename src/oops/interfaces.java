package oops;
/*  
 ---> interfaces is a collection of abstract methods.
 
 ---> interfaces contains variables and methods 
  
 ---> interfaces can not be object creation is not posible.
  
 ----> interfaces are useing implements keyword . it used to extend the one class to
        onther.
 ----> a class can implements any number of interfaces.       
 */

interface myinterfaces{   // interfaces
	int x=199;             // variable
	void m1();             // abstract methods
}
interface myinterfaces22{   // interface2
	int y=1777;             // variable2
	void m2();             // abstract methods2
}
public class interfaces implements myinterfaces,myinterfaces22 {
	public void m1() {
		System.out.println("wellcome");}
		public void m2() {
			System.out.println("wellcome33");
	}
	public static void main(String[] args) {
		interfaces vd=new interfaces();
		vd.m1();
		vd.m2();
System.out.println(x);
System.out.println(y);
	}

}
