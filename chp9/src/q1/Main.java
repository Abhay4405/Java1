package q1;

interface A{
	void meth1();
}

abstract class B{
	abstract void meth2();
}

class C{
	void meth3() {}
}


public class Main {
	public static void main(String[] args) {
		A a = new A() {
			public void meth1() {
				System.out.println("Hii, I am method 1");
			}
		};
		B b = new B() {
			
			void meth2() {
				System.out.println("Hii, I am method 2");
			}
		};
		C c = new C() {
			void meth3() {
				System.out.println("Hii, I am method 3");
			}
		};
		a.meth1();
		b.meth2();
		c.meth3();
	}
}
