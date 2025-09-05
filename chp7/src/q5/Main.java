package q5;

class Emp{
	@Override
	public String toString() {
		return "Emp [id=" + id + ", salary=" + salary + "]";
	}
	int id;
	double salary;
	Emp(int id,double salary){
		this.id = id;
		this.salary = salary;
	}
	@Override
	protected void finalize() throws Throwable {

		System.out.println("Emp's object deleted");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(17, 90000.00);
		System.out.println(emp);
		emp = null;
		System.gc();
	}
}
