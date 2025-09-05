package q2;

class Parent{
	double height = 5.7;
	String behaviour = "Helpfull";
	Parent methQuality(){
	return this;
	}
	@Override
	public String toString() {
		return "Parent [height=" + height + ", " + (behaviour != null ? "behaviour=" + behaviour : "") + "]";
	}
}
class Child extends Parent{
	Child methQuality(){
	
		return this;
	}
}



public class Main {
	public static void main(String[] args) {
		Child child = new Child();
	System.out.println(	child.methQuality());
	}
}
