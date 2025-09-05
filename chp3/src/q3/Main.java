package q3;

class Student1{
	
	void info(int age , String name , double marks) {}
	void info(String address , String hobbie) {}
	void info(int id) {}
}

class Student2 extends Student1{
	void info(int age , String name , double marks) {}
}


public class Main {
		public static void main(String[] args) {
			Student1 student1 = new Student1();
			Student2 student2 = new Student2();
			
			student1.info(19, "Abhay", 80);
			student1.info("Bhayander", "Rapping");
			student1.info(12);
			student2.info(20, "Sahil", 85);
		}
}
