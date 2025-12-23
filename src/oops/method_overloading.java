package oops;


/* writing two or more number of methods in same class such away that each mathod
      has same name but different parameters. */

public class method_overloading {
	public int addition(int a,int b) {
		 return (a+b);
	}
	
	public double addition (double a,double b) {
		return (a+b);
	}
	
     public static void main(String[] args) {
    	 method_overloading demo =new method_overloading();
    	 int result=demo.addition(33,55);
    	 double result2=demo.addition(3.3,4.4);
    	 System.out.println(result);
    	 System.out.println(result2);

		

	}

}
