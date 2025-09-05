package q3;

public class Main {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			String a = "xyz";
			int b = Integer.parseInt(a);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println(3);
			System.out.println(4);
		}
		

	}
}
