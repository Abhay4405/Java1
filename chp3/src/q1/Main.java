package q1;

class Emp{
	
	static String compName = "TCS";
	int id = 45;
	
	void displayInfo() {
		System.out.println(id + " " +compName);
	}
	static String displayInfo2() {
		return compName ;
	}
	
}


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayInfo();
		System.out.println(emp.displayInfo2());
	}
}
