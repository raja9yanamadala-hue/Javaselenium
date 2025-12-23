package oops;


// constructor is spicial tye of mathod
// it name similar to the class name
// its not return any value even void also
// its used for initialize the class  variables

public class constractor {
  int roolno;
  String name;
  char grade;
  
  constractor(int sno,String sname,char g){
   roolno=sno;
   name=sname;
   grade=g;
  }
  void display() {
	  System.out.println(roolno+ " "+name+" "+grade);
  }
	public static void main(String[] args) {
		constractor stu3=new constractor(101,"sek",'a');
		stu3.display();

	}
  
}
