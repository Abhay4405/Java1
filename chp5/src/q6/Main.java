package q6;
abstract class Com{
	double sal;
	double tax;
	double bonus;
	  abstract void methSal(double sal,double tax,double bonus) ;
}
class EMP extends Com{
	void methSal(double sal, double tax, double bonus) { //Single level Inheritance
		System.out.println(sal + tax + bonus);
	}
}
class Manager extends Com{
	void methSal(double sal, double tax, double bonus) { //Hierarchical Inheritance
		System.out.println(sal + tax + bonus);
}
	void serve() {
	
	}
}
class Costumer extends Manager{
	void serve() {
		System.out.println("Fullfilling the need os costumers");//Multilevel Inheritance
	}
}
	

public class Main {
	public static void main(String[] args) {
		EMP emp = new EMP();
		Manager manager = new Manager();
		Costumer costumer = new Costumer();
		emp.methSal(50000,2500,5000);
		manager.methSal(200000, 10000, 5000);
		costumer.serve();
		
}
}
