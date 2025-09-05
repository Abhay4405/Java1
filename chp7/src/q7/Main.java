package q7;

import java.lang.reflect.Method;

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
//		Method[] emp1 = emp.getClass().getMethods();
//		System.out.println(emp1);
//		System.out.println(emp.getClass().getDeclaredMethods());
		for(var a : emp.getClass().getMethods()) {
			System.out.println(a);
		}
	}
}
