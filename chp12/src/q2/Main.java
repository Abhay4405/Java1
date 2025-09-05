package q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Mercury", 1);
		map.put("Venus", 2);
		map.put("Mars", 3);
		map.put("Jupiter", 4);
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
