package pack2;
class Salary2 extends com.hospital.staff.doctor.salary.Main{
	
	protected double calculateSalary(double amt, double tax) 
	{
		

	return amt + tax;  	 
	
	}
	
}

public class Main {
		public static void main(String[] args) {
			Salary2 salary2 = new Salary2();
			System.out.println(salary2.calculateSalary(40000, 4000));
		}
}
