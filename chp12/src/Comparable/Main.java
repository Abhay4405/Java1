package Comparable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Space implements Comparable<Space>
{
	
	String name;
	int position; //From Sun
	
	public Space(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public int compareTo(Space space) {
		return this.position - space.position; // Ascending sorting
	}
	
	
	@Override
	public String toString() {
		return "Space [" + (name != null ? "name=" + name + ", " : "") + "position=" + position + "]";
	}
	


}
public class Main {
	public static void main(String[] args) {
		
		List<Space> list = new ArrayList<Space>();
		list.add(new Space("Earth",3));
		list.add(new Space("Mercury",1));
		list.add(new Space("Uranus",7));
		list.add(new Space("Mars",4));
		list.add(new Space("Jupiter",5));
		list.add(new Space("Saturn",6));
		list.add(new Space("Neptune",8));
		list.add(new Space("Venus",2));
		System.out.println(list + "Before sorting");
		
		Collections.sort(list);
		
		System.out.println(list + "After sorting");
	}
}
