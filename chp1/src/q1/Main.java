package q1;

class EMP{
	
	String name;
	int ID;
	double sal;
	String address;
	
	void displayInfo(){		
		System.out.println(name + " " + ID + " " + sal + " " + address);
	}

	@Override
	public String toString() {
		return "EMP [" + (name != null ? "name=" + name + ", " : "") + "ID=" + ID + ", sal=" + sal + ", "
				+ (address != null ? "address=" + address : "") + "]";
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		EMP emp = new EMP();
		emp.displayInfo();
		System.out.println(emp);
	}
}
