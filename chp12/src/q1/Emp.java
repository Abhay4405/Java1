package q1;

public class Emp {
 int age;
 String name;
 double sal;
public Emp(int age, String name, double sal) {
	this.age = age;
	this.name = name;
	this.sal = sal;
}
@Override
public String toString() {
	return "Emp [age=" + age + ", " + (name != null ? "name=" + name + ", " : "") + "sal=" + sal + "]";
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
}
