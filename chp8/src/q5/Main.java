package q5;
//MultiCatchBlock
public class Main {
	public static void main(String[] args) {
		try {
		int a = 10/0;
		int[] arr = new int[8];
		arr[8] = 445;
		String s = null;
		System.out.println(s.length());
			
		}
		catch( ArithmeticException e) {
			System.out.println(e);
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
