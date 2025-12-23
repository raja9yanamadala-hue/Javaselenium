package oops;

/*
abstract method : abstract method haveing  only declaration but not implemantation.           
abstract method must be ends with semicolon.			
child class are responseblity for implemantation.

abstract calss :   it is a incomplete implemantation so it's dose not create an object.
it's contains zero or more number of abstract method and concrete methods. */

abstract class vehicals{
	public abstract int numofwheels();
}
class Bus extends vehicals{
	public int numofwheels() {
		return 6;
	}
}
class auto extends vehicals{
	public int numofwheels() {
		return 3;
	}
}

public class abstract_ex {

	public static void main(String[] args) {
		Bus b=new Bus ();
		System.out.println(b.numofwheels());
		auto a=new auto();
		System.out.println(a.numofwheels());
	}

}
