package oops.encapsulation;
class encap{
private int id;
private String empname;
private double salary;
private int age;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}

public class encapsulation_demo {

	public static void main(String[] args) {
		encap en=new encap();
        en.setAge(44);
        en.setId(324);
        en.setSalary(33.33);
        en.setEmpname("sekhar");
        System.out.println(en.getAge());
        System.out.println(en.getEmpname());
        System.out.println(en.getId());
        System.out.println(en.getSalary());
	}

}
