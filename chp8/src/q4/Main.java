package q4;

class Kid extends Exception{
	
	Kid(){
		
		super("Person is a kid"); // Constructor chaining #Doubt
				
	}
}

class Age{
	
	int age = 18;
		void PersonAge(int age)throws Kid{
			if (this.age > age) {
				throw new Kid();
			}
			else {
				System.out.println("Person is adult");
			}
		}
}
public class Main {
	public static void main(String[] args) {
		Age age = new Age();
		try {
			age.PersonAge(17);
			
		} catch (Exception e) {
			System.out.println(e);		}
	}
}
