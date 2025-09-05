package q3;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Property {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("Username", "AbhayDubey");
		prop.setProperty("Password", "abhay@123"); //storing info
		System.out.println(prop);
		
		String s1 = prop.getProperty("Username");
		String s2 = prop.getProperty("Password"); //accessing it
		System.out.println(s1);
		System.out.println(s2);
		
		prop.setProperty("Password", "Dubey@123"); // updating
		System.out.println(prop); 
		
		prop.remove("Username");  //deletion
		System.out.println(prop);
		
		for(String str : prop.stringPropertyNames()) { // accessing through for each loop
			System.out.println(prop.getProperty(str));
		}
		 Set<?> set = prop.keySet(); // ? is a wildcard and represents unknown type
		Iterator<?> itr = set.iterator(); // Acccessing through set as map is not the part of collctions
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
