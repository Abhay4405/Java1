package classPropogation;

class A{
	void a() throws ClassNotFoundException{
		ClassNotFoundException e = new ClassNotFoundException();
		throw e;
	}
}
class B{
	void b()throws ClassNotFoundException {} //if a method calls another method that throws a checked exception, it must either handle that exception with a try-catch block or declare that it throws the exception itself.
}
class C{
	void c()throws ClassNotFoundException {}
}

public class Main {
	public static void main(String[] args) {
		try {
			ClassNotFoundException e = new ClassNotFoundException();
			throw e;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception handeled successfully");
		}
	}
}
