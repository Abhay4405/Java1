package q3;

class Emp implements Cloneable{
	int id;
	int age;
	String address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();	
	try {
		emp.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
