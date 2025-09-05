package q6;

class Emp{
	int age = 25;
	String name = "Rajesh";
	 Emp methInfo() {
		return this;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", " + (name != null ? "name=" + name : "") + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.methInfo());
	}
}
