package q5;
 class Emp1{
	 
	 double sal(double sal,double tax) {
			return sal+tax;
	 }
 }
 class Emp2 extends Emp1{
		 
	 double sal(double sal,double tax) {
				return sal+tax;
	 }
	 }
 class Emp3 extends Emp1{
			 
	 double sal(double sal,double tax) {
					return sal+tax;
	 } 
		 }
public class Main {
		public static void main(String[] args) {
			Emp1 emp1 = new Emp1();
			Emp2 emp2 = new Emp2();
			Emp3 emp3 = new Emp3();
			System.out.println(emp1.sal(25000, 3000));
			System.out.println(emp2.sal(40000, 5000));
			System.out.println(emp3.sal(35000, 4000));
		}
}
