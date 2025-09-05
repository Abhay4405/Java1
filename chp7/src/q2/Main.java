package q2;
// Also the example of wrapper class
public class Main {
	public static void main(String[] args) {
		int a = 10;
		Integer aa = new Integer(a);  // Boxing
		Integer aaa = a; // AutoBoxing
		int l = aaa.intValue(); // UnBoxing
		int j = aa; // AutoUnboxing
	}
}
