package q2;

class Teacher{
	int id; 
	String department;
	double salary;
	
	 @Override
	public String toString() {
		return "Teacher [" + (department != null ? "department=" + department + ", " : "") + "id=" + id + ", salary="
				+ salary + "]";
	}

	void getInfo() {
		 System.out.println(id + department + salary);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
		
	}
}


public class Main {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		teacher = null;
		System.gc();
	}
}
