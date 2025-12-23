package oops;

//-----> super key ----->

// -->  super can be used to refer immediate parent class instance.
//-->  super can be used invoke immediate parent class method.
// ---> super() can be used invoke immediate parent class constructor.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat()
{System.out.println("eating bread...");
}  
void bark()
{System.out.println("barking...");
}  
void work(){  
super.eat();  
bark();  
}  
}  

public class super_key {

	public static void main(String[] args) {
		Dog d=new Dog();  
		d.work();  
}

}
