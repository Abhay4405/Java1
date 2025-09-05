package methodPropogation;

class Emp{
	void a() {
	String s = null;
	   System.out.println(s.length());
	}
	void b() {
		a();
	}
	void c() {
		try {
			b();
			}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception handeled");
		}
	}
}


public class Main {
	public static void main(String[] args) {
		Emp ob = new Emp();
		ob.c();
	}
}
