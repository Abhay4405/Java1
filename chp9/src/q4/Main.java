package q4;
class Outer{
	static private int a = 10;
	static class Inner{
		static void meth() {
			System.out.println(a);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer.Inner();
		Outer.Inner.meth();
	}
}
