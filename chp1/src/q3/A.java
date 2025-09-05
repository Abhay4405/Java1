package q3;

public class A {
		public int data1 = 10; // Accessible anywhere.
		private int data2 = 20; //Only accessible within the class.
		protected int data3 = 30; //Accessible within the package and in the child class of another package.
		int data4 = 40; // Accessible only in the class.
		public static void main(String[] args) {
			A a = new A();
			System.out.println(a.data1);
			System.out.println(a.data2);  // All access specifiers are accessible in the class.
			System.out.println(a.data3);
			System.out.println(a.data4);
		}
}
class B extends A {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.data1);
//		System.out.println(b.data2); A private member cannot be accessed outside the class(neither in the child class).
		System.out.println(b.data3);
		System.out.println(b.data4);
	}
}

class C{
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.data1);
//		System.out.println(a.data2);  
		System.out.println(a.data3);
		System.out.println(a.data4);
	}
}

