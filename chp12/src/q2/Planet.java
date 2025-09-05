package q2;

public class Planet {
String name;
int position;
public Planet(String name, int position) {
	this.name = name;
	this.position = position;
}
@Override
public String toString() {
	return "Planet [" + (name != null ? "name=" + name + ", " : "") + "position=" + position + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPosition() {
	return position;
}
public void setPosition(int position) {
	this.position = position;
}
}
