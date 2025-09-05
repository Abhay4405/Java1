	package q6;
	
	class Hobbie{
		String h1 = "dancing";
		String h2 = "reading";
		void methHob() {
			System.out.println(h1);
			System.out.println(h2);
		}
	}
	class Info{
		int id = 26;
		String address = "Delhi";
		String name = "Abhay";
		int age = 20;
			 void methInfo() {
			 System.out.println(id);
			 System.out.println(address);
			 
		 }
			 void methInfo2() {
				 System.out.println(name);
				 System.out.println(age);
			 }
	}
	class Student{
		Hobbie hobbie;
		Info info;
		
		void abc() {
			hobbie = new Hobbie();
			info = new Info();
			
			}
	
		 void displayInfo() {
			hobbie.methHob();
			info.methInfo();
		}
	}
	
	
	public class Main {
		public static void main(String[] args) {
			Student student = new Student();
			student.abc();
			student.displayInfo();	
			
		}
	}
