package q3;
class Outer{
	private int a = 10;
	public Object inner;
	class Inner{
		void meth() {
			System.out.println(a);
		}
	}
}
public class Main {
	public static void main(String[] args) {
	
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.meth();
			
}
}
