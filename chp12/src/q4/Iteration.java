package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


class Planets{
	
	String name;
	int Position;
	public Planets(String name, int position) {
		this.name = name;
		Position = position;
	}
	@Override
	public String toString() {
		return "Planets [" + (name != null ? "name=" + name + ", " : "") + "Position=" + Position + "]";
	}
	
}
public class Iteration {
	public static void main(String[] args) {
		Planets p1 = new Planets("Mercury", 1);
		Planets p2 = new Planets("Venus", 2);
		Planets p3 = new Planets("Earth", 3);
		Planets p4 = new Planets("Mars", 4);
		Planets p5 = new Planets("Jupiter", 5);
		Planets p6 = new Planets("Saturn", 6);
		Planets p7 = new Planets("Uranus", 7);
		Planets p8 = new Planets("Neptune", 8);
		
		List<Planets> list = new ArrayList<Planets>();
		
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p5);
			list.add(p6);
			list.add(p7);
			list.add(p8);           
		System.out.println("By for each loop");
			for (Planets planets : list) {		// With for each loop
				System.out.println(planets);
			}
			
		System.out.println("By iterator");
			Iterator<Planets> itr = list.iterator();	//With iterator
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		System.out.println("By listIterator");
		ListIterator<Planets> Li = list.listIterator();	//With listiterator
		while (Li.hasNext()) {
			Planets s = Li.next();
			System.out.println(s);
			
		}
		
		System.out.println("By Enumerator");
		Enumeration<Planets> enu = Collections.enumeration(list); //With Enumarator
		while (enu.hasMoreElements()) {
			Planets planets = enu.nextElement();
			System.out.println(planets);
		}
		
	}
}
