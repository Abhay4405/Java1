package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Solar {
	
	String name;
	int position;
	public Solar(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Solar [" + (name != null ? "name=" + name + ", " : "") + "position=" + position + "]";
	}

	
	
}

		class CompSort implements Comparator<Solar>{
			public int compare(Solar s1 , Solar s2) {
				if ((s1.position) < s2.position) {
					return 1;
				}
				if ((s1.position) > s2.position) {
					return -1;
				}
				else
					return 0;
			}
		}


public class Main {
	public static void main(String[] args) {
		List<Solar> list = new ArrayList<Solar>();
		list.add(new Solar("Earth",3));
		list.add(new Solar("Mercury",1));
		list.add(new Solar("Uranus",7));
		list.add(new Solar("Mars",4));
		list.add(new Solar("Jupiter",5));
		list.add(new Solar("Saturn",6));
		list.add(new Solar("Neptune",8));
		list.add(new Solar("Venus",2));
		
		System.out.println(list);
		
		Collections.sort(list,new CompSort());
		System.out.println(list);
	}
}
