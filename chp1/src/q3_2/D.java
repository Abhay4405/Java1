package q3_2;
import q3.*;
public class D {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.data1);
//		System.out.println(a.data2);  
//		System.out.println(a.data3); Protected members are accessible in other package but only in the child class.
//		System.out.println(a.data4); Default members are not accessible outside the package
	}
}

class E extends A{
	E e = new E();
	public static void main(String[] args) {
		 E e = new E();
		System.out.println(e.data1);
//		System.out.println(e.data2);  
		System.out.println(e.data3);
//		System.out.println(e.data4);
	}
}