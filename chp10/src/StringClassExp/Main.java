package StringClassExp;

public class Main {
	public static void main(String[] args) {
	
	String a = "Abhay ";
	String b = "Sahil";
	int c = 77;
	String d = "65";
	
		System.out.println(a.length());
		System.out.println(a.compareTo(b));
		System.out.println(a.concat(b));
		System.out.println(a.trim());
		System.out.println(a.replace("a","w"));
	
		String s = String.valueOf(c);
		System.out.println(s + 8);
		Integer i = Integer.parseInt(d);
		System.out.println(i + 6);
		
}
}
