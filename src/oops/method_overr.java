package oops;



class parent1{
	void info1() {
		System.out.println("parent class");
	}
}
	class child1 extends parent1{
		void info1() {
			System.out.println("child1 class");
		}
	}
	class child2 extends parent1{
		void info1() {
			System.out.println("child2 class");
		}

	}

public class method_overr {

	public static void main(String[] args) {
		parent1 p1=new child1();
		p1.info1();
		parent1 p2=new child2();
		p2.info1();

	}

}
