package q2;

class Emp{
	
	static int age;
	String name;
	
	static void meth1(){
		System.out.println(age);
//		System.out.println(name); non static variables cannot be shared to static method
	}
	
	void meth2(){
		System.out.println(name);
		System.out.println(age);
	}
	}
	


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Emp.meth1();
		emp.meth2();
	}
}
