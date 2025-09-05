package q5;

class Outer{
	void outermeth() {
		class Inner {
			void innermeth() {
				System.out.println("My name is Abhay");
			}
		}
		Inner inner = new Inner();
		inner.innermeth();
	}
}

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outermeth();
	}
}
