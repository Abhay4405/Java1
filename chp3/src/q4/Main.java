package q4;

class Emp{
	
	private double salary ;
	private int age ;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setSalary(250000);
		emp.setAge(35);
		System.out.println(emp.getSalary());
		System.out.println(emp.getAge());
	}
}
