package q1;

public class Main {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
	
		try {
			int arr[] = new int[4];
			arr[6] = 54;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(3);
		System.out.println(4);
	}
}
