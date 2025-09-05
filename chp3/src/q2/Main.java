package q2;

class Emp{
	
	double salary;
	int id;
	String name;
	public Emp(double salary,int id, String name) {
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [salary=" + salary + ", id=" + id + ", " + (name != null ? "name=" + name : "") + "]";
	}
}


public class Main {
public static void main(String[] args) {
	Emp emp = new Emp(50000, 24, "Rajeev");
	System.out.println(emp);
}
}
