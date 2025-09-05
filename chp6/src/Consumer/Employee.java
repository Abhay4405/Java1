package Consumer;
import Provider.Company;
public class Employee extends Company  {
	public void sal(double sal,double tax) {
		System.out.println(sal);
		System.out.println(tax);
	}
}
