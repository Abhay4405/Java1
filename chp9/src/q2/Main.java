package q2;
interface A{
	void meth1();
}
abstract class B{
	abstract void meth2();
}
class C{
	void meth3() {
		System.out.println("Hii, I am method 3");
	}
}
class D{
	A a ;
	B b ;
	C c ;
	void meth4() {
		a = new A() {
			public void meth1() {
				System.out.println("Hii, I am method 1");
			}
		};
		b = new B () {
			void meth2() {
				System.out.println("Hii, I am method 2");
			}
		};
		c = new C() {};
		
		a.meth1();
		 b.meth2();
		 c.meth3();
	}
	
}


public class Main {
	public static void main(String[] args) {
		
		D d = new D();
		d.meth4();
	}

}
