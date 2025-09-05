package q4;

class Emp{
	
	double sal(double sal) {
		return sal;
	}
	double sal(double sal,double tax) {
		return sal+tax;
		}
	double sal(double sal,double tax,double bonus) {
		return sal+tax+bonus;
	}
	
}


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
	System.out.println(	emp.sal(25000.00));
		System.out.println(emp.sal(25000.00, 3000.00));
	System.out.println(emp.sal(25000.00, 3000.00, 5000.00));
		
	}
}
