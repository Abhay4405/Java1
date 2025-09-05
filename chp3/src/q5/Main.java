package q5;

class Emp{
	String name = "Rajesh";
	static int id = 21;
	void accessVariables(){
		int age = 29 ;
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
	
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.accessVariables();
	}
}
