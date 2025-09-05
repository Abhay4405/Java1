package Consumer;
import Provider.Company;
public class Main extends Company  {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee employee = new Employee();
		manager.sal(50000);
		employee.sal(45000, 1500);
	}
}
