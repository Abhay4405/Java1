package q5;
class Company{
	String name = "Mahindra";
	int salary;
	void setSalary(int salary) {
		this.salary=salary;
	}
}
class Employee extends Company{
	int getSalary() {
		System.out.println(super.name);
		super.setSalary(45000);
		return salary;
	}
	
}
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.getSalary());
	}
}
