package oops;

public class this2 {
   int x=33;         // instance variable
   void sek() {
	   int x=44;      // local variable
	   System.out.println(x);
   }
	public static void main(String[] args) {
		
		this2 th= new this2();
		th.sek();
     
	}

}
