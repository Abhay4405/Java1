package Reflection;

class Emp{
	int id;
	int age;
	String name;
	String address;
	void methInfo() {
		System.out.println(id + age + name + address);
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", age=" + age + ", " + (name != null ? "name=" + name + ", " : "")
				+ (address != null ? "address=" + address : "") + "]";
	}
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		for(var a : emp.getClass().getMethods()) {
			System.out.println(a);
		}
	}
}