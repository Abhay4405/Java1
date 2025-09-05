package classPropogation2;


class A{
	void meth1() throws ArithmeticException{
		int aa = 4/0;
	}
}
class B {
	void meth2(){
		A a = new A() ;
		a.meth1();
	}
}
class C{
	void meth3() {
		B b = new B();
		try {
			b.meth2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		C c = new C();
		c.meth3();
	}
}
