package oops;
   
// if you want the method varibles name is same as a varible name then we can 
  //differnciatd  to use  this keyword.

public class this_keyword {
	int a,b;
	void getvalues(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void printvalues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		this_keyword th=new this_keyword();
		th.getvalues(55, 44);
		th.printvalues();
	}

}
