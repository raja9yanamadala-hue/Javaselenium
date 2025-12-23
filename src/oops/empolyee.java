package oops;

public class empolyee {
	int id;
	 int sal;
	 String name;
	 String dep;
	 
	 void display() {
		 System.out.println(id);
		 System.out.println(sal);
		 System.out.println(name);
		 System.out.println(dep);

	 }
	 public static void main(String[] args) {
		 empolyee emp1=new empolyee();
		 emp1.id=234;
		 emp1.sal=34000;
		 emp1.name="sekhar";
		 emp1.dep="electrical";
		 emp1.display();
	}
}
